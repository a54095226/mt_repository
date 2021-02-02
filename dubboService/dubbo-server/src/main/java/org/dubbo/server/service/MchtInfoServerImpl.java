package org.dubbo.server.service;

import cn.mt.xy.iface.MchtInfoServer;
import org.apache.dubbo.config.annotation.Service;

@Service
public class MchtInfoServerImpl implements MchtInfoServer{

	@Override
	public String getMchtNm(String mchtNo) {
		// TODO Auto-generated method stub
		return "旺旺商城";
	}

}
