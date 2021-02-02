package org.dubbo.server.context;



import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@EnableDubbo
@DubboComponentScan(basePackages={"org.dubbo.server.service"})
public class MySpringApplication {
	
	public static void main(String[] args)
	{
		ConfigurableApplicationContext ctx = SpringApplication.run(MySpringApplication.class, args);
		String[] tmps = ctx.getBeanDefinitionNames();
		for(String tmp:tmps)
		{
			System.out.println("----->"+tmp);
		}
		ctx.close();
	}

}
