package CoreJava;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i <= 4; i++) {
			//System.out.println("outer");
			for (int j = 0; j <= 2; j++) {
				//System.out.println("inner loop");
			}
		}

		for (int i = 0; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("z");
			}
				System.out.println();
				
			}
		System.out.println(" ");
		for( int i=0;i<=5;i++) {
			for( int j=1;j<=5-i;j++) {
				System.out.print(j);
			}
			System.out.println();
		
		}
		String number = "1232";
		StringBuilder build = new StringBuilder(number);
		if(number.equalsIgnoreCase(build.reverse().toString())) {
			System.out.println("it is palindrome");
		}
		else {
			System.out.println("it is not palindrome");
		}
		
		
		
	}

}
