
public class MyDate {
	private int dd;
	private int mm;
	private int yy;

	// default constructor
	MyDate() {
		System.out.println("insde MyDate()");
		dd = 1;
		mm = 1;
		yy = 2001;
	}

	// paramterized constructor
	MyDate(int d, int m, int y) {
		System.out.println("insde MyDate(int,int,int)");
		dd = d;
		mm = m;
		yy = y;
	}
	
	/*void init(int d, int m, int y) {
		System.out.println("insde init method");
		dd = d;
		mm = m;
		yy = y;
	}*/

	void printDate() {
		System.out.println(dd + "/" + mm + "/" + yy);
	}
	
	void setYear(int y) {
		yy=y;
	}
	
	int getYear() {
		return yy;
	}
	
}
