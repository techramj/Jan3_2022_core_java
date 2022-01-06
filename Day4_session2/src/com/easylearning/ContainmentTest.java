package com.easylearning;

public class ContainmentTest {
	
	public static void main(String[] args) {
		Address add1 =new Address("Pune", "411041");
		Address add2 =new Address("Pune", "411031");
		
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("Jack"); 
		emp.setSalary(4000);
		emp.setAddress(add1);
		
		
		Employee emp2 = new Employee(2, "Jessica", 3000, add2);
		
		
		
		Employee emp3 = new Employee(3, "Jessica", 3000, new Address("Mumbai","12345"));
		
		emp3=null;
		
		
		
	}

}
