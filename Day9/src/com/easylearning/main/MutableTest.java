package com.easylearning.main;

public class MutableTest {
	
	public static void main(String[] args) {
		//StringBuffer;
		//StringBuilder
		
		StringBuilder sb=new StringBuilder();
		for (int i = 65; i <= 90; i++) {
			sb.append((char) i);
		}
		String str = sb.toString();
		System.out.println(str);
		
		String str1=sb.reverse().toString();
		System.out.println(str1);
		
		
		String str11 ="abcdef xyz abcd efgh ijkl jjkkd djkjd jkdjk Defgh";
	
	}
	
	public String reverseString(String str) {
		char[] arr=str.toCharArray();
		
		String revString=String.valueOf(arr);
		
		//StringBuilder sb = new StringBuilder(str);
		//sb.setCharAt(0, 0);
		
		return revString;
	}
	
	
	

}
