package com.company.zj;

public class LogInterceptor implements Interceptor{

	@Override
	public void intercept() {
		System.out.println("处理日志");
		
	}

}
