package com.easylearning.model;

public class WageEmployee extends Employee {
	
	private int rate;
	private int hours;
	
	public WageEmployee() {
		// TODO Auto-generated constructor stub
	}

	public WageEmployee(int id, String name, double salary,int rate,int hours) {
		super(id, name, salary);
		this.rate =rate;
		this.hours =hours;
	}
	
	
	@Override
	public double computeSalary() {
		return  rate*hours;
	}
	
	public double getVariable() {
		return rate*hours;
	}

	@Override
	public String toString() {
		return super.toString()+ "  WageEmployee [rate=" + rate + ", hours=" + hours + "]";
	}
	
	
	
	
	
	
	

}
