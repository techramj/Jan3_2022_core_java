package com.easylearning.model1;

import com.easylearning.model.Manager;

public class SalesManger extends Manager {

	private double salesMade;
	private double incentive;

	public SalesManger() {
	}

	public SalesManger(int id, String name, double salary, int noOfSubordinate, double salesMade, double incentive) {
		super(id, name, salary, noOfSubordinate);
		this.salesMade =salesMade;
		this.incentive = incentive;

	}
	
	@Override
	public double computeSalary() {
		return super.computeSalary()+computeIncentive();
	}
	
	public double computeIncentive(){
		return salesMade*incentive/100;
	}

}
