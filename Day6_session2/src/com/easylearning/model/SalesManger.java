package com.easylearning.model;

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

	@Override
	public String toString() {
		return super.toString()+ "   SalesManger [salesMade=" + salesMade + ", incentive=" + incentive + "]";
	}
	
	
	public SalesManger getInstance() {
		return new SalesManger(1,"jessica",9999,20,50000,1);
	}
	
	

}
