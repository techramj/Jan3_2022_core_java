
public class Array2dTest {
	
	public static void main(String[] args) {
		
		
		int[] a =new int[] {1,2};
		//a[2] = 10;
		
		int[] b =new int[] {2,4};
		
		int[][] arr = {a,b};
		
		int[][] barr = new int[2][3];
		int[][] carr = {{1,2},{2,3,4},{4,5,6}};
		
		display(arr);
		display(barr);
		display(carr);
		
		System.out.println(carr[1][2]);
		
		
		int[][][] xarr=new int[2][][];
		xarr[0] = arr;
		xarr[1] = carr;
		//xarr[2] = carr;	
	}
	
	public static void display(int[][] arr) {
		for(int[] ar :arr) {
			for( int a :ar) {
				System.out.print(a+" ");
			}
			System.out.println();
		}
		System.out.println("--------------------------------------------------");
	}
	
	
	public static void display1(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("--------------------------------------------------");
	}
	
	

}