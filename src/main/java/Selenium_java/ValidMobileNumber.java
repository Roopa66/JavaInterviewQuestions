package Selenium_java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidMobileNumber {

	public static boolean isValidMobileNumber(String mobileNumber) {
		
		 String regex = "^[7-9][0-9]{9}$";

	        // Compile the regex
	        Pattern pattern = Pattern.compile(regex);

	        // Match the mobile number against the regex
	        Matcher matcher = pattern.matcher(mobileNumber);

	        // Return whether the mobile number matches the regex
	        return matcher.matches();
		
	}
	
	
	 static void main (String[] args){
		String s = "9876543210";
		ValidMobileNumber vn = new ValidMobileNumber();
		vn.isValidMobileNumber(s);
	}
}
