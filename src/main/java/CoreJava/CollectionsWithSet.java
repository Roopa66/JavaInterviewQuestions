package CoreJava;

import java.util.HashSet;
import java.util.Iterator;

public class CollectionsWithSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// recharge mobiles

		// Set
		// hashset, treeset, linkedhashset implements set interface

		// set interface does not accept duplicate values

		// no guarentee that element stored in sequential order

		HashSet<String> hashset = new HashSet<String>();

		hashset.add("idiot");
		hashset.add("ryt");
		hashset.add("buddeeswar");
		hashset.add("idiot");
		hashset.add("buddee");
		hashset.add("ryt");
		System.out.println(hashset);
		System.out.println(hashset.remove("buddee"));
		System.out.println(hashset.isEmpty());
		System.out.println(hashset.size());

		// Iterator interface - this method will start and iterator through every object
		// present in the string

		Iterator<String> i = hashset.iterator();

		/*
		 * System.out.println(i.next()); System.out.println(i.next());
		 * System.out.println(i.next());
		 */

		while (i.hasNext()) {
			System.out.println(i.next());

		}

	}

}
