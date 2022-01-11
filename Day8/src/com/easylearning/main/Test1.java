package com.easylearning.main;

import com.easylearning.model.A;
import com.easylearning.model.Address;
import com.easylearning.model.B;
import com.easylearning.model.Circle;
import com.easylearning.model.Emp;
import com.easylearning.model.MyDate;
import com.easylearning.model.Printable;
import com.easylearning.model.Rectangle;
import com.easylearning.model.Shape;
import com.easylearning.model.X;

public class Test1 {

	public static void main(String[] args) throws CloneNotSupportedException {
		MyDate d1 = new MyDate(1, 1, 2001);
		MyDate d2 = d1.clone();
		MyDate d3 = d2.clone();

		System.out.println(d1 == d2);
		System.out.println(d1.equals(d2));
		
		Address add =new Address("pune");
		Emp e1 = new Emp(1,add);
		Emp e2 = e1.clone();
		
		e1.getAddress().setCity("Mumbai");
		
 
		System.out.println(e1.getAddress().getCity());
		System.out.println(e2.getAddress().getCity());
		
		Printable p = new Printable() {
			@Override
			public void print() {
				
			}
		};
		
		
		Shape s = new Shape() {
			
			@Override
			public double perimeter() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public double area() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
		

	}

}
