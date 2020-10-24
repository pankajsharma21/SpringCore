package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class jelbi implements InitializingBean,DisposableBean{
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public jelbi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "jelbi [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		//init
		System.out.println("Taking jelbi");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("pay after eat");
	}
	

}
