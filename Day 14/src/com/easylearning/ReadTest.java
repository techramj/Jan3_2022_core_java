package com.easylearning;

import java.io.BufferedReader;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class ReadTest {

	public static void main(String[] args) {
		String filename = "D:\\Ram\\classes\\workspace\\aspiring\\3Jan2022\\Day14\\src\\com\\easylearning\\Test1.java";
		try {
			readDemo4(filename);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void fileDemo() throws IOException {
		String filename = "D:\\Ram\\classes\\workspace\\aspiring\\3Jan2022\\Day14\\src\\com\\easylearning\\Test1.java";
		File file = new File(filename);
		System.out.println(file.exists());
		System.out.println("Read: " + file.canRead());
		System.out.println("write: " + file.canWrite());

		System.out.println("--------------------------------");
		File file1 = new File("b.txt");
		System.out.println(file1.getAbsolutePath());
		System.out.println(file1.exists());
		boolean flag = file1.createNewFile();
		System.out.println(flag);
		System.out.println(file1.canRead());
		System.out.println(file1.canWrite());

		System.out.println("------------------------------");
		File file2 = new File("test");
		System.out.println(file2.mkdir());
		System.out.println(file2.isDirectory());

	}

	public static void readDemo1(String filename) {
		// open the file
		// read the file
		// close the file

		FileInputStream fis = null;

		try {
			fis = new FileInputStream(filename);
			int i = fis.read();
			while (i != -1) {
				System.out.print((char) i);
				i = fis.read();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void readDemo2(String filename) {

		try (FileInputStream fis = new FileInputStream(filename);) {

			int i = fis.read();
			while (i != -1) {
				System.out.print((char) i);
				i = fis.read();
				Thread.sleep(5);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public static void readDemo3(String filename) {

		try (FileInputStream fis = new FileInputStream(filename); DataInputStream dis = new DataInputStream(fis);) {

			String str = dis.readLine();
			while (str != null) {
				System.out.println(str);
				Thread.sleep(10);
				str = dis.readLine();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public static void readDemo4(String filename) {

		try (Scanner sc = new Scanner(new File(filename))) {

			/*
			 * String str=sc.nextLine(); while(str!=null) { System.out.println(str);
			 * Thread.sleep(10); str=sc.nextLine(); }
			 */
			while (sc.hasNext()) {
				System.out.println(sc.nextLine());
				Thread.sleep(10);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public static void readDemo5(String filename) {

		try (FileReader reader = new FileReader(filename);) {
			//TODO logic to read the file
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void readDemo6(String filename) {

		try (FileReader fr = new FileReader(filename);
				BufferedReader reader= new BufferedReader(fr);) {
			//reader.readLine()
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
