package com.easylearning;

public class MyList {
	
	private Integer[] data;
	int size=-1;
	int capacity;
	
	public MyList() {
		data = new Integer[10];
		capacity=data.length;
	}
	
	public void add(Integer val) {
		if(size<capacity) {
			data[++size] = val;
		}else {
			capacity = capacity +10;
			Object data1 = new Object[capacity];
			//logic to copy data from data to data1
		}
	}
	
	public Integer get(int index) {
		return data[index];
	}
}
