package org.dubbo.server.impl;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;

import cn.mt.xy.iface.MchtInfoServer;

public class MchtServerImpl implements MchtInfoServer,BeanNameAware,BeanFactoryAware{
	
	private String name;
	private String beanName;
	private BeanFactory bf;

	public MchtServerImpl()
	{
		System.out.println(" MchtServerImpl construtor......"  );
	}
	@Override
	public String getMchtNm(String mchtNo) {
		// TODO Auto-generated method stub
		return beanName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println(" MchtServerImpl set property.....");
		this.name = name;
	}
	
	public void init_method()
	{
		System.out.println(" MchtServerImpl init-method......");
	}
	
	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println(" BeanNameAware setBeanName.....");
		this.beanName = name;
	}
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println(" BeanFactoryAware setBeanFactory.....");
		this.bf= beanFactory;
		
	}

}
