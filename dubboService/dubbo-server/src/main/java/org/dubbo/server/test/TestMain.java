package org.dubbo.server.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.mt.xy.iface.MchtInfoServer;

public class TestMain {
	
	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ttttttapplication.xml");
		MchtInfoServer server = (MchtInfoServer)ctx.getBean("helloBean");
		System.out.println(server.getMchtNm("11111111"));
		ctx.close();
	}

}
