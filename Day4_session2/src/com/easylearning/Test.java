package com.easylearning;

public class Test {
	
	public static void main(String[] args) {
		MyDate d1 =new MyDate(1, 1, 2001);
		MyDate d2 = new MyDate(2,2,2002);
		
		d1.display();
		d2.display();
		
		System.out.println("After swapping");
		swap(d1,d2);
		
		d1.display();
		d2.display();
		
		   
		
		
		MyDate[] arr = new MyDate[2];
		arr[0]=d1;
		arr[1]=d2;
		swap(arr);
		
		d1=arr[0];
		d2=arr[1];
		
	}
	
	public static void swap(MyDate[] arr) {
		MyDate temp = arr[0];
		arr[0]= arr[1];
		arr[1] = temp;
		
	}
	
	public static void swap(MyDate d1, MyDate d2) {
		int temp;
		temp = d1.dd;
		d1.dd = d2.dd;
		d2.dd = temp;
		
		temp = d1.mm;
		d1.mm = d2.mm;
		d2.mm = temp;
		
		temp = d1.yy;
		d1.yy = d2.yy;
		d2.yy= temp;
		
	}
	
	
	

}
