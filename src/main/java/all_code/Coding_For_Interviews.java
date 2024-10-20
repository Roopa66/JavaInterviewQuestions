package all_code;

public class Coding_For_Interviews {

	public static boolean main(String[] args) {
		// TODO Auto-generated method stub

		int year = 2024; // Example year

        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
		return false;
    }

    public static boolean isLeapYear(int year) {
        // A year is a leap year if it is divisible by 4
        // but not divisible by 100, unless it is also divisible by 400
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                // If the year is also divisible by 100, it is not a leap year
                // unless it is divisible by 400
                return year % 400 == 0;
            } else {
                // If the year is not divisible by 100, it is a leap year
                return true;
            }
        } else {
            // If the year is not divisible by 4, it is not a leap year
            return false;
        }
    }
    
}
