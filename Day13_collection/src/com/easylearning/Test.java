package com.easylearning;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Test {

	public static void main(String[] args) {
		List<Integer> iList1 = new ArrayList<>();
		iList1.add(1);
		iList1.add(2);
		iList1.add(13);
		iList1.add(4);
		iList1.add(5);
		iList1.add(8);
		iList1.add(9);
		iList1.add(10);
		iList1.add(3);

		List<String> sList = new ArrayList<String>();
		sList.add("apple");
		sList.add("manago");
		sList.add("carrot");

		List<Double> dList1 = new ArrayList<>();
		dList1.add(10.5);
		dList1.add(200.1);
		dList1.add(30.0);

		display(iList1);
		display(sList);
		display(dList1);

		System.out.println(iList1);
		iList1.remove(Integer.valueOf(3));
		System.out.println(iList1);

		System.out.println(averageOfList(iList1));
		System.out.println(averageOfList(dList1));
		//averageOfList(sList);

	}

	public static double averageOfList(List<? extends Number> list) {
		double sum=0;
	
		for(Number n:list) {
			sum+=n.doubleValue();
		}
		return list.size()==0.0? 0: sum/list.size();
	}



	public static void remove(List<Integer> list, Integer ob) {
		/*
		 * for(Integer i:list) { System.out.print(i+"  "); if(i.equals(ob)) {
		 * list.remove(i); } }
		 */

		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			Integer i = itr.next();
			if (i.equals(ob)) {
				itr.remove();
			}
		}

		ListIterator<Integer> listIterator = list.listIterator();
		while (listIterator.hasNext()) {

		}
	}

	public static void display(List<?> list) {
		// list.add(null);
		/*
		 * for(int i=0;i<list.size();i++) { System.out.print(list.get(i)+"  "); }
		 */

		/*
		 * for(Object o :list) { System.out.print(o+" "); }
		 */

		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + "  ");
		}

		System.out.println();
	}

	public static void genericRule() {
		// Generic<int> iob1 = new Generic<int>(10); //primitives types are not allowed
		// in generic

		// Generic<Object> ob= new Generic<Integer>(); //both angular bracket should
		// contain the same value
		// In java 7, you can write diamond operation in right side
		// Eg List<Integer> list = new ArrayList<>();

		// Type Erasure

		List iList = new ArrayList();
		iList.add(10);
		iList.add(200);
		iList.add(30);
		iList.add("hello");

		List<Integer> iList1 = new ArrayList<>();
		iList1.add(10);
		iList1.add(200);
		iList1.add(30);
		// iList1.add("string");

		List<String> sList = new ArrayList<String>();
		sList.add("apple");
		sList.add("manago");
		sList.add("carrot");

		List list = iList1;
		list.add("apple");

		System.out.println(iList);
		System.out.println(iList1);
		System.out.println(sList);

		Integer[] arr = new Integer[3];
		arr[0] = 10;
		// arr[1]="abc";

		Object[] oarr = arr;
		oarr[1] = "abc";

		System.out.println(arr);

	}

	public static void genericTest() {
		Generic<Integer> iob1 = new Generic<Integer>(10);

		Generic<String> sob1 = new Generic<String>("string");

		// sob1 = iob1;

		Integer i = iob1.getData();
		String s = sob1.getData();

		System.out.println(i);
		System.out.println(s.length());
	}

	public static void generalTest() {
		General iob1 = new General(10);

		General sob1 = new General("string");

		sob1 = iob1;

		Integer i = (Integer) iob1.getData();
		String s = (String) sob1.getData();

		System.out.println(i);
		System.out.println(s.length());
	}

}
