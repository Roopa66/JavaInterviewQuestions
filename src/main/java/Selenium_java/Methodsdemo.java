package Selenium_java;

public class Methodsdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// main method allow code for execution
		Methodsdemo mn = new Methodsdemo();
		MethodsDemo1 mn1 = new MethodsDemo1();
		int l = mn.getData();
		mn1.getUserData();// inside the data
		int l1 = mn1.getUserData();// inside the data with return type
		System.out.println(l);
		System.out.println(l1);
		
		//int k = mn.getData1();
		//or
		int k = getData1();// u can call directly inside of this class without object
		
	}
	// public method - u can access this method in any classes

	public int getData() {

		System.out.println("hello world");
		return 2024;
	}

	public static int getData1() {//u don't need object for this to call

		System.out.println("hello world");
		return 2024;
	}

}
