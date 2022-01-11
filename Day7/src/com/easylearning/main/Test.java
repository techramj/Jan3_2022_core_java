package com.easylearning.main;

import com.easylearning.model.Circle;
import com.easylearning.model.Rectangle;
import com.easylearning.model.Shape;

public class Test {
	
	
	public static void main(String[] args) {
		Shape r1 = new Rectangle(10, 20);
		display(r1);
		
		Circle c1= new Circle(10);
		display(c1);
	}
	
	public static void display(Shape s) {
		System.out.println(s);
		s.displayDetail();
		System.out.println("------------------------");
	}

}
