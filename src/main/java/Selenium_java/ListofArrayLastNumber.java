package Selenium_java;

import java.util.ArrayList;
import java.util.List;

public class ListofArrayLastNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        // Define a list of arrays
		        List<int[]> listOfArrays = new ArrayList<>();
		        
		        // Add arrays to the list
		        listOfArrays.add(new int[]{1, 2, 3});
		        listOfArrays.add(new int[]{4, 5, 6});
		        listOfArrays.add(new int[]{7, 8, 9, 10,});
		        
		        // Get the last array from the list
		        int[] lastArray = listOfArrays.get(listOfArrays.size() - 1);
		        
		        // Get the last number from the last array
		        int lastNumber = lastArray[lastArray.length - 1];
		        
		        // Print the last number
		        System.out.println("The last number in the list of arrays is: " + lastNumber);
		    
		        List<int[]> loa = new ArrayList<int[]>();
		        loa.add( new int[] {1,2,3});
		        loa.add(new int[] {5,6});
		        int[] la = loa.get(loa.size()-1);
		        int ln = la[la.length-1];
		        System.out.println("The last number in the list of arrays is: " + ln);
			    
	}
	
		
	}

