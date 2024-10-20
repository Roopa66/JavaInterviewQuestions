package all_code;

public class String_length_fn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// with using length() method
		String s = "hellow world";
		int i =s.length();
		System.out.println(i);
		
		// without using length90 method
		
		String Length = getLength(s);
		System.out.println(Length);
	}

	private static String getLength(String s) {
		int Length = 0;
		try {
		while(true) {
			s.charAt(Length);
			Length++;
		}}
		catch(IndexOutOfBoundsException e) {
			
		}
		return s;
			
		
	}

}
