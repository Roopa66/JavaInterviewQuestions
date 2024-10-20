package Selenium_java;

import java.util.ArrayList;
import java.util.HashMap;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "INTERACTIVE";
		int count = 0;
		ArrayList<Character> list = new ArrayList<Character>();
		HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();

		for (int i = 0; i <= s.length() - 1; i++) {
			count = 1;
			if(s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' ||
			 s.charAt(i)=='O') {
			if (!list.contains(s.charAt(i))) {
				list.add(s.charAt(i));

				for (int j = i + 1; j <= s.length() - 1; j++) {
					if (s.charAt(i) == s.charAt(j)) {
						count++;
					}
				}
				hashmap.put(s.charAt(i), count);
			}}
			
		}
		System.out.println(hashmap);
	}
}