package cn.mt.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages={"cn.mt.control"})
public class WebStarter {

  public static void main(String[] args)
  {
      System.out.println("222222333444");
      SpringApplication.run(WebStarter.class,args);
  }
}
