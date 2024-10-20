package Selenium_java;

public class TwentyFifthMay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// palindrome
		int n = 122;
		int sum = 0;
		int palin;
		int temp = n;
		while (n > 0) {
			palin = n % 10;
			sum = sum * 10 + palin;
			n = n / 10;
		}
		if (sum == temp) {
			System.out.println("i's palin");
		} else {
			System.out.println("it's not palin");
		}

		String str = "RadaradaR";
		String reverse = "";

		for (int i = str.length() - 1; i >= 0; --i) {
			reverse = reverse + str.charAt(i);
		}
		if (str.toLowerCase().equals(reverse.toLowerCase())) {
			System.out.println(str + " is a Palindrome String.");
		} else {
			System.out.println(str + " is not a Palindrome String.");
		}

		System.out.println(str.toLowerCase().compareTo(reverse.toLowerCase()));
		System.out.println(str.concat(str));
		System.out.println(str.contains("R"));
		System.out.println(str.equalsIgnoreCase(reverse));
		System.out.println(str.endsWith("R"));
		System.out.println(str.hashCode());
		//System.out.println(str.notify());
	}
}
