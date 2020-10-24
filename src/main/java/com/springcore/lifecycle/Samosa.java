package com.springcore.lifecycle;

public class Samosa {
private double price;

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	System.out.println("Setting Price");
	this.price = price;
}

public Samosa() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Samosa [price=" + price + "]";
}
//we can Also change the name of init method as we want and also change in config same name to result as excepted
public void init() {
	
	System.out.println("inside inti method");
}
//we can Also change the name of destroy method as we want and also change in config same name to result as excepted
public void destroy() {
	
	System.out.println("inside Destroy method");
}

}
