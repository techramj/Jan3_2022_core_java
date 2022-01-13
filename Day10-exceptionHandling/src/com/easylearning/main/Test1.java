package com.easylearning.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test1 {

	public static void main(String[] args) {
		

		try {
		main(args);
		}catch(Error e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			
		}
	}
	
	public static void readFileSample5() throws IOException,InterruptedException{
		String filename = "D:\\Ram\\classes\\workspace\\aspiring\\3Jan2022\\Day10-exceptionHandling\\src\\com\\easylearning\\main\\Test1.java";
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(filename);
			int x = fis.read();
			while (x != -1) {
				System.out.print((char) x);
				x = fis.read();
				//Thread.sleep(1);
			}

		}finally {
			System.out.println("\nfinally block executed");
			try {

				if (fis != null) {

					fis.close();
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}

	}
	
	
	
	public static void tryWithResourceSampeCode() {
		try (A ob = new A()) {
			System.out.println("inside try");
		} catch (Exception e) {
			System.out.println("inside catch");
		}
		
		A ob = null;
		try  {
			ob=new A();
			System.out.println("inside try");
		} catch (Exception e) {
			System.out.println("inside catch");
		}finally {
			if(ob!=null) {
			  try {
				ob.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			}
		}
	}

	public static void readFileSample2() {
		String filename = "D:\\Ram1\\classes\\workspace\\aspiring\\3Jan2022\\Day10-exceptionHandling\\src\\com\\easylearning\\main\\Test1.java";
		// ARM
		try (FileInputStream fis = new FileInputStream(filename);) {
			int x = fis.read();
			while (x != -1) {
				System.out.print((char) x);
				x = fis.read();
				Thread.sleep(1);
			}

		} catch (FileNotFoundException e) {
			System.out.println("invalid filename");
		} catch (IOException e) {
			System.out.println("not able to read file");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void readFileSample1() {
		String filename = "D:\\Ram1\\classes\\workspace\\aspiring\\3Jan2022\\Day10-exceptionHandling\\src\\com\\easylearning\\main\\Test1.java";
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(filename);
			int x = fis.read();
			while (x != -1) {
				System.out.print((char) x);
				x = fis.read();
				Thread.sleep(1);
			}

		} catch (FileNotFoundException e) {
			System.out.println("invalid filename");
		} catch (IOException e) {
			System.out.println("not able to read file");
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			System.out.println("\nfinally block executed");
			try {

				if (fis != null) {

					fis.close();
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}

	}

	public static void readFileSample() throws Exception {
		String filename = "D:\\Ram1\\classes\\workspace\\aspiring\\3Jan2022\\Day10-exceptionHandling\\src\\com\\easylearning\\main\\Test1.java";
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(filename);
			int x = fis.read();

			while (x != -1) {
				System.out.print((char) x);
				x = fis.read();
				Thread.sleep(1);
			}

		} catch (FileNotFoundException e) {
			System.out.println("invalid filename");
			throw e;
		} catch (IOException e) {
			System.out.println("not able to read file");
			throw e;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		try {
			System.out.println("closing the file");
			if (fis != null) {

				fis.close();
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public static void sample3(String[] args) {
		int num1 = 0;
		int num2 = 0;
		try {
			num1 = Integer.parseInt(args[0]);
		} catch (Exception e) {

		}

		try {
			num2 = Integer.parseInt(args[1]);
		} catch (Exception e) {

		}

		double result = num1 / num2;
		System.out.println(result);
	}

	public static void sample2(String[] args) {
		try {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);

			double result = num1 / num2;
			System.out.println(result);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Please pass the commnad line argument");
		} catch (NumberFormatException | ArithmeticException | IndexOutOfBoundsException e) {
			System.out.println("Invalid Number");
		} catch (Exception e) {
			System.out.println("error!!!!!!!!!");
		}
	}

	public static void sample1(String[] args) {
		try {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);

			double result = num1 / num2;
			System.out.println(result);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Please pass the commnad line argument");
			throw e;

		} catch (NumberFormatException e) {
			System.out.println("Invalid argument. Please pass the number only!!");
		} catch (ArithmeticException e) {
			System.out.println("2nd Argument shold be non zero");
		} catch (Exception e) {
			System.out.println("error!!!!!!!!!");
		}
	}

	public static void sample0(String[] args) {
		if (args.length == 0) {
			System.out.println("Please pass the commnad line argument");
			return;
		}

		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);

		double result = num1 / num2;
		System.out.println(result);

	}

}
