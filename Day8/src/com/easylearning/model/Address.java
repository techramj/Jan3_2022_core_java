package com.easylearning.model;

public class Address implements Cloneable {

	private String city;

	public Address() {
		// TODO Auto-generated constructor stub
	} 

	public Address(String city) {
		super();
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + "]";
	}
	
	@Override
	public Address clone() throws CloneNotSupportedException {
		return (Address)super.clone();
	}

}
