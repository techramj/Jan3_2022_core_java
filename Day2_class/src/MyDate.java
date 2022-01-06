
public class MyDate {
	private int dd;
	private int mm;
	private int yy;

	// default constructor
	public MyDate() {
		System.out.println("insde MyDate()");
		dd = 1;
		mm = 1;
		yy = 2001; 
	}

	// paramterized constructor
	public MyDate(int d, int m, int y) {
		System.out.println("insde MyDate(int,int,int)");
		dd = d;
		mm = m;
		yy = y;
	}
	
	public void printDate() {
		System.out.println(dd + "/" + mm + "/" + yy);
	}
	
	public void setYear(int y) {
		yy=y;
	}
	
	public int getYear() {
		return yy;
	}
}
