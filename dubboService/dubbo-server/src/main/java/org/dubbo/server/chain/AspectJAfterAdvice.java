package org.dubbo.server.chain;

/**
 * 方法执行后拦截器
 * @author xieyao
 *
 */
public class AspectJAfterAdvice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation methodInvocation) {
		// TODO Auto-generated method stub
		try {
			return methodInvocation.proceed();
		}
		finally {
			System.out.println(" AspectJAfterAdvice invoke... ");
		}
	}

}
