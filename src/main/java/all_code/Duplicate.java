package all_code;

import java.util.ArrayList;
import java.util.HashMap;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "INTERACTIVE";

		ArrayList<Character> list = new ArrayList<Character>();
		HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();
		
		for (int i = 0; i <= s.length() - 1; i++) {
			int count = 1;
			if (!list.contains(s.charAt(i))) {
				list.add(s.charAt(i));
			
			for (int j = i + 1; j <= s.length() - 1; j++) {
				if (s.charAt(i) == s.charAt(j)) {
					count++;
				}
			}
			hashmap.put(s.charAt(i), count);
			}}
		
		System.out.println(hashmap);
	
}}
