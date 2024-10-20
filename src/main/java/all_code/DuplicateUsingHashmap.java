package all_code;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateUsingHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] array = { "Roopa","guru","Jaga","Jyothi","Jyothi", "Roopa"};
HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
for( String names : array) {
	if(hashmap.containsKey(names)) {
		hashmap.put(names, hashmap.get(names) +1);
	}else {
		hashmap.put(names, 1);
	}
}
System.out.println("find duplicate");
for(Map.Entry<String, Integer> entry :hashmap.entrySet()) {
	if(entry.getValue()>1) {
		System.out.println(entry.getKey() + "  appear " + entry.getValue() + "  times ");
	}
}
	}

}
