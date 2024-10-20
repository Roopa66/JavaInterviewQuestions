package Selenium_java;

public class devideByTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 2, 3, 4, 6, 8, 12, 16, 22, 24 };
		for (int i = 0; i <= array.length - 1; i++) {
			if (array[i] % 2 == 0) {
				System.out.println(array[i] + " is multiplied by 2");
			//	break;
			} else {
				System.out.println(array[i] + " is not multiplied by 2");
			}
		}
		// swapp 2 numbers without using 3rd 
		
		int a = 9;
		int b= 1;
		a= a+b;
		b= a-b;
		a=a-b;
		
		System.out.println(a+ "," + b);
		
		int c= 2;
		int d = 4;
		c= c^d;
		d= c^d;
		c= c^d;
		
		System.out.println(c+ ","+ d);
	}

}
