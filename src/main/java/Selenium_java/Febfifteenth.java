package Selenium_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Febfifteenth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Character> list = new ArrayList<Character>();
		HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();
		String s = "asdfghjkpoiuytaeiouaeioiooooooooorewqzxcvbnm,";
		for (int i = 0; i <= s.length() - 1; i++) {
			int count = 1;
			if ((s.charAt(i) == 'a') || (s.charAt(i) == 'e') || (s.charAt(i) == 'i') || (s.charAt(i) == 'o')
					|| (s.charAt(i) == 'u')) {
				char ch = s.charAt(i);

				//System.out.println(ch);
				if (!list.contains(ch)) {

					list.add(ch);
					for (int j = i + 1; j <= s.length() - 1; j++) {
						if (s.charAt(i) == s.charAt(j)) {
							count++;

						}
					}
					hashmap.put(s.charAt(i), count);
				
			}}}
				System.out.println(hashmap);
			
				String st = "hi mr.robot you are the worst";
				char[] ch=st.toCharArray();
				String[] stt=st.split(" ");
				System.out.println(ch);
				System.out.println(Arrays.toString(stt));
				}
}