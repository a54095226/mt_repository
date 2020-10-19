package cn.mt.xy.context;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MySpringApplication {
	
	public static void main(String[] args)
	{
		ConfigurableApplicationContext ctx = SpringApplication.run(MySpringApplication.class, args);
		
	}

}
