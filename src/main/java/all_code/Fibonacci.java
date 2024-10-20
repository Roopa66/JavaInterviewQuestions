package all_code;

public class Fibonacci {

	// Fibonacci means 0,1,1,2,3,5,8,13,21
	

	public static void fibonacci(int n) {
		
		int first = 0, second = 1;

		System.out.print( first + "," + second + ",");
		for (int i = 0; i <= n; i++) {

			int third = first+second;
			System.out.print(third +","  );
			first = second;
			second = third;
		}
	}

	public static void main(String[] args) {
		int n = 5;
		fibonacci(n);
		
	}

}
