package com.easylearning.model;

public class Emp implements Cloneable{
	
	private int id;
	private Address address;
	
	public Emp() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Emp(int id, Address address) {
		super();
		this.id = id;
		this.address = address;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public Emp clone() throws CloneNotSupportedException {
		Emp e= (Emp)super.clone();
		Address address=e.getAddress().clone();
		e.setAddress(address);
		return e;
	}
	
	
	

}
