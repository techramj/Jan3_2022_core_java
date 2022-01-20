package com.easylearning;

public class MyRunnable implements Runnable {
	int x = 10;

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"  Start");
		for (int i = 0; i <= 5; i++) {
			x = x + 10;
			System.out.println(Thread.currentThread().getName() + "  " + x);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+"  End");
	}

}
