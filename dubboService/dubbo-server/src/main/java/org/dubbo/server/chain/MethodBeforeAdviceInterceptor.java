package org.dubbo.server.chain;

/**
 * 方法之前执行执行的拦截器
 * @author xieyao
 *
 */
//方法之前执行执行的拦截器
public class MethodBeforeAdviceInterceptor implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation methodInvocation) {
		// TODO Auto-generated method stub
		System.out.println(" MethodBeforeAdviceInterceptor invoke...");
		return methodInvocation.proceed();
	}
	
}
