package Selenium_java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TwelthApril {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ****find and count
		String s = "aeiouaeiouaeiouaeiou";

		List<Character> list = new ArrayList<Character>();
		HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();

		for (int i = 0; i <= s.length() - 1; i++) {

			int count = 1;
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {

				if (!list.contains(s.charAt(i))) {
					list.add(s.charAt(i));
					for (int j = i + 1; j <= s.length() - 1; j++) {
						if (s.charAt(i) == s.charAt(j)) {
							count++;
						}
					}
					hashmap.put(s.charAt(i), count);
				}
			}

		}
		System.out.println(hashmap);

		// **** string reverse

		String str = "Hi Moon";
		for (int i = 0; i <= str.length() - 1; i++) {
			System.out.print(str.charAt(i) + "    ");

		}
		for (int j = str.length() - 1; j >= 0; j--) {
			System.out.print(str.charAt(j));
		}

		// ****Array to string

		int[] array = { 1, 2, 3, 7 };
		String s1 = array.toString();
		System.out.println(s1);

		// *****pattern
		for (int a = 1; a <= 5; a++) {
			for (int b = 1; b <= a; b++) {
				System.out.print(b + " " + " ");
			}
			System.out.println();
		}

		// *****pattern reverse
		for (int a1 = 5; a1 >= 0; a1--) {
			for (int b = 1; b <= a1; b++) {
				System.out.print(b + " ");
			}
			System.out.println();
		}
		// *****Pyramid

		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		// *****Pyramid reverse

		for (int i = 6; i >= 1; i--) {
			for (int j = 6; j >= 1 - i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

		// ********* Min
		int[] a = { 1, 2, 3, 4, 9, 5 };

		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (min > a[i]) {
				min = a[i];
			}

		}
		System.out.println(min + " is the minimum no of array");

		// ********* Max
		int max = a[0];
		for (int j = 1; j < a.length; j++) {
			if (max < a[j]) {
				max = a[j];

			}
		}
		System.out.println(max + " is the maximum no.of array");

		// ******** Reverse or swap

		int[] b = { 6, 4, 8, 3, 0, 1 };
		int swap;

		for (int i = 0; i <= b.length - 1; i++) {

			System.out.print(b[i] + "  ");
		}

		for (int j = 0; j <= (b.length - 1) / 2; j++) {

			swap = b[j];
			b[j] = b[b.length - j - 1];
			b[b.length - j - 1] = swap;

		}
		for (int k = 0; k <= b.length - 1; k++) {
			System.out.println(b[k] + "  ");
		}

		// ******** divide by 2
		int[] c = { 2, 4, 6, 8, 11 };
		for (int i = 0; i <= c.length - 1; i++) {
			if ((c[i] % 2) == 0) {
				System.out.println("even no" + c[i]);
			} else {
				System.out.println("odd no" + c[i]);
			}}

			// ****Palindrome
			int n = 787;
			int temp = n;
			int palin;
			int sum = 0;
			while (n > 0) {
				palin = n % 10;
				sum = sum * 10 + palin;
				n = n / 10;
			}
				if (temp == sum) {
					System.out.println(" print palindrome"+ temp);
				} else {
					System.out.println("print non- palindrome");
				}
			
		}

	}

