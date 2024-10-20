package Selenium_java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Febtwenty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 131;
		int temp;
		int sum = 0;
		int pal;
		temp = n;
		while (n > 0) {
			pal = n % 10;//131%10 = 1, 13%10=3,
			sum = sum * 10 + pal;//0+1=1, 1*10+3=13,
			n = n / 10;//131/10=13,13/10=1
		}
		if (temp == sum) {
			System.out.println("  palindrome");
		} else {
			System.out.println(" not a palindrome");
		}

		String s = "hi roopa";

		List<Character> list = new ArrayList<Character>();
		HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();
		for (int i = 0; i <= s.length() - 1; i++) {
			int count = 1;
			if ((s.charAt(i)) == 'a' || (s.charAt(i)) == 'e' || (s.charAt(i)) == 'i' || (s.charAt(i)) == 'o'
					|| (s.charAt(i)) == 'u') {
				if (!list.contains(s.charAt(i))) {
					list.add(s.charAt(i));

					// System.out.println(list);
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
		s.strip();

		for (int k = s.length()-1 ; k >= 0; k--) {
			System.out.print(s.charAt(k));
		}
		String[] s1= s.split(" ");
		for (int k = s1.length-1 ; k >= 0; k--) {
			System.out.print(s1);
	}}
}
