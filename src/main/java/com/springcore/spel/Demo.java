package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("demo")
public class Demo {
	@Value("#{5+1}")
	private int x;
	@Value("#{2+2}")
	private int y;
	@Value("#{T(java.lang.Math).sqrt(25)}") //calling Static method
	private double z;
	@Value("#{T(java.lang.Math).PI}")// calling Static variable of class
	private double e;
	@Value("#{new java.lang.String('Pankaj')}") // make object in spEl
	private String name;
	@Value("#{8>3}") //boolean use in spEl
	private boolean isActiva;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	
	public double getE() {
		return e;
	}
	public void setE(double e) {
		this.e = e;
	}
	
	
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + ", isActiva=" + isActiva
				+ "]";
	}


}
