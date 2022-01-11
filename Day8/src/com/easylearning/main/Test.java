package com.easylearning.main;

import java.io.Serializable;

import com.easylearning.model.Circle;
import com.easylearning.model.Drawable;
import com.easylearning.model.Employee;
import com.easylearning.model.Manager;
import com.easylearning.model.Printable;
import com.easylearning.model.Rectangle;
import com.easylearning.model.Shape;

public class Test {
	
	
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Sam", 1000);
		Manager m1=new Manager();
		Circle c1=new Circle();
		Rectangle r1 = new Rectangle();
		Shape s1= new Circle();
		Shape s2= new Rectangle();
		
		print(e1);
		print(m1);
		//print(c1);
		print(r1);
		//print(s1);
		//print((Rectangle)s2);
		
		
		
		//Marker interface/tagging interface/Empty interface
		
		
		
		
	}
	
	public static void display(Shape s) {
		System.out.println(s);
		s.displayDetail();
		System.out.println("------------------------");
	}
	
	public static void draw(Drawable d) {
		d.draw();
		System.out.println("another new feature");
	}
	
	public static void print(Printable p) {
		p.print();
		System.out.println(p.getClass());
	}

}
