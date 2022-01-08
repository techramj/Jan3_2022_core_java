package com.easylearning.model;

import java.util.Objects;

public class Manager extends Employee {

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

	public static void foo() {
		System.out.println("inside manager foo method");
	}

	@Override
	public String toString() {
		return super.toString() + "  Manager [noOfSubordinate=" + noOfSubordinate + ", bonus=" + bonus + "]";
	}

	@Override
	public boolean equals(Object o) {
		boolean flag = super.equals(o);
		if (flag && o instanceof Manager) {
			Manager m = (Manager) o;
			return this.noOfSubordinate == m.noOfSubordinate;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getId(), getName(), getSalary(), getNoOfSubordinate());
	}
	
	
	public Manager getInstance() {
		return new Manager(1,"jessica",9999,20);
	}
	
}
