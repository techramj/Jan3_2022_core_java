package com.easylearning.main;

import com.easylearning.model.Employee;
import com.easylearning.model.Manager;
import com.easylearning.model1.SalesManger;

public class Test {
	
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "john", 1000);
		
		Manager m1 = new Manager(2, "Jack", 2000, 2);
		
		SalesManger s1= new SalesManger(3, "Jessica", 3000, 3, 50000, 1);
		
		
		
		
		displayDetails(e1);
		displayDetails(m1);
		displayDetails(s1);
		
	}
	
	
	public static void displayDetails(Employee e) {
		if(e instanceof SalesManger) {
			System.out.println("Net salary: "+e.computeSalary());
			double incentive=((SalesManger)e).computeIncentive();
			System.out.println("Incentive: "+incentive);	
		}else if(e instanceof Manager) {
			System.out.println("Net salary: "+e.computeSalary());
			double bonus=((Manager)e).getBonus();
			System.out.println("Bonus: "+bonus);
		}else if(e instanceof Employee) {
			System.out.println("Net salary: "+e.computeSalary());
	
		}
		
		System.out.println("-----------------------------------");
		
		
	}

}
