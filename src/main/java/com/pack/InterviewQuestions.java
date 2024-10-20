package com.pack;

public class InterviewQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//find duplicates 
		String s ="asdfghjkllkjhgfdsa";
		System.out.println("duplicates");
		for(int i=0;i<=s.length()-1;i++) {
			int count=0;
			for( int j=i+1;j<=s.length()-1;j++) {
				
				
				if(s.charAt(i)==s.charAt(j)) {
					count++;
					System.out.print(s.charAt(i)+ "= " +count + ",");	
				}
			}
			
		}
		//The Fibonacci series is a series of elements where, the previous two elements
		//are added to get the next element, starting with 0 and 1.  
		
		int n=6,first =0, sec=1;
		System.out.println("  " + "fibonacci series ::");
		for( int i=0;i<=n;i++) {
			int next = first+sec;
			first = sec;
			sec= next;
			System.out.print(  first + " ");
		}
		
		//Prime number 
		//A prime is a natural number greater than 1 that has no 
		//positive divisors other than 1 and itself
		
		int n1=13;
		boolean isPrime = true;
		for( int i=2;i<=Math.sqrt(n1);i++) {
			if( n1%i==0) {
			isPrime = false;
				
			}
			
		}
		System.out.println(isPrime );
	}

}
