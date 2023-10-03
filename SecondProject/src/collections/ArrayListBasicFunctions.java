package collections;

import java.util.ArrayList;

public class ArrayListBasicFunctions {

	public static void main(String[] args) {
		ArrayList<String> mylist = new ArrayList<String>();
		mylist.add("New Jersey");
		mylist.add("Dallas");
		mylist.add("New York");
		mylist.add("Chicago");
		mylist.add("LA");
		
		System.out.println(mylist.toString());
		System.out.println("\nReturn boolean :" + mylist.contains("Chicago"));
		System.out.println("\nReturn index value of Element :" + mylist.indexOf("Chicago"));
		System.out.println("\nReturns the actual Element at the given index :" + mylist.get(2));
		System.out.println("\nReturns the length of the arraylist :" + mylist.size());
		// Remove the element at the given index. Returns the removed element.
		// remove element at index 3
		String removedElement = mylist.remove(3);
		System.out.println("\nRemoved Element: " + removedElement);
		// remove all elements
		mylist.clear();
		System.out.println("\nArrayList after clear(): " + mylist);
		
		System.out.println(mylist.toString());
	}

}
