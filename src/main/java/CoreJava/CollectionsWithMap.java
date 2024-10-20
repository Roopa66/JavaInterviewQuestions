package CoreJava;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionsWithMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//HashMap
		//we map key to the value
		
		HashMap<Integer, Character>  hashmap= new HashMap<Integer, Character>();
		hashmap.put(1, 'a');
		hashmap.put(2, 'm');
		hashmap.put(3, 'c');
		hashmap.put(4, 'r');
		hashmap.put(5, 'b');
		System.out.println(hashmap.get(3));
		hashmap.remove(3);
		System.out.println(hashmap);
		
		System.out.println(hashmap.size());
		
		Set set = hashmap.entrySet();
System.out.println(set);	
		
	}

}
