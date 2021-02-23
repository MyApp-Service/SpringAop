package com.aop.tutorial.common;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingService {

	@Before("commonMethod()")
	public void showLogMsg() {
		System.out.println("calling Log message..");
	}
	
	@Before("args(name)")
	public void useforArgs(String name) {
		System.out.println("Calling set Method:---"+name);
	}
	
	@Pointcut("within(com.aop.tutorial.beans.Mobile)")
	public void commonMethod() {
		//System.out.println("Calling common method....");
	}
	
	
}
