package com.easylearning.main;

public class WrapperClassDemo {
	
	public static void main(String[] args) {
		
		int x=10;
		Integer iob1 = new Integer(10);
		Integer iob2 = new Integer(10);
		Integer iob3 =Integer.valueOf(10);
		Integer iob4 =Integer.valueOf(10);
		
		
		System.out.println(iob1==iob2);
		System.out.println(iob3==iob4);
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		
		//autoboxing
		
		
	   
		Integer iob10 = iob1 + iob2;
		System.out.println(iob10);
		
		Integer i1=0;
		x = i1;
		for(int i=0;i<=1000;i++) {
			x = x+i;
		}
		i1=x;
		System.out.println(i1);
		
		String str="10";
	
		
	}
	
	
	

}
