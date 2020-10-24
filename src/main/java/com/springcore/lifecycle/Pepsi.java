package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Pepsi {
private String brand;

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}

public Pepsi() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Pepsi [brand=" + brand + "]";
}
@PostConstruct
public void start() {
	System.out.println("Starting Method");
}
@PreDestroy
public void end() {
	System.out.println("Ending Method");
}
	
}
