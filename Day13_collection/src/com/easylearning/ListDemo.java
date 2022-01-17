package com.easylearning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(1, "Jack", 9000));
		empList.add(new Employee(5, "Annie", 17000));
		empList.add(new Employee(13, "Kim", 3000));
		empList.add(new Employee(12, "Rose", 4000));
		empList.add(new Employee(2, "Binay", 9000));
		empList.add(new Employee(3, "Abhi", 6000));
		
		
		List<Integer> iList = new ArrayList<>();
		iList.add(1);
		iList.add(2);
		iList.add(13);
		iList.add(4);
		iList.add(5);
		iList.add(8);
		iList.add(9);
		
		System.out.println(iList.contains(8));
		System.out.println(empList.contains(new Employee(3, "Abhi", 6000)));
		
		System.out.println("before sorting:");
		System.out.println(iList);
		System.out.println("After sorting: ");
		Collections.sort(iList);
		System.out.println(iList);
		
		System.out.println("before sorting:");
		display(empList);
		System.out.println("After sorting by id: ");
		Collections.sort(empList);
		display(empList);
		
		System.out.println("After sorting by name: ");
		Collections.sort(empList, new EmpNameComparator());
		display(empList);
		
		System.out.println("After sorting by salary: ");
		Collections.sort(empList, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				if(o1.getSalary()>o2.getSalary()) {
					return 1;
				}else if(o1.getSalary()<o2.getSalary()) {
					return -1;
				}
				return 0;
			}
			
		});
		
		Collections.sort(empList, new EmpSalaryComparator());
		display(empList);
		
		
	}
	
	public static void display(List<?> list) {
		for(Object o: list) {
			System.out.println(o);
		}
		System.out.println("----------------------------");
		System.out.println();
	}
	
	static class EmpSalaryComparator implements Comparator<Employee>{

		@Override
		public int compare(Employee o1, Employee o2) {
			if(o1.getSalary()>o2.getSalary()) {
				return 1;
			}else if(o1.getSalary()<o2.getSalary()) {
				return -1;
			}
			return 0;
		}
		
	}
}
