package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration             // Annotation to declare that its configuration file
@ComponentScan( basePackages = "com.springcore.javaconfig")// if we not use component annotation its not necessary to use component scan  line .
public class JavaConfig {

	@Bean
public Book book(){
		
		return new Book(); //return object
	}
	
	
	@Bean(name ={"student","con","temp"})  //declare bean if we use this we we can skip @component and @componentScan . and we also gave as many name we want to  gave in array like in this .
	public Student getStudent(){
		
		Student student = new Student(book());
		
		return student;
	}

}
