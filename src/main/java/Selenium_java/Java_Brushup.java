package Selenium_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Java_Brushup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Datatypes - integer,string,char,flot or double, boolean
		// variables are s,St,

		int s = 8;
		String St = "Roopa";
		char ch = 'j';
		double f = 4.0;
		boolean num = false;

		// if your system want print the string + variables use + symbol
		System.out.println(num + "roopaaaa");

		// For loop
		int[] array1 = { 1, 6, 7, 8, 3 };
		for (int i = 0; i <= array1.length - 1; i++) {
			System.out.print(array1[i] + "  ");
		}
		// String for loop
		String[] string = { "tttt", "hjkl", "sdfgh" };
		for (int j = 0; j <= string.length - 1; j++) {
			System.out.print(string[j] + "  ");
		}
		// Enhanced for loop
		for (String s1 : string) {
			System.out.println(s1 + "  ");
		}
		// Array and ArrayList
		// Array is fixed size and static
		// ArrayList is dynamic
		ArrayList<String> a = new ArrayList<String>();
		a.add(St);
		a.add("hi");
		a.add("guys");
		a.indexOf(St);

		// item is present in arraylist
		System.out.println(a.contains("Roopa"));

		System.out.println(a.get(2));
		for (int k = 0; k <= a.size() - 1; k++) {// if you want size u need to use size
			System.out.println(a.get(k));
		}
		for (String value : a) {
			System.out.println(value);
		}
		// Array to Arralist convert
		// we have array
		String[] string1 = { "tttt", "hjkl", "sdfgh" };
		List<String> arraylist = Arrays.asList(string1);
		// arraylist.add(St);

		// String and their methods
		String roopa = "Roopa is a good girl";

		// split
		String[] stringSplit = roopa.split(" ");
		System.out.println(stringSplit);
	}

}
