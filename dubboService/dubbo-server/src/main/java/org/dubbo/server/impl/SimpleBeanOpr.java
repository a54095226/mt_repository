package org.dubbo.server.impl;

import cn.mt.xy.iface.MchtInfoServer;
import cn.mt.xy.iface.OprInfoServer;

public class SimpleBeanOpr implements OprInfoServer{

	private MchtInfoServer mchtInfoServer;
	
	@Override
	public String getOpr() {
		// TODO Auto-generated method stub
		return "王五";
	}

	public MchtInfoServer getMchtInfoServer() {
		return mchtInfoServer;
	}

	public void setMchtInfoServer(MchtInfoServer mchtInfoServer) {
		this.mchtInfoServer = mchtInfoServer;
	}

}
