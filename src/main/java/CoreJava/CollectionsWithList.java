package CoreJava;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class CollectionsWithList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// example ecommerce - it accept duplicates

		
		// ArrayList implements list interface
		 // can accept duplicate values 
		// it will guarentee abou sequence
		
		//ArraList,LinkedList,vector- Implementing List interface 
		//array have fixed size where as arraylist can grow dynamicaly 
		//you can access and insert any value in any index private int i =5; 
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Roopa");
		a.add("hi");
		a.add(0, "Good Morning");//add with index
		
		//remove method
		
		/*a.remove(1);
		a.remove("hi");
	
		System.out.println(a);*/
		
		//get method
		System.out.println(a.get(1));
		//contains method- u can check given string is available or not
		System.out.println(a.contains("hello"));
		System.out.println(a.contains("hi"));
		//IndexOf method - u can check index of perticular string
		System.out.println(a.indexOf("Roopa"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		
		LinkedList<String> l = new LinkedList<String>();
		System.out.println(l.size());
		
		//Vector<String> v = new Vector<String>();x
		
		//v.add(0, "happy");
		//System.out.println(v);
		//System.out.println(v.size());
	}

}
