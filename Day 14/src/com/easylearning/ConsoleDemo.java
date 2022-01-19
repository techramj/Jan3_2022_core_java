package com.easylearning;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ConsoleDemo {
	
	public static void main(String[] args) {
		read();
	}
	
	public static void read() {
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(str);	
		sc.close();
	}
	
	public static void read1() {
		try(DataInputStream dis= new DataInputStream(System.in)){
			
		}catch(IOException e) {}
	}
	
	public static void read2() {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			//br.readLine()
		}catch(IOException e) {
			
		}
	}

}
