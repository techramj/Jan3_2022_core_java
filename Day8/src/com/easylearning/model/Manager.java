package com.easylearning.model;

public class Manager extends Employee  {

	protected int noOfSubordinate;
	private final double bonus = 2000;


	public Manager() {
		super();
	}

	public Manager(int id, String name, double salary, int noOfSubordinate) {
		super(id, name, salary);
		this.noOfSubordinate = noOfSubordinate;
	}

	public int getNoOfSubordinate() {
		return noOfSubordinate;
	}

	public void setNoOfSubordinate(int noOfSubordinate) {
		this.noOfSubordinate = noOfSubordinate;
	}

	@Override
	public double computeSalary() {
		return super.computeSalary() + bonus;
	}

	public double getBonus() {
		return bonus;
	}
	

	@Override
	public String toString() {
		return  super.toString()+ ": Manager [noOfSubordinate=" + noOfSubordinate + ", bonus=" + bonus + "]";
	}

	@Override
	public void print() {
		System.out.println(this);
		
	}

}
