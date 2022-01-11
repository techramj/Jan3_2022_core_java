package com.easylearning.model;

import java.util.Objects;

public class MyDate implements Cloneable{
	private int dd;
	private int mm;
	private int yy;

	// default constructor
	public MyDate() {
		dd = 1;
		mm = 1;
		yy = 2001;
	}

	// paramterized constructor
	public MyDate(int d, int m, int y) {
		dd = d;
		mm = m;
		yy = y;
	}

	public String toStirng() {
		return dd + "/" + mm + "/" + yy;
	}

	public int getDd() {
		return dd;
	}

	public void setDd(int dd) {
		this.dd = dd;
	}

	public int getMm() {
		return mm;
	}

	public void setMm(int mm) {
		this.mm = mm;
	}

	public int getYy() {
		return yy;
	}

	public void setYy(int yy) {
		this.yy = yy;
	}
	
	/*public MyDate clone() {
		//return this;
		return new MyDate(this.dd, this.mm, this.yy);
	}
	*/

	@Override
	public int hashCode() {
		return Objects.hash(dd, mm, yy);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof MyDate)) {
			return false;
		}
		MyDate other = (MyDate) obj;
		return dd == other.dd && mm == other.mm && yy == other.yy;
	}
	
	@Override
	public MyDate clone() throws CloneNotSupportedException {
		return (MyDate) super.clone();
	}
	
	
	

	

}
