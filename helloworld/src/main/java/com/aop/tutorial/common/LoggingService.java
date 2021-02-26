package com.aop.tutorial.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingService {

	@Before("commonMethod()")
	public void showLogMsg(JoinPoint joinPoint) {
		System.out.println("calling Log message.."+joinPoint.toString());
	}
	
	@Before("args(name)")
	public void useforArgs(String name) {
		System.out.println("Calling set Method---:---"+name);
	}
	
	@AfterReturning(pointcut = "args(name)", returning = "returnString")
	public void useOfAfterReturn(String name, String returnString) {
		System.out.println("Name:---"+name+"--ReturningString:----"+returnString);
	}
	
	@AfterThrowing("args(name)")
	public void useOfAfterThrown(String name) {
		
		System.out.println("Name:---"+name);
	}
	
	@Pointcut("within(com.aop.tutorial.beans.Mobile)")
	public void commonMethod() {
		//System.out.println("Calling common method....");
	}
	
	
}
