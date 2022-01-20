package com.easylearning;

public class Account {

	private int accountId;
	private String name;
	private Double balance;

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(int accountId, String name, Double balance) {
		super();
		this.accountId = accountId;
		this.name = name;
		this.balance = balance;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public void deposit(Double amount) {

		System.out.println("validting the amount");
		processing(400);
		System.out.println("Depositing the money");
		processing(100);
		synchronized (balance) {
			balance = balance + amount;
			processing(200);
			System.out.println("Amount deposited successfully. Current balance: " + balance);
		}

	}

	public void withdraw(Double amount) {

		System.out.println("validting the amount");
		processing(400);
		System.out.println("withdrawing the money");
		processing(100);
		synchronized (balance) {
			balance = balance - amount;
			processing(200);
			System.out.println("Amount withdrawn successfully. Current balance: " + balance);

		}

	}

	public void deposit1(Double amount) {
		synchronized (this) {
			System.out.println("validting the amount");
			processing(400);
			System.out.println("Depositing the money");
			processing(100);
			balance = balance + amount;
			processing(200);
			System.out.println("Amount deposited successfully. Current balance: " + balance);
		}

	}

	public void withdraw1(Double amount) {
		synchronized (this) {
			System.out.println("validting the amount");
			processing(400);
			System.out.println("withdrawing the money");
			processing(100);
			balance = balance - amount;
			processing(200);
			System.out.println("Amount withdrawn successfully. Current balance: " + balance);
		}

	}

	private void processing(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", name=" + name + ", balance=" + balance + "]";
	}

	public static synchronized void foo() {

	}

	public void foo1() {
		synchronized (Account.class) {

		}
	}

	public synchronized void display() {

	}

	public  void display1() {
		synchronized (this) {

		}
	}

}
