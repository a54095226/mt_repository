package org.dubbo.server.init;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class HelloApplictionContextListener implements ApplicationListener {

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("------> ApplicationEvent "+event);
    }
}
