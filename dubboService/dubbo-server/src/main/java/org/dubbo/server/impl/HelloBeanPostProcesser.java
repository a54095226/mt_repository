package org.dubbo.server.impl;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class HelloBeanPostProcesser implements BeanPostProcessor{

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println(" BeanPostProcessor postProcessBeforeInitialization...... ");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println(" BeanPostProcessor postProcessAfterInitialization...... ");
		return bean;
	}

}
