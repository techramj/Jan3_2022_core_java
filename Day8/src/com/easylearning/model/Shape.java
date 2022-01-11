package com.easylearning.model;

public abstract class Shape {
	private int x;
	
	public Shape() {
		// TODO Auto-generated constructor stub
	}
	
	public Shape(int x) {
		this.x = x;
	}

	public static final double PI = 3.14;

	public abstract double area();

	public abstract double perimeter();

	public final void displayDetail() {
		System.out.println("Area of " + this.getClass() + ":" + area());
		System.out.println("Perimeter of " + this.getClass() + ":" + perimeter());
	}
	
	

}
