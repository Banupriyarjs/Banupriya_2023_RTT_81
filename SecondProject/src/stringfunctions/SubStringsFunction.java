package stringfunctions;

public class SubStringsFunction {

	public static void main(String[] args) {
		
		//The substring() method extracts a substring from the string and returns it.
		
		String s="Java is fun";
		//stringObj.substring(int startIndex, int endIndex)
		System.out.println("Substring(ava):"+s.substring(1, 4));
		
		// stringObj.substring(int startIndex)
		System.out.println("Substring(is fun) :"+s.substring(5));
		

	}

}
