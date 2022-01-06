
public class Employee {
	
	private int id;
	private String name;
	private double salary;
	private SocailProfile profile;   //facebook,instrgram, twitter, Link
	private Weekday[] workingDays;
	
	public Employee() {
		this(0,"no name",1000);
		int x=10;
		/*
		 * id=0; 
		 * name="no Name"; 
		 * salary = 1000;
		 */
	}
	
	public Employee(int id, String name, double salary) {
		System.out.println("Emp parameterized constructor");
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public void dispaly() {
		System.out.println(this);
		System.out.println("id: "+this.id+" Name:"+this.name+"  salary:"+salary);
	}
	
	public static void foo() {

	}

}
