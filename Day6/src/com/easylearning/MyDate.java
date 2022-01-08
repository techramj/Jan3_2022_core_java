package com.easylearning;

public class MyDate {
	int dd;
	int mm;
	int yy;
	
	private static MyDate ref = new MyDate();
	private static MyDate ref1;
	private static MyDate[] darr=new MyDate[5];
	
	static {
		darr[0] = new MyDate(1,1,2001);
		darr[1] = new MyDate(2,1,2001);
		darr[2] = new MyDate(3,1,2001);
		darr[3] = new MyDate(4,1,2001);
		darr[4] = new MyDate(5,1,2001);
	}
	
	private MyDate() {
	}

	private MyDate(int dd, int mm, int yy) {
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	
	public void display() {
		System.out.println(dd+"/"+mm+"/"+yy);
	}
	
	
	public static MyDate getInstance() {
		//return new MyDate();
		return ref;
	}
	
	public static MyDate getInstance1() {
		if(ref1==null) {
			ref1= new MyDate();
		}
		return ref1;
	}
	
	
	public static MyDate getInstance(int dd,int mm,int yy) {
		return new MyDate(dd,mm,yy); 
		
	}
	
	@Override
	public void finalize() {
		//System.out.println("bye bye "+this.dd);
		
	}
	
	


	
}






