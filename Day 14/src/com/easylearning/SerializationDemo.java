package com.easylearning;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	
	public static void main(String[] args) {
		String filename="emp.dat";
		//wrtieDemo(filename);
		readDemo(filename);
	}
	
	//serailization
	public static void wrtieDemo(String filename) {
		Employee emp1= new Employee(101,"Kochhar",8000);
		Address add1= new Address("pune");
		emp1.setAddress(add1);
		
		try (FileOutputStream fos = new FileOutputStream(filename);
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(emp1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Done!!");
	}
	
	
	//de-serailization
	public static void readDemo(String filename) {
		try (FileInputStream fis = new FileInputStream(filename);
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			Object emp= ois.readObject();
			System.out.println(emp.getClass().getName());
			System.out.println(emp);
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
