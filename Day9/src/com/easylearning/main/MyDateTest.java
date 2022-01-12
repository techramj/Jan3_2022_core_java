package com.easylearning.main;

import com.easylearning.model.MyDate;

public class MyDateTest {
	
	public static void main(String[] args) {
		MyDate d1 =new MyDate(31, 1, 2020);
		//System.out.println(d1.isLastDayOfMonth());
		MyDate d2 = d1.nextDay();
		//System.out.println(d1);
		//System.out.println(d2);
		
		MyDate d3= d1.addMonths(1001);
		System.out.println(d1);
		System.out.println(d3);
		
	}

}
