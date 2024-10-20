package CoreJava;

public class New_Class {

	   public static void main(String[] args) {
	        String s = "hi hello good";
	        
	        // Step 1: Split the input string into words
	        String[] words = s.split(" ");
	        
	        
	        // Step 2: Reverse each word
	        StringBuilder reversedString = new StringBuilder();
	        for (String word : words) {
	            StringBuilder reversedWord = new StringBuilder(word);
	            reversedString.append(reversedWord.reverse().toString()).append(" ");
	        }
	        
	        // Trim the trailing space
	        String output = reversedString.toString().trim();
	        
	        // Print the result
	        System.out.println(output);
	        for( int i=s.length()-1;i>=0;i--) {
	 		   System.out.print(s.charAt(i));
	 	   }
	        
	   for( int i=words.length-1;i>=0;i--) {
		   System.out.println(s.charAt(i));
	   }
}}
