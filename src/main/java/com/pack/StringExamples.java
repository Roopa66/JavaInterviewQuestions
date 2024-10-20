package com.pack;

public class StringExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// count of a characters in string
		String s = "asdfghjkpoiuytrewq";

		// first
		int count = 0;
		for (int i = 0; i <= s.length() - 1; i++) {
			count += 1;
		}
		System.out.println("count of a string =" + count);

		// second
		StringBuilder sb = new StringBuilder(s);
		int l = sb.length();
		System.out.println(l);

		// third
		int c = s.length();
		System.out.println(c);

		// fourth
		System.out.println(Integer.valueOf(s.length()));

		/* count of a word in a string */

		// 1
		String st = " Hi are you";
		String[] split = st.split(" ");
		int cn = split.length - 1;

		System.out.println(cn);

		// 2
		int k = 0;
		for (int j = 0; j <= st.length() - 1; j++) {
			if (st.charAt(j) == ' ') {
				k++;
			}
		}
		System.out.println(k);

		// Reverse the character in string
		String sg = "asdfghjkl";
		StringBuilder build = new StringBuilder(sg);
		String op = build.reverse().toString();

		System.out.println(op);
		// 2nd method
		Character ch;

		for (int i = sg.length() - 1; i >= 0; i--) {

			ch = new Character(sg.charAt(i));
			System.out.print(ch);

		}
		System.out.println();
		

		// Reverse the words in string
		String rev = "hi hi ddd dog cat";
		//print prime numbers of n numbers where n=4;
		
		int cn1 =0;
		int n =4;
		for( int i=n;i>=2;i--) {
			for( int j=2;j<=n;j++) {
				if(n%j ==0) {
					cn1++;
				}
			}
			if(cn1 == 1) {
				System.out.println(n);
				cn1=0;
			}
		}
		
		int n1=0;
		int k1=7;
		for(int i=k1;i>=2;i--);
		for(int j=2;j<=n1;j++) {
			if(k1%j==0) {
				n1++;
			}
		}
		if(n1==1) {
			
		}

	}

}
