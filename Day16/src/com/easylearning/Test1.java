package com.easylearning;

public class Test1 {

	public static void main(String[] args) {
		
		Thread ob = new Thread() {
			@Override
			public void run() {
				for(int i=0;i<=5;i++) {
					System.out.println(Thread.currentThread().getName()+" :"+i);
				}
			}
		};
		
		Thread t1= new Thread(ob);
		Thread t2 = new Thread(ob);
		
	
		
		Thread t3 = new Thread(new Runnable() {

			@Override
			public void run() {
				
			}
			
		});
		
		Thread t4 = new Thread(()->{
			
		});
	

	}
	
	
	
	public static void dem02AnotherExample() {
		Runnable ob = new MyRunnable();

		Thread t1 = new Thread(ob);
		Thread t2 = new Thread(ob);

		t1.start();
		t2.start();
		System.out.println("End");
	}

	
	public static void demo1AnotherExample() {
		Runnable r1 =new MyRunnable();
		Runnable r2 = new MyRunnable();
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
		
		System.out.println("End");
	}

	public static void dem02() {
		MyThread ob = new MyThread();

		Thread t1 = new Thread(ob);
		Thread t2 = new Thread(ob);

		t1.start();
		t2.start();
		System.out.println("End");
	}

	public static void demo1() {

		Thread t1 = new MyThread();
		Thread t2 = new MyThread();
		t1.start();
		t2.start();
		System.out.println("End");

	}

}
