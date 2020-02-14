package com.company.zj;

import java.lang.reflect.Proxy;

public class ProxyFactory {
	public static Object newProxy(Executor target,Interceptor interceptor) {
		
		Class[] interfaces=target.getClass().getInterfaces();
		ClassLoader classLoader=target.getClass().getClassLoader();
		ProxyHandler proxyHandler=new ProxyHandler(target,interceptor);
		
		return Proxy.newProxyInstance(classLoader, interfaces, proxyHandler);
		
	}

}
