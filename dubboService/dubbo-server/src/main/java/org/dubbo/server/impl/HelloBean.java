package org.dubbo.server.impl;

import cn.mt.xy.iface.MchtInfoServer;

public class HelloBean implements MchtInfoServer{

	@Override
	public String getMchtNm(String mchtNo) {
		// TODO Auto-generated method stub
		System.out.println(" HelloBean getMchtNm ");
		return "旺仔";
	}

}
