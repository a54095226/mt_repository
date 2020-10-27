package org.dubbo.server.impl;

import java.beans.PropertyDescriptor;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;

public class HelloAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor{

	/**
	 * BeanPostProcessor接口中的方法
	 * 在Bean的自定义初始化方法之前执行
	 * Bean对象已经存在了
	 */
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println(" InstantiationAwareBeanPostProcessor postProcessBeforeInitialization......");
		return bean;
	}

	/**
	 * BeanPostProcessor接口中的方法
	 * 在Bean的自定义初始化方法执行完成之后执行
	 * Bean对象已经存在了
	 */
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(" InstantiationAwareBeanPostProcessor postProcessAfterInitialization......");
		return bean;
	}

	/**
	 * InstantiationAwareBeanPostProcessor中自定义的方法
	 * 在对象实例化之前执行  Bean对象还没有
	 */
	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		System.out.println(" InstantiationAwareBeanPostProcessor postProcessBeforeInstantiation......");
		try {
			return beanClass.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * InstantiationAwareBeanPostProcessor中自定义的方法
	 * 在对象实例化之后执行  Bean对象已经创建出来了
	 */
	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		System.out.println(" InstantiationAwareBeanPostProcessor postProcessAfterInstantiation......");
		return true;
	}

	/**
	 * InstantiationAwareBeanPostProcessor中自定义的方法
	 * 可以用来修改Bean中属性的内容
	 */
	@Override
	public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean,
			String beanName) throws BeansException {
		System.out.println(" InstantiationAwareBeanPostProcessor postProcessPropertyValues......");
		return pvs; 
	}
}
