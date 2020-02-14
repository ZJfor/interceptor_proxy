package com.company.zj;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyHandler implements InvocationHandler{
	Object target;
	Interceptor interceptor;
	//调用多个interceptor
	//Interceptor[] interceptors;
	

	public ProxyHandler(Object target,Interceptor interceptor) {
		super();
		this.target = target;
		this.interceptor=interceptor;
	}


	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("invoke methodName="+method.getName());
		//调用多个interceptor
//		for(Interceptor interceptor:interceptors)
//		{
//			interceptor.intercept();
//		}
		
		//先调用interceptor
		interceptor.intercept();
		//调用目标方法
		method.invoke(target, args);
		return null;
	}

}
