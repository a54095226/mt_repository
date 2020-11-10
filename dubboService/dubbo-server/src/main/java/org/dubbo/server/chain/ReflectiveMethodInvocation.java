package org.dubbo.server.chain;

import org.dubbo.server.test.TestFinal;

/**
 * 实现一个责任链方法执行器
 * @author xieyao
 *
 */
public class ReflectiveMethodInvocation implements MethodInvocation{

	private TestFinal target;   //目标方法
	private MethodInterceptor[] methodInterceptors ;  //拦截器
	int currentIdx;                                   //当前执行拦截器索引
	
	public ReflectiveMethodInvocation(TestFinal target)
	{
		this.target = target;
		methodInterceptors = new MethodInterceptor[]{new AspectJAfterAdvice(),new MethodBeforeAdviceInterceptor()};
		currentIdx = 0;
	}
	
	@Override
	public Object proceed() {
		// TODO Auto-generated method stub
		if(currentIdx==methodInterceptors.length)
		{
			return target.getNum();
		}
		
		MethodInterceptor currentInterceptor = methodInterceptors[currentIdx++];
		
		return currentInterceptor.invoke(this);
	}
	
	public static void main(String[] args) {
		
		ReflectiveMethodInvocation mi = new ReflectiveMethodInvocation(new TestFinal());
		mi.proceed();
	}

}
