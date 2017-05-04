package com.javatpoint.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.util.StopWatch;

public class AroundAdvisor implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		Object obj;
		StopWatch stopwatch = new StopWatch();
		stopwatch.start();
		System.out.println("additional concern before actual logic");
		obj = mi.proceed();
		stopwatch.stop();
		System.out.println("additional concern after actual logic " + 
		    stopwatch.getTotalTimeMillis());
		return obj;
	}

}