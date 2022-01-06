package com.easylearning;

public enum Weekday {
   SUNDAY(1), MONDAY(2), TUESDAY(3), THURSDAY(5), FRIDAY(6), SATURDAY(7);
	
    private int id;
    
	Weekday(int id){
	  this.id= id;
	}
	
	public int getId() {
		return id;
	}
	
	public static Weekday getWeekday(int id) {
		for(Weekday day: Weekday.values()) {
			if(day.id==id) {
				return day;
			}
		}
		return null;
	}
	
} 


enum Emp{	
	E1(1,"Jack",1000), E2(2,"John",2000), E3(3,"Jessica",5000), 
	E4(4,"John", 5000), E5(5,"Jay",5000);
	
	int id;
	String name;
	double salary;
	
	Emp(int id,String name,double salary){
		this.id = id;
		this.name =name;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
  

