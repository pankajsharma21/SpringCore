package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/standalone/collections/aloneconfig.xml");
	
	         Person person1=(Person) context.getBean("person1");
	         System.out.println(person1);
	         System.out.println(person1.getFriends().getClass().getName());//to know implemented collection class
	         System.out.println("------------------------------------------------------");
	         System.out.println(person1.getFeesStructure());
	         System.out.println(person1.getFeesStructure().getClass().getName());
	         System.out.println("------------------------------------------------------");
	         System.out.println(person1.getProperties());
	         
	}

}
