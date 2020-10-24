package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

//AbstractApplicationContext k pass he RegisterShutdownHook hai jis se destroy method work krega jiski help se krega
		 
		 AbstractApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/lifecycle/lyfcyleconfig.xml");
		//registering ShutdownHook to (shutdownHook ki help se destroy method call hoga)
			context.registerShutdownHook(); 
			  //Samosa s1=(Samosa)context.getBean("s1"); System.out.println(s1);
			  
			  //System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			  //class Name is jelbi insted of Jelbi by mistake 
			  //jelbi j1=(jelbi)context.getBean("j1");
			  //System.out.println(j1);
			 
			Pepsi p1=(Pepsi)context.getBean("ps1");
			System.out.println(p1);
	
	}

}
