package com.easylearning;

public class Test3 {
	
	public static void main(String[] args) {
		
		long time1 = System.currentTimeMillis();
		Account account1 = new Account(1, "jack", 30000.0);
		Account account2 = account1; //new Account(2, "Jessica", 30000);
		
		
		Thread t1= new MyThread() {
			@Override
			public void run() {
				for(int i=0;i<20;i++) {
					account1.deposit(500.0);
				}
			}
		};
		
		Thread t2= new MyThread() {
			@Override
			public void run() {
				for(int i=0;i<10;i++) {
					account2.withdraw(1000.0);
				}
			}
		};
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		long time2 =System.currentTimeMillis();
		
		System.out.println("Total time taken: "+(time2-time1)/1000);
		
		System.out.println("Account1: "+account1);
		System.out.println("Account2: "+account2);
	}

}


