package pkg2;


import static pkg1.Employee.*;
import static java.lang.System.out;
import pkg1.Employee;
//import pkg3.MyDate;
//import pkg4.MyDate;

public class Main  {
	
	public static void main(java.lang.String[] args) {
 		Employee emp = new Employee();
		Employee emp2 = new Employee(1,"John",2000);
		java.lang.String str ="abc";
		
		foo(); 
		foo2(); 
		out.println("Test");
		
		pkg3.MyDate d1 = new pkg3.MyDate();
		pkg4.MyDate d2 = new pkg4.MyDate();
 
		
	}

}
