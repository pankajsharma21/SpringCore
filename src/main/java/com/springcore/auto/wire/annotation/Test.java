package com.springcore.auto.wire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	ApplicationContext context =  new ClassPathXmlApplicationContext("com/springcore/auto/wire/annotation/Autoconfig.xml");

	Emp emp1=context.getBean("emp1",Emp.class);//by using this we not need type cast
	System.out.println(emp1);
	
	}

}