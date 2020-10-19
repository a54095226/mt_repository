package cn.mt.xy.DubboWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class WebApplication extends SpringBootServletInitializer{
	
	 @Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	        return builder.sources(WebApplication.class);
	    }

	
	 public static void main(String[] args) {
         SpringApplication.run(WebApplication.class, args);
     }
}
