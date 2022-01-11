package com.easylearning.model;

public class Bank {

	private int id;
	private String name;
	
	int a=11111;
	

	public Bank() {
		// TODO Auto-generated constructor stub
	}

	public Bank(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public class Locker {
		int lockerId;
		
		public Locker() {
			// TODO Auto-generated constructor stub
		}

		public Locker(int lockerId) {
			super();
			this.lockerId = lockerId;
		}
		
		public void display() {
			System.out.println("id=" + id + ", name=" + name +"   lockerId: "+lockerId);
		}

	}
	
	public static class Warehouse{
		
		public void display() {
			System.out.println("warehouse display");
		}
	}
	
	
	public void foo() {
		int a=10;
		class A{
			int a=100;
			public void test() {
				int a=1000;
				System.out.println(this.a+"  "+a+"   "+Bank.this.a);
			}
		}
		
		A ob =new A();
		ob.test();
	}


}
