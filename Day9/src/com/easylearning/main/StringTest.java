package com.easylearning.main;

import com.easylearning.model.MyDate;

public class StringTest {

	public static void main(String[] args) {

		charCount("aaaabbbbcczzyyYYYYAAA");

	}
	


	// wap to check whether string is pallindrome or not
	// nitin malyalam deed

	public static boolean isPallindrome(String str) {
		// logic
		return false;
	}
	
	
	public static void charCount(String str) {
		String s= str.toUpperCase();
		
		int[] arr = new int[91];
		
		for(char ch:s.toCharArray()) {
			arr[ch]++;
		}
		
		for(int i=65;i<=90;i++) {
			if(arr[i]!=0) {
				System.out.print((char)i);
				System.out.println("="+arr[i]);
			}
		}
	}
	
	
	public static void test() {
		MyDate d1 = new MyDate(2, 2, 2022);
		MyDate d2 = d1;

		// d1.setMm(10);

		String str1 = "test";
		String str2 = "test";
		String str3 = new String("test");

		// str1=str1.concat("xyz");
		// str2=str2.concat("xyz");

		System.out.println("str1=  " + str1);
		System.out.println("str2=  " + str2);

		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase("TesT"));
		String str4 = "";

		/*for (int i = 65; i <= 90; i++) {
			str4 = str4 + (char) i;
		}*/

		StringBuilder sb = new StringBuilder("test");
		sb.append("xyz");
		System.out.println(sb);

		StringBuilder sb1 = new StringBuilder();

		for (int i = 65; i <= 90; i++) {
			sb1.append((char) i);
		}
		str4 = sb1.toString();
		System.out.println(str4);

		String str = "abcdef";
		str = new StringBuilder(str).reverse().toString();
		System.out.println(str);
	}

}
