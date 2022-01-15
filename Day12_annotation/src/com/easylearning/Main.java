package com.easylearning;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		try {
			reflectionDemo();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	public static void reflectionDemo() throws ClassNotFoundException {
		Class clazz= Class.forName("com.easylearning.Employee");
		//Class clazz1 = Employee.class;
		
		Field[] declaredFields = clazz.getDeclaredFields();
		for(Field f:declaredFields) {
			int m=f.getModifiers();
			System.out.print( Modifier.toString(m)+" "); 
			System.out.print(f.getType()+" ");
			System.out.println(f.getName());
		}
		
		System.out.println("---------------------------------------------------");
		
		Method[] declaredMethods = clazz.getDeclaredMethods();
		
		for(Method method:declaredMethods) {
			int m=method.getModifiers();
			System.out.print( Modifier.toString(m)+" "); 
			System.out.print(method.getReturnType()+" ");
			System.out.println(method.getName());
			
			Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
			for(Annotation anno:declaredAnnotations) {
				System.out.println("Anno name:"+anno);
			}
			System.out.println("________________________________________________");
		}
		
	}
	
	
	

}
