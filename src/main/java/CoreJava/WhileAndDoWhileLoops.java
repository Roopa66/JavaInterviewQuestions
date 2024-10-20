package CoreJava;

public class WhileAndDoWhileLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// While loop condition must satisfy next execution
		
		int i=0;
		
		while(i<10) {
			System.out.print(i);
			i++;
		}
		
		//Do While
		//it will execute first scenario guarently
		int j=0;
		do {
			System.out.println(j);
			j++;
		}while(j<10);
	
	String number = "45454";
	StringBuilder b =new StringBuilder(number);
	if(number.equalsIgnoreCase(b.reverse().toString())) {
		System.out.println("It is palindrome");
	}
	else {
		System.out.println("it is not palindrome");
	}
	
	int n=343;
	int palin;
	int sum=0;
	int temp = n;
	while(n>0) {
		palin = n%10;
		sum = sum*10+palin;
		n=n/10;
	}
	if(temp==sum) {
	System.out.println("it is palin");
	}
	else {
		System.out.println("it is not palin");
	}
	
	

}}
