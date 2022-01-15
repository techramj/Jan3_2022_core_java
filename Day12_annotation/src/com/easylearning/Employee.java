package com.easylearning;

//this the base class of all employee...
@Info(value = "this the base class of all employee")
@SuppressWarnings("unused")

public class Employee {

	
	private int id;
	private String name;
	private double salary;

	//default constructor
	@Info(value = "default constructor")
	@MyContructAnno
	public Employee() {
	}

	//paramterized contructor
	@Info(value = "Paramterized constructor")
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Info("this is getter method of id")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	@Deprecated
	public void foo() {
		int x=0;
		
		int y=0;
	
	}
	
	
	public void foo1() {
	  int x=1;
	}
	
	

}
