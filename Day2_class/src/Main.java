
public class Main {

	public static void main(String[] args) {

		Student s1 =new Student(1, "Akash");
		Student s2 =new Student(2, "Akash"); 
		final Student s3 =new Student(1, "Akash" );
		
		s1 = s2;
		
		Student.setTrainerName("Jack");
		Student.setTrainerName("John");
		
		System sys=null;
		
		System.out.println(Student.getTrainerName());
		
		s3.setName("John");	
		
		method1();
		
	}
	
	public static void method1() {
		
	}

}
