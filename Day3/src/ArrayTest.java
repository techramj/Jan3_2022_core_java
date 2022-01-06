
public class ArrayTest {

	public static void main(String[] args) {
		int a = 10;

		int arr[];
		arr = new int[5];

		int barr[] = new int[3];

		int[] carr = { 1, 2, 3, 4 };

		int[] darr = new int[] { 11, 22, 33, 44 };

		display1(carr);
		reverseArray(carr);
		display1(carr);

	}

	public static void display(int[] arr) {
		for (int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
	}

	public static void display1(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void reverseArray(int[] arr) {
		int len = arr.length;
		for(int i=0;i<len/2;i++) {
			int x= arr[i];
			arr[i]= arr[len-1-i];
			arr[len-1-i] = x;
		}
	}
	
	

} 
