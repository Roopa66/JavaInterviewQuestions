package Selenium_java;

public class Just {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "hi bro";
		String[] st = s.split(" ");
		System.out.println(st);

		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.println(s.charAt(i));
		}

		int[] array = { 1, 3, 8, 9, 3, 5 };
		int temp = array[0];
		for (int k = 0; k <= (array.length - 1) / 2; k++) {
			temp = array[k];
			array[k] = array[array.length - k - 1];
			array[array.length - k - 1] = temp;
		}
		for (int f = 0; f <= array.length - 1; f++) {
			System.out.print(array[f]);
		}
	}
}
