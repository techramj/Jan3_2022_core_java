package com.easylearning.main;

public class A implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("close of A is called");
	}

}
