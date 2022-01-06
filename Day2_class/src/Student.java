
public class Student {
	//instance member
	private int rollNumber;
	private String name;

	
	//class member
	private static String trainerName ="john";
	
	static {
		System.out.println("Inside static block");
		//trainerName = "Ram";
	}
	
	static {
		System.out.println("block2");
	}
	
	static {
		System.out.println("block3");
	}
	
	public Student() {
		name ="No Name";
	}
	  
	public Student(int roll, String nm) {
		rollNumber= roll; 
		name = nm;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getRollNumber() {
		return rollNumber;
	}
	
	public static String getTrainerName() {
		//name ="myFirstVariable";
		return trainerName;
	}
	
	public static void setTrainerName(String name) {
		trainerName = name;
	}
	
	

}
