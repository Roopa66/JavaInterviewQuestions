

package Selenium_java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Pract_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="sjhdfghjkljhgertyuiaeiouasdfghjj";
		String s2="roopa is a";
		List<Character> list =new ArrayList<Character>();
		HashMap<Character,Integer> hashmap = new HashMap<Character, Integer>();
		for(int i=0; i<s.length()-1;i++) {
			int count =1;
			if(((s.charAt(i))== 'a')||((s.charAt(i))=='e')||((s.charAt(i))=='i')||((s.charAt(i))=='o')||((s.charAt(i))=='e')) {
			char ch =s.charAt(i);
				if(!list.contains(ch)) {
					list.add(ch);
					for(int j=i+1;j<=s.length()-1;j++) {
						if(s.charAt(i)==s.charAt(j)) {
							count++;
						}
					}
					hashmap.put(s.charAt(i), count);
				}
			}
		}
		System.out.println(hashmap);
		
		String[] s1=s2.split(" ");
		System.out.print(s1);
		
		for (int i=0; i<s.length()-1;i++) {
			System.out.print(s.charAt(i) + "   ");
		}
		for(int k=s.length()-1;k>=0;k--) {
			System.out.print(s.charAt(k) + " ");
		}
		
		
		
	}

}
