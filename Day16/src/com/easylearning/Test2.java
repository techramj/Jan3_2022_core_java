package com.easylearning;

public class Test2 {
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main Thead start");
		Thread t1= new Thread(new MyThread());
		Thread t2= new Thread(new MyRunnable());
		
		t1.setName("One: ");
		t2.setName("Two    ");
		
		t1.start();
		t2.start();
		
		
		
		
		
		t1.join();
		//t2.join();
		
		System.out.println("Main thread end...");
	
		
	}

}
