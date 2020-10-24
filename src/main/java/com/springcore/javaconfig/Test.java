package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		//Student st = (Student) context.getBean("student");
		Student st2 = context.getBean("getStudent",Student.class);
		//System.out.println(st);
		//st.study();
		System.out.println(st2);
		st2.study();

	}

}
