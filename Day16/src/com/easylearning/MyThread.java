package com.easylearning;

public class MyThread extends Thread {
	int x=0;
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"Start");
		for(int i=0;i<=5;i++) {
			x=x+10;
			System.out.println(Thread.currentThread().getName()+"  "+x);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+"  End");
	}

}
