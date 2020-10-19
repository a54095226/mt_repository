package cn.mt.xy.context;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import cn.mt.xy.iface.MchtInfoServer;

@SpringBootApplication
@ComponentScan(basePackages={"cn.mt.xy.service"})
public class MySpringApplication {
	
	public static void main(String[] args)
	{
		ConfigurableApplicationContext ctx = SpringApplication.run(MySpringApplication.class, args);
		
		MchtInfoServer server = ctx.getBean(MchtInfoServer.class);
		System.out.println(server.getMchtNm(""));
		
	}

}
