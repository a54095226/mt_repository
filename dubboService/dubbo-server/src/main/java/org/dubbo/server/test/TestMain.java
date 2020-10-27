package org.dubbo.server.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.mt.xy.iface.MchtInfoServer;

public class TestMain {
	
	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
		MchtInfoServer server = (MchtInfoServer)ctx.getBean("simpleBeanMcht");
		System.out.println(server.getMchtNm("11111111"));
		ctx.close();
	}

}
