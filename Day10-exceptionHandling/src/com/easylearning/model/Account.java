package com.easylearning.model;

import com.easylearning.exception.MinimumBalanceException;

public class Account {
	
	private long accountId;
	private String name;
	private double balance;
	private static final double MINIMUM_BALANCE =500;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(long accountId, String name, double balance) {
		super();
		this.accountId = accountId;
		this.name = name;
		this.balance = balance;
	}
	
	
	public void withdrawAmount(double amount) throws MinimumBalanceException{
		if(balance-amount<=500) {
			throw new MinimumBalanceException("Minimum balance:"+MINIMUM_BALANCE+"  current balance: "+balance);
		}
		
		balance=balance-amount;
		System.out.println("Amount withdrawn: "+amount+"  current balance: "+balance);
	}

}
