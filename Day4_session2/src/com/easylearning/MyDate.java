package com.easylearning;

public class MyDate {
	public int dd;
	public int mm;
	public int yy;
	
	public MyDate() {
		// TODO Auto-generated constructor stub
	}

	public MyDate(int dd, int mm, int yy) {
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	
	public void display() {
		System.out.println(dd+"/"+mm+"/"+yy);
	}
	
	

}
