package com.easylearning.main;

import com.easylearning.MyDate;
import static com.easylearning.MyDate.*;

public class Main {

	public static void main(String[] args) {
		MyDate d1 = getInstance();

		MyDate d2 = getInstance(2, 2, 2022);
		d1.display();
		d2.display();

		MyDate d3 = MyDate.getInstance();
		d3.display();
		
		MyDate d4 = getInstance();
		MyDate d5 = getInstance();
		
		MyDate d6 = getInstance1();
		MyDate d7 = getInstance1();
		
		System.out.println(d4==d5);
		System.out.println(d6==d7);

		d1 = null;
		d2 = null;
		d3 = null;
		
		//System.gc();

			
	}

}
