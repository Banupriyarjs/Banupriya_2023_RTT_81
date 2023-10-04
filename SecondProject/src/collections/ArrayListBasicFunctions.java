package collections;

import java.util.ArrayList;

public class ArrayListBasicFunctions {

	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("New Jersey");
		myList.add("Dallas");
		myList.add("New York");
		myList.add("Chicago");
		myList.add("LA");

		System.out.println(myList.toString());

		for (String x : myList) {
			System.out.println(x);
		}
		System.out.println("\nReturn boolean :" + myList.contains("Chicago"));
		System.out.println("\nReturn index value of Element :" + myList.indexOf("Chicago"));
		System.out.println("\nReturns the actual Element at the given index :" + myList.get(2));
		System.out.println("\nReturns the length of the arraylist :" + myList.size());
		// Remove the element at the given index. Returns the removed element.
		// remove element at index 3
		String removedElement = myList.remove(3);
		System.out.println("\nRemoved Element: " + removedElement);
		// remove all elements
		myList.clear();
		System.out.println("\nArrayList after clear(): " + myList);

		System.out.println(myList.toString());

	}

}
