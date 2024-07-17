package com.crick.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Aspect
@Component
public class PrintAdvices{
	@Before("execution(* com.crick.service.WorldCupService.fetchliststaff())")
	public void beforMsg()
	{
		System.err.println("Hello");
	}
	@After("execution(* com.crick.service.WorldCupService.fetchliststaff())")
	public void afterMsg()
	{
		System.err.println("Bye");
	}
	@Around("execution(* com.crick.service.WorldCupService.fetchMedicaldeptcount())")
	public Object aroundMsg(ProceedingJoinPoint p) throws Throwable 
	{
		System.err.println("Hello");
		Object result = p.proceed();
		System.err.println("jay shri ram");
		return result;
	}
	

}
