package com.easylearning.main;

import com.easylearning.model.A;
import com.easylearning.model.B;
import com.easylearning.model.C;
import com.easylearning.model.Employee;
import com.easylearning.model.Manager;
import com.easylearning.model.SalesManger;
import com.easylearning.model.WageEmployee;

public class Test {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		Manager m1 = new Manager();  //tight coupling
		SalesManger s1 = new SalesManger();
		WageEmployee we1 =new WageEmployee();

		displayDetails(e1);
		displayDetails(m1);
		displayDetails(s1);
		displayDetails(we1);
		
		
		Employee e2 = new Employee(1,null,1000);
		Employee e3 = new Employee(1,null,1000);
		
		
		System.out.println(e2==e3);
		System.out.println(e2.equals(e2));
		System.out.println(e2.equals(e3));
		System.out.println(e2.equals(new Test()));
		System.out.println(e2.equals(null));
		
	
		
		
		Manager m2 =new Manager(1, "jack", 1000,3);
		Manager m3 =new Manager(1, "jack", 1000,3);
		Manager m=(Manager) m3.getInstance();
		
		System.out.println(m2.equals(new Test()));
		
		System.out.println(null instanceof Employee);
		
		System.out.println(new Employee().getClass());
		System.out.println(new Manager().getClass());
		
		Employee e11=m2;
		System.out.println(e11.getClass());
	}

	public static void displayDetails(Employee e) {
		System.out.println(e.getClass());
		System.out.println("Net salary: "+e.computeSalary());
		System.out.println(e);
		System.out.println("---------------------------------");
		
		//specific method
		
	}
	
	

	
}
