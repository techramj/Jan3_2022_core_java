package com.easylearning;

public class DaemonThreadExample {

	public static void main(String[] args) {

		Thread t1 = new Thread(new MyRunnable());

		Thread t2 = new Thread(new MyThread());

		t2.setDaemon(true);
		t1.setDaemon(true);
		
		t1.setName("One");
		t2.setName("Two");

		t1.start();
		t2.start();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Main thread End............");

	}

}
