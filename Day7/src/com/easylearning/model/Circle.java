package com.easylearning.model;

public class Circle extends Shape {

	public double radius;
	
	public Circle() {
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public static double getPi() {
		return PI;
	}

	@Override
	public double area() {
		return PI * radius * radius;
	}

	@Override
	public double perimeter() {
		return 2 * PI * radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	

}
