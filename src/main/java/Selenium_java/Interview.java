package Selenium_java;

import java.util.ArrayList;

public class Interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 566, 34678, 90083, 3552434 };
		int arr = 0 ;

		for (int i = 0; i <= array.length - 1; i++) {

			 arr = array[i]%10;
			 System.out.println(arr);
		}
		
		int first = array[0] % 10;
		int two = array[1] % 10;
		int three = array[2] % 10;
		int four = array[3] % 10;
		System.out.print(first + " ");
		System.out.print(two + " ");
		System.out.print(three + " ");
		System.out.print(four + " ");

		String s = "hi rajolla are you ok";
		for (int i = s.length() - 1; i >= 0; i--) {

			System.out.print(s.charAt(i));
		}
		String[] words = s.split(" ");
		StringBuilder response = new StringBuilder();

		for (String word : words) {
			StringBuilder build = new StringBuilder(word);
			response.append(build.reverse().toString()).append(" ");
		}
		String output = response.toString().trim();
		System.out.print(output+ " ");
		
		String str = "MADAM";
		StringBuilder palin = new StringBuilder(str);
		String newPalin =palin.reverse().toString();
		System.out.println(newPalin);
		boolean out = newPalin.equalsIgnoreCase(str);
		System.out.println(out);
		
		
		
		// factorial
		int n =10;
		int factorial =1;
		for(int i=1;i<=n;i++) {
			factorial*=i;
		}
		System.out.println(factorial);
		
		
		int[] a = {1542,234,677,345};
		
		for(int i=0;i<=a.length-1;i++) {
			arr=a[i]%10;
			System.out.println(arr);
			
		}
		int l=5;
		int facto =1;
		for(int i=1;i<=l;i++) {
			facto*=i;
			}
		System.out.println(facto);
		
		String string ="PAMAP";
		StringBuilder stringBuilder = new StringBuilder(string);
		String output1 = stringBuilder.reverse().toString();
		boolean o =output1.equalsIgnoreCase(string);
		System.out.println(o);
		
		String sgs = "hi ke nnnn mens are ";
		String[] sgs1 =sgs.split(" ");
		StringBuilder stringBuilde = new StringBuilder();
		for(String mnc :sgs1) {
			StringBuilder stringBuild = new StringBuilder(mnc);	
			stringBuilde.append(stringBuild.reverse().toString()).append(" ");
			stringBuilde.toString().trim();
		}
			System.out.println(stringBuilde);
			
			int[] reverse = {1,4,5,6,3,7};
			int swap;
			int min = reverse[0];
			int max = reverse[0];
			for( int j=0;j<=reverse.length-1;j++) {
				if(min>reverse[j]) {
					min=reverse[j];
				}
				if(max<reverse[j]) {
					max=reverse[j];
				}
				
			}
			System.out.println("min" + min);
			System.out.println("max" + max);
			
			for( int i=0;i<=(reverse.length-1)/2;i++) {
			swap =	reverse[i];
			reverse[i]=reverse[reverse.length-i-1];
			reverse[reverse.length-i-1]=swap;
			}
			for( int j=0;j<=reverse.length-1;j++) {
				System.out.print(reverse[j]);
			}
			
			String d ="happytearsaianduareokright";
			ArrayList<Character> list =new ArrayList<Character>();
			for (int i=0;i<=d.length()-1;i++) {
				if(d.charAt(i)=='a'||d.charAt(i)=='e'||d.charAt(i)=='i'||d.charAt(i)=='o'||d.charAt(i)=='u') {
					if(!list.contains(d.charAt(i))) {
						list.add(s.charAt(i));
						System.out.println(list);
					}
				}
			}
			
			
		}
		}
	

