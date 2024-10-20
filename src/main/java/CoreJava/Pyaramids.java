package CoreJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Pyaramids {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		for (int i = 1; i <= 6; i++) {
//			for (int j = 1; j <= 6 - i; j++) {
//				System.out.print(" ");
//			}
//			for (int j = 1; j <= i; j++) {
		
//				System.out.print(i + " ");
//			}
//			System.out.println();
//		}
//		// *****Pyramid reverse
//
//		for (int i = 6; i >= 1; i--) {
//			for (int j = 1; j <= 6 - i; j++) {
//				System.out.print(" ");
//			}
//			for (int j = 1; j <= i; j++) {
//				System.out.print(i + " ");
//			}
//			System.out.println();
//		}
		
//		# A B C #
//		D # E # F
//		G H # I J
		char a='A';
		for( int i=1;i<=3;i++) {
			for(int j=1;j<=5;j++) {
				
				if(i==j || j == 6-i ) {
				System.out.print("#"+ " ");
				
			}
				else {
					System.out.print(a+" ");
					a++;
				}
		}
			System.out.println();
		
		
		
	}
		
		
		

				
				String number = "15151";
				//Integer n=Integer.parseInt(number);
				StringBuilder build = new StringBuilder(number);
				if(number.equalsIgnoreCase(build.reverse().toString())) {
					System.out.println("YES IT iS PALINDROME");
				}
				else {
					System.out.println("ITS NOT ");
				}
				
				// Array  <--> LIST
				
				String[] arrString= {"ABC", "BCA", "CAB"};
				
				List<String> listString = new ArrayList<>();
				listString.add("XYZ");
				listString.add("YZX");
				listString.add("ZXY");
				
				//Convert Array to LIST
				List<String> newList =  Arrays.asList(arrString);
				System.out.println(newList.toString());
				
				
				// COnvert List to Array
				Object[] newArr = listString.toArray();
				System.out.println(newArr[1]);
				
				
				int n=454;
				int palin;
				int sum=0;
				int temp =n;
				while(n>0) {
					palin = n%10;
					sum = sum*10+palin;
					n=n/10;
				}
					if(temp==sum) {
						System.out.println("it is palin");
					}
					else {
						System.out.println("it is not palindrome");
					}
					
					//reverse
					
					int[] array = {1,2,3,45};
					int swap;
					for(int i=0;i<=(array.length-1)/2;i++) {
						swap=array[i];
						array[i]=array[array.length-i-1];
						array[array.length-i-1]=swap;
					}
					
					for(int j=0;j<=array.length-1;j++) {
						System.out.println(array[j] + " ");
					
				}}
			}

	
