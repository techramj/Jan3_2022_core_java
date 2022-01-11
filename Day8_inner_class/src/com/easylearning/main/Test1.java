package com.easylearning.main;

import com.easylearning.model.Bank;

public class Test1 {
	
	
	public static void main(String[] args) {
		//simple inner class
		Bank bank = new Bank(101, "SBI");
		Bank.Locker locker = bank.new Locker(1001);
		
		locker.display();
		
		Bank.Locker locker1 = new Bank().new Locker();
		
		//static inner class
		Bank.Warehouse warehouse = new Bank.Warehouse();
		warehouse.display();
		
		
		
		
		
		
	}

}
