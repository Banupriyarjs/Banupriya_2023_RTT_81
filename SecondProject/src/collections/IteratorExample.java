package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<>();
		strings.add("one");
		strings.add("two");
		strings.add("three");
		strings.add("four");

		for (String s : strings) {
			System.out.println(s);
		}
		/*
		 * Iterators allow the caller to remove elements from the underlying collection
		 * during the iteration with well-defined semantics.
		 */

		// Iterator itr=strings.iterator(); -->Iterator is a raw type. References to
		// generic type Iterator<E> should be parameterized
		Iterator<String> itr = strings.iterator();
		String item="";
		System.out.println("********************");
		while (itr.hasNext()) { // returns true or false
			// String item = (String) itr.next();
			item = itr.next();
			if(item.equals("four"))
				itr.remove();
			
			System.out.println(item);
		}
		System.out.println(item);
	}

}
