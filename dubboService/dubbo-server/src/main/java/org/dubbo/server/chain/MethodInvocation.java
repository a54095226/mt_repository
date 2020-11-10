package org.dubbo.server.chain;

//责任链方法执行抽象
public interface MethodInvocation {
    //执行责任链方法
	public Object proceed();
}
