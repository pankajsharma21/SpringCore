package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/collections/collectionconfig.xml");
		Emp emp0=(Emp) context.getBean("emp0");
		System.out.println(emp0.getName());
		System.out.println(emp0.getPhones());
		System.out.println(emp0.getAddresses());
		System.out.println(emp0.getCourses());
		
	}

}
