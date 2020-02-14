package com.company.zj;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建目标类
		Executor target=new DefaultExecutor();
		
		Interceptor interceptor=new LogInterceptor();
		//得到代理对象
		Object proxy=ProxyFactory.newProxy(target,interceptor);
		//通过代理对象执行方法,运行目标类的方法
		Executor executor=(Executor) proxy;
		executor.runSql();

	}

}
