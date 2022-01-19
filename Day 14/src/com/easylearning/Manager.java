package com.easylearning;

public class Manager extends Employee {

	private int noOfSubordinate;

	public Manager() {
		// TODO Auto-generated constructor stub
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
	public String toString() {
		return   super.toString()+"  Manager [noOfSubordinate=" + noOfSubordinate + "]";
	}
	
	

}
