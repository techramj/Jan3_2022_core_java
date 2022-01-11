package com.easylearning.model;

public class Rectangle extends Shape {

	private double length;
	private double width;

	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public double area() {
		return length * width;
	}

	@Override
	public double perimeter() {
		return 2 * (length * width);
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}
	
	

}
