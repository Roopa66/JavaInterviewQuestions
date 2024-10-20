package CoreJava;

public class Java_topics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Hi rajolla ";
		
		StringBuilder build = new StringBuilder(s);
		String s1= build.reverse().toString();
		System.out.println(s1);
		for( int i=0; i<=s.length()-1;i++) {
			System.out.print(s.charAt(i) + "  ");
		}
		String[] st = s.split(" ");
		for( int m= st.length-1;m>=0;m--) {
			System.out.println(st);
		}
		for( int j =s.length()-1;j>=0; j--) {
			System.out.print(s.charAt(j) + " ");
		}
		
		String str = "RLR";
		StringBuilder palin = new StringBuilder(str);
		String newpalin =palin.reverse().toString();
		System.out.println(newpalin.equalsIgnoreCase(str));
		
		String string = "Hi Jesus";
		String[] stri =string.split(" ");
		StringBuilder stringReverse = new StringBuilder();
		
		for(String words :stri){
			StringBuilder stringResponse = new StringBuilder(words);
			stringReverse.append(stringResponse.reverse().toString()).append(" ");
		}
			String Output = stringReverse.toString().trim();
			System.out.println(Output);
		}
		
		}


