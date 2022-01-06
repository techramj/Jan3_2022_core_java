package com.easylearning;

public class Math {

	/*public void add(int a, int b) {
		int res=a+b;
        System.out.println("add(int,int)="+res);  
	}*/   
 
	public void add(int a, int b, int c) {
		int res=a+b+c;
        System.out.println("add(int,int,int)="+res);
	} 
	
	public void add(float a, float b) {
		float res=a+b;
        System.out.println("add(float,float)="+res);
	} 
	
	public void add(double a, double b) {
		double res=a+b;
        System.out.println("add(double,double)="+res);
	} 
	
	/*public void add(long a, long b) {
		long res=a+b;
        System.out.println("add(long,long)="+res);
	} */
	
	public void add(byte a, byte b) {
		byte res =(byte) (a+b);
        System.out.println("add(byte,byte)="+res);
	} 
	
	public void add(short a, short b) {
		short res =(short) (a+b);
        System.out.println("add(short,short)="+res);
	} 
	
	public static void main(String[] args) {
		
		Math math =new Math();
		math.add(10,10);
		math.add(10.5f,10.6f);
		
		
	}
  
}
