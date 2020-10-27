package org.dubbo.server.impl;

import cn.mt.xy.iface.MchtInfoServer;
import cn.mt.xy.iface.OprInfoServer;

public class SimpleBeanMcht implements MchtInfoServer{

	private OprInfoServer oprInfoServer;
	
	@Override
	public String getMchtNm(String mchtNo) {
		// TODO Auto-generated method stub
		System.out.println(oprInfoServer.getOpr());
		return "旺旺";
	}

	public OprInfoServer getOprInfoServer() {
		return oprInfoServer;
	}

	public void setOprInfoServer(OprInfoServer oprInfoServer) {
		this.oprInfoServer = oprInfoServer;
	}

}
