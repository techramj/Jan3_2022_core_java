package com.easylearning.model;

public class B extends A {
	
	public int a=20;
	
	@Override
	public int getA() {
		return a;
	}
	
	public static void foo() {
		System.out.println("B foo");
	}

}
