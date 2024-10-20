package Selenium_java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class New {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s ="Roop is a good a girla";
		String[] split = s.split(" ");
		System.out.println(split[0]);
		System.out.println(split[1].trim());
		System.out.println(split[2].trim());
		//System.out.println(split[3].trim());
		// in split u can't give directly object for print i.e split u need to give index of object i.e split[0,1,2,
	
		// String print
		for(int i=0;i<=s.length()-1;i++) {
			System.out.print(s.charAt(i) + " ");
		}
		// String reverse output =alrig a doog a si pooR
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i) );
		}
		
		//string reverse by words output =girlaagoodaisRoop
		for (int i=split.length-1; i>=0;i--) {
			System.out.print(split[i]);
		}
		String string = "AADFGHJKASBNMGHJRTYUIKBCDNN";
		List<Character> list = new ArrayList<Character>();
		HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();
		//PRINT ABCD ONLY
		for (int i=0;i<=string.length()-1;i++) {
			int count =0;
			if((string.charAt(i)=='A')||(string.charAt(i)=='B')||(string.charAt(i)=='C')||(string.charAt(i)=='D')) {
				if(!list.contains(string.charAt(i))) {
					list.add(string.charAt(i));
					char ch = string.charAt(i);
					for(int j=i+1;j<=string.length()-1;j++) {
						if(string.charAt(i)==string.charAt(j)) {
						count++;	
						}
					}
					hashmap.put(string.charAt(i), count);
					System.out.println(ch);
				}
			}
		
		
		System.out.println(hashmap);
	}}

}
