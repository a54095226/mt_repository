package org.dubbo.server.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.mt.xy.iface.MchtInfoServer;

public class TestMain {
	
	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
		MchtInfoServer server = (MchtInfoServer)ctx.getBean("mchtServer");
		System.out.println(server.getMchtNm("111"));
		ctx.close();
	}

}
