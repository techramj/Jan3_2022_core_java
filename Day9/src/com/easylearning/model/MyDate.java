package com.easylearning.model;

public final class MyDate {

	private int dd;
	private int mm;
	private int yy;

	private int[] lastDaysOfMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 20, 31 };
	private static final int NO_OF_MONTH = 12;
	private static final int LAST_DAY_OF_LEAF_MONTH = 29;

	public MyDate() {
		// TODO Auto-generated constructor stub
	}

	public MyDate(int dd, int mm, int yy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}

	public int getDd() {
		if(dd<1 || dd>lastDay()) {
			dd=1;
		}
		return dd;
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

	public void setDd(int dd) {
		this.dd = dd;
	}

	@Override
	public String toString() {
		return "MyDate [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
	}

	public MyDate nextDay() {
		int dd = 0;
		int mm = 0;
		int yy = 0;
		if (isLastDayOfMonth()) {
			if (this.mm == 12) {
				yy = this.yy + 1;
				mm = 1;
				dd = 1;
			} else {
				mm = this.mm + 1;
				dd = 1;
				yy = this.yy;
			}
		} else {
			dd = this.dd + 1;
			mm = this.mm;
			yy = this.yy;
		}
		return new MyDate(dd, mm, yy);
	}

	public boolean isLastDayOfMonth() {
		if (mm == 2 && isLeapYear()) {
			return dd == LAST_DAY_OF_LEAF_MONTH;
		} else {
			return dd == lastDaysOfMonth[mm - 1];
		}
	}

	public boolean isLeapYear() {
		return yy % 400 == 0 || (yy % 100 != 100 && yy % 4 == 0);
	}

	public MyDate addMonths(int num) {
		int year = num / NO_OF_MONTH;
		int month = num % NO_OF_MONTH;
		int mm = this.mm + month;

		if (mm > NO_OF_MONTH) {
			mm = mm - NO_OF_MONTH;
			year = year + 1;
		}

		MyDate d = new MyDate(dd, mm, yy + year);
		if (d.getDd() > d.lastDay()) {
			d.setDd(d.lastDay());
		}
		if (d.getMm() == 2 && d.isLeapYear()) {
			d.setDd(LAST_DAY_OF_LEAF_MONTH);
		}
		return d;
	}

	public int lastDay() {
		if (mm == 2 && isLastDayOfMonth()) {
			return LAST_DAY_OF_LEAF_MONTH;
		} else {
			return lastDaysOfMonth[mm - 1];
		}
	}

}
