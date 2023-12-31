package com.spring.aop.order;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class Info {

	@Before("execution(public void getdata())")
	public void end() {
		System.out.println("End");
	}
}
