package com.easylearning;

public class EnumTest {
	
	public static void main(String[] args) {
		
		Weekday day1 = Weekday.MONDAY;
		Weekday day2 = Weekday.SATURDAY;
		 
		System.out.println(day1.ordinal());
		
		System.out.println(day1.toString());
		
		Weekday[] arr= Weekday.values();
		for(Weekday d :arr) {
			System.out.println(d.ordinal()+"  "+d.toString()+"  "+d.name());
		}
		
		String str ="monday";
		
       Weekday w= Weekday.valueOf("MONDAY");
       System.out.println(w); 
       
       
       System.out.println(Weekday.getWeekday(5));
       
       
       
		
	
		
		
	}
	

}
