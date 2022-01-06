
public class Test1 {
	
	public static void main(String[] args) {
		MyDate d1=new MyDate();
		//d1.MyDate();
		d1.printDate();
		d1.setYear(2002); //d1.yy =2002;
		d1.printDate();
		
		
		MyDate d2=new MyDate(1,1,2000);
		d2.printDate();
		//System.out.println(d2.yy);
		System.out.println(d2.getYear());
		
		MyDate d3=new MyDate(1,1,2001);
		MyDate d4=new MyDate(2,2,2004);
		
	}
	
	public static void swap(MyDate d1, MyDate d2) {
		
	}

}
