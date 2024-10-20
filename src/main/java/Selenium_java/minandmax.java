
package Selenium_java;

public class minandmax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 2, 3, 4, 6, 8, 10 };
		int temp = a[0];
		int max = a[0];
		for (int i = 1; i < a.length; i++) {

			if (max < a[i]) {
				max = a[i];

			}
		}
		System.out.println(max + " is the maximum no.of a");
		int min = a[0];
		for (int j = 1; j < a.length; j++) {
			if (min > a[j]) {
				min = a[j];
			}
		}
		System.out.println(min + " is the minimum number of a");

		// Reverse

		int[] b = {2,3,4,6,8,10};
		int swap;
		
		for(int i=0;i<=(b.length-1)/2;i++) {
			
			swap =b[i];
			b[i] = b[b.length-i-1];
			b[b.length-i-1] = swap;
			
			
		}

		for(int j=0;j<=b.length-1;j++) {
			System.out.print(b[j] + " ");
		}

	}
}
