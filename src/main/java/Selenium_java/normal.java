package Selenium_java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class normal {

	public static void main(String[] args) {
		String s = "shjdhjshdjahjaewyioiudi";
		List<Character> list = new ArrayList<Character>();
		HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();

		for (int i = 0; i <= s.length() - 1; i++) {
			int count = 0;
			if (((s.charAt(i)) == 'a') || ((s.charAt(i)) == 'e') || ((s.charAt(i)) == 'i') || ((s.charAt(i)) == 'o')
					|| ((s.charAt(i)) == 'u')) {
				char s1 = s.charAt(i);
				if (!list.contains(s1)) {//duplicates not allow this condition
					list.add(s1);
					count++;
					//System.out.println(list);
					
					for (int j = i + 1; j < s.length(); j++) {
						
						if (s.charAt(i)==s.charAt(j)) {
							
							count++;
							}
						}
							hashmap.put(s.charAt(i), count);
							
						
					
				}
			}
		}
			System.out.println(hashmap);
		

	}
}
