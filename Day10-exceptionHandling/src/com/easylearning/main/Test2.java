package com.easylearning.main;

import com.easylearning.exception.MinimumBalanceException;
import com.easylearning.model.Account;

public class Test2 {
	
	public static void main(String[] args) {
		Account jack= new Account(10001, "Jack", 5000);
		try {
			jack.withdrawAmount(1000);
			jack.withdrawAmount(3000);
			jack.withdrawAmount(700);
		} catch (MinimumBalanceException e) {
			e.printStackTrace();
		}
	}

}
