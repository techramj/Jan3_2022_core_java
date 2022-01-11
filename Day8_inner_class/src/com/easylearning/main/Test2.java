package com.easylearning.main;

import com.easylearning.model.Dog;

public class Test2 {
	
	public static void main(String[] args) {
		Dog d = new Dog() {
			
			@Override
			public void bark() {
				System.out.println("bowwwwwwwwwwwww");
			}
		}; 
		d.bark();
		System.out.println(d.getClass()); 	
		
	
	}

}
