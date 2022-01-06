package pkg1;

public class Employee {

	private int id;
	private String name;
	private double salary;
	protected String companyName;

	public Employee() {
	}

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary; 
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	} 

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public static void foo() {
		
	}
	
	public static void foo1() {}
	
	public static void foo2() {}  

}
