package org.dubbo.server.chain;

//方法拦截器抽象
public interface MethodInterceptor {

	//执行过滤器
	public Object invoke(MethodInvocation methodInvocation);
}
