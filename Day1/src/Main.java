
public class Main {

	public static void main(String[] args) {
		
		printFibbSeries();
	    for(int i=1;i<=15;i++) {
	    	System.out.print(fibb(i)+"  ");
	    }
	    System.out.println();
	    System.out.println("1234:  "+sumOfDigit(1234));
	    System.out.println("12344:  "+sumOfDigit(12344));
	    System.out.println("12234:  "+sumOfDigit(12234));
	    System.out.println("122234:  "+sumOfDigit(122234)); 
	}
	
	public static int sumOfDigit(int x) {
		if(x<10) {
			return x;
		}
		return x%10 + sumOfDigit(x/10);
	}
	
	public static int fibb(int x) {
		 /*fibb(x)  x=1 then 0
		          x=2 then 1
		          x>2 then fibb(x-2) + fibb(x-1)
		   */
		if(x==1) {
			return 0;
		}
		
		if(x==2) {
			return 1;
		}
		
		if(x>2) {
			return fibb(x-2)+fibb(x-1);
		}
		
		return 0;
		          
		          
	}
	
	public static void printFibbSeries() {
		int a=0;
		int b=1;
		System.out.print(a+" "+b+" ");
		for(int i=1;i<=8;i++) {
			int c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
		System.out.println();
	}
	
	public static void switchCaseExp(int x) {
		switch(x) {

		case 1:  System.out.println("case 1"); break;
				
		case 2: System.out.println("case 2"); break;
			
		case 3: System.out.println("case 3"); break;
			
		default: System.out.println("default"); 
			
		}
		
		
		
	}
	
	public static void loopExp() {
		for(int i=1;i<=10;i++) {
			System.out.println(i+" -> "+(i+1));
			if(i==5) {
				continue;
			}
			System.out.println(i+" -> "+(i-1));
		}
		System.out.println("loop end");
	}

	/*
	 * 1 12 123 1234 12345
	 */
	public static void printPattern1() {
		int k = 0;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				int y = (++k) % 10;
				System.out.print(y);
			}
			System.out.println();
		}
	}

	public static void printPattern2(int row) {

		for (int i = 1; i <= row; i++) {
			// space
			for (int j = 1; j <= row - i; j++) {
				System.out.print(" ");
			}

			// star
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void printPattern3(int row) {
		
		int ch=65;

		for (int i = 1; i <= row; i++) {
			// space
			for (int j = 1; j <= row - i; j++) {
				System.out.print(" ");
			}

			// star
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print((char)ch);
				ch++;
				if(ch==91) {
					ch=65;
				}
			}
			System.out.println();
		}
	}
	
	public static void printPattern4(int row) {

		for (int i = 1; i <= row; i++) {
			int k=Math.abs(i-4);
			// space
			for (int j = 1; j <= k; j++) {
				System.out.print(" ");
			}

			int l = 4-k;
			// star
			for (int j = 1; j <= 2 * l - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
