package Selenium_java;

import java.util.ArrayList;
import java.util.HashMap;

public class AddingInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 12345;
		int sum = 0;
		int sub = 0;
		while (n != 0) {
			sum += n % 10;
			n = n / 10;

		}
		System.out.println(sum);
		int k = 1234567890;
		int count = 0;
		int tem;
		while (k != 0) {
			tem = k % 10;
			count++;
			k = k / 10;

		}
		System.out.println(count);

		// find duplicates
		String s = "interactive";

		ArrayList<Character> list = new ArrayList<Character>();
		HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();
		for (int i = 0; i <= s.length() - 1; i++) {
			int count1 = 1;
			if (!list.contains(s.charAt(i))) {
				list.add(s.charAt(i));

				for (int j = i + 1; j <= s.length() - 1; j++) {
					if (s.charAt(i) == s.charAt(j)) {
						count1++;
					}
				}
				hashmap.put(s.charAt(i), count1++);

			}

		}
		System.out.println(hashmap);
		
		//palindrome
		String st = "121";
		StringBuilder build = new StringBuilder(st);
		String output = build.reverse().toString();
		if( st.equalsIgnoreCase(output)) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}
		
		//reverse String
		String str = "hi he kkk line";
		String[] split = str.split(" ");
		for( int i=0; i<=str.length()-1;i++) {
			System.out.print(str.charAt(i));
		}
		for( int  j=str.length()-1;j>=0;j--) {
			
			System.out.print(str.charAt(j));
		}
		// reverse every word in string
		StringBuilder bd = new StringBuilder();
		for( String head :split) {
			StringBuilder buy = new StringBuilder(head);	
			bd.append(buy.reverse().toString()).append(" ");
			String out = bd.toString().strip();
			System.out.println(out);
		}
		//reverse integer
		 int[] arr = {1,2,3,4,5,6};
		 int swap;
		for( int k1 =0; k1<=(arr.length-1)/2;k1++) {
			swap = arr[k1];
			arr[k1] =arr[arr.length-k1-1];
			arr[arr.length-k1-1] = swap;
		}
			for( int m=0;m<=arr.length-1;m++) {
				System.out.print(arr[m]);
			}
		
		//factorial
			int p=5;
			int fact =1;
			for( int i =1;i<=p;i++) {
				fact*=i;
				
			}
			System.out.print(" " + fact);}
			
			// leep year
			public static boolean leapYear(int year) {
			if(year%4 == 0) {
				if(year%100==0) {
					return year%400 ==0;
				}else {
					return true;
					
				        
			}
	}else {
		return false;
	}
	}

}
