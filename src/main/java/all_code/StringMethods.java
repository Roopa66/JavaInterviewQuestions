package all_code;

public class StringMethods {

	
		

		    // Method to check if a character is a vowel
		    public static boolean isVowel(char d) {
		        return "AEIOUaeiou".indexOf(d) != -1;
		    }

		    // Method to shift the vowel to the next vowel in sequence
		    public static char shiftVowelForward(char ch) {
		        switch (ch) {
		            case 'A': return 'E';
		            case 'E': return 'I';
		            case 'I': return 'O';
		            case 'O': return 'U';
		            case 'U': return 'A';
		            case 'a': return 'e';  // lowercase vowels, if needed
		            case 'e': return 'i';
		            case 'i': return 'o';
		            case 'o': return 'u';
		            case 'u': return 'a';
		            default: return ch;
		        }
		    }

		    // Method to shift consonants backward by one ASCII value
		    public static char shiftConsonantBackward(char c) {
		        return (char) (c - 1);
		    }

		    public static void main(String[] args) {
		        String input = "RAMYA";
		        StringBuilder result = new StringBuilder();
		        
		        // Step 1: Loop through each character of the input string
		        for (char c : input.toCharArray()) {
		            if (isVowel(c)) {
		                // Shift vowels forward to the next vowel
		                result.append(shiftVowelForward(c));
		            } else {
		                // Shift consonants backward by one ASCII value
		                result.append(shiftConsonantBackward(c));
		            }
		        }
		        
		        // Step 3: Print the resulting string
		        System.out.println("Output: " + result.toString());
		    }
		

	}


