package com.pack;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Just {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// common integers in below array
		Integer[] a1 = {4,5,6,7};
		Integer[] a2 = {1,2,3,4};
		Integer[] a3 = {1,2,3,4};
		List<Integer> l = new ArrayList<>();
		Set<Integer> s= new HashSet<>();

		for(int i=0;i<=a1.length-1;i++){
			for(int j=0;j<=a2.length-1;j++){
				for(int k=0;k<=a3.length-1;k++){
					if(a1[i]==a2[j]  &&a2[j]==a3[k] && a3[k]==a1[i]) {
					s.add(a1[i]);
					l.add(a1[i]);	
					}
				
					
				}
			}
		}
		System.out.println(s);
	}
}

	

	
