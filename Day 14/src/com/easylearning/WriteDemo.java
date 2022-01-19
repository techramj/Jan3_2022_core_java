package com.easylearning;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class WriteDemo {
	
	public static void main(String[] args) {
		String filename="a.txt";
		writeDemo3("c.txt");
	}
	
	public static void writeDemo(String filename) {
		
		try (FileOutputStream fos = new FileOutputStream(filename)) {
			byte[] arr= {65,66,67};
			fos.write(arr);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("done!!!!!!!!");
	}
	
	public static void writeDemo1(String filename) {
		
		try (FileOutputStream fos = new FileOutputStream(filename);
				DataOutputStream dos= new DataOutputStream(fos)) {
			dos.write("DataoutputStream object can write int he file.\n".getBytes());
			dos.writeUTF("dos.writeUTF");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("done!!!!!!!!");
	}
	
	public static void writeDemo2(String filename) {
		try (PrintWriter writer = new PrintWriter(new File(filename))) {
			writer.println("This is demo to write on the file using print writer object!!!!!!!!!!");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("done");
	}
	
	
	public static void writeDemo3(String filename) {
		try (PrintStream writer = new PrintStream(new File(filename))) {
			writer.println("This is demo to write on the file using print writer object!!!!!!!!!!");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("done");
	}
	
	
	

}
