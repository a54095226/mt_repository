package cn.mt.xy.service;

import org.springframework.stereotype.Service;

import cn.mt.xy.iface.MchtInfoServer;

@Service
public class MchtInfoServerImpl implements MchtInfoServer{

	@Override
	public String getMchtNm(String mchtNo) {
		// TODO Auto-generated method stub
		return "旺旺商城";
	}

}
