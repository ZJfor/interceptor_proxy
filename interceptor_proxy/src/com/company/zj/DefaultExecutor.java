package com.company.zj;

public class DefaultExecutor implements Executor{

	@Override
	public void runSql() {
		System.out.println("目标对象执行sql");
		
	}

}
