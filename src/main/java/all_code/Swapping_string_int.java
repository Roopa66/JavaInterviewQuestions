package all_code;

public class Swapping_string_int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s= "hi";
		String s1="he";
		
		 s= s+s1;
		
		s1 = s.substring(0, s.length()-s1.length());
		s = s.substring(s1.length());
		System.out.println(s +" " + s1+ " ");
		

		System.out.println(s);
		
		int a=1;
		int b=2;
		System.out.println("before swapping " + a + b);
		 a= a+b;
		 b= a-b;
		 a= a-b;
		 System.out.println("After  swapping" +a +b);
	}

}
