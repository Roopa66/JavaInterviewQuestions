package Selenium_java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FebFifth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "asdfghjkmbvcxzqwertyuiop";
		List<Character> list = new ArrayList<Character>();
		HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();
		char ch;
		for (int i = 0; i <= s.length() - 1; i++) {
			int count = 1;
			if ((s.charAt(i)) == 'i' || (s.charAt(i)) == 'o' || (s.charAt(i)) == 'u' || (s.charAt(i)) == 'a') {
				if (!list.contains(s.charAt(i))) {
					list.add(s.charAt(i));

					for (int j = i + 1; j <= s.length() - 1; j++) {
						if (s.charAt(i) == s.charAt(j)) {
							count++;
							ch = s.charAt(i);
						}
					}
					hashmap.put(s.charAt(i), count);

				}
			}}
		

		System.out.println(hashmap);

	}

}
