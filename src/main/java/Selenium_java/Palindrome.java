package Selenium_java;

public class Palindrome {

	public static void main(String[] args) {

	int palin;
	int temp;
	int sum=0;
	int n=121;
	temp=n;
	while(n>0) {
		palin=n%10;
		sum = sum*10+palin;
		n=n/10;
		
		}
	if(temp==sum) {
		System.out.println("palindrome");
	}
	else {
		System.out.println("not a palindhrome");
	}
	}
	


}
