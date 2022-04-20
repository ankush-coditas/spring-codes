package com.aspect;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.*;
@Component
@EnableAspectJAutoProxy
public class Aspect {
	@Pointcut("execution(public int sum( int x,int y))")
	  public void myPointcut() {
		
	}
	
	@Around("myPointcut()")
		
	public Object log (ProceedingJoinPoint pjp )throws Throwable{
		
		System.out.println("Entiring into "+pjp.getSignature());
		Object res = pjp.proceed();
		System.out.println("Leaving from "+ pjp.getSignature());
		return res;
	}
	
	@Before("mypointcut()")
	   public void checkInputs(JoinPoint jp) {
		
		Object args[] = jp.getArgs();
		if((Integer)args[0]<=0||(Integer)args[1]<=0) {
			throw new IllegalArgumentException("invalid inputs");
			
		}
	}
	@AfterReturning(value="myPointcut()" , returning = "result")
	public void checkResult(JoinPoint jp ,int result) {
		if(result <=0) {
			throw new IllegalArgumentException("invalid result");
		}
	}
	@AfterThrowing(value = "myPointcut()",throwing = "e")
	public void exceptionLogger(JoinPoint jp , Exception e) {
		System.out.println(jp.getSignature()+"has raised"+e.getClass());
	}

}
