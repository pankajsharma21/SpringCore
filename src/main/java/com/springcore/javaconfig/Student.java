package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

//@Component("student")
public class Student {
   private Book book;
	public void study() {
		this.book.display();
		System.out.println("Student is Studying");
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public Student(Book book) {
		super();
		this.book = book;
	}
	
}
