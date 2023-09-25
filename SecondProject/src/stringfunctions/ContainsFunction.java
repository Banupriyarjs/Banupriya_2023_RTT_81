package stringfunctions;

public class ContainsFunction {

	public static void main(String[] args) {
		/*
		 * The contains() method checks whether the specified string (sequence of
		 * characters) is present in the string or not.
		 */
		
		
		String s="Welcome Java";
		System.out.println("String contains Java ? "+s.contains("Java"));
		System.out.println("String contains  ?: " +s.contains(""));
		System.out.println("String contains . ?: " +s.contains("."));


	}

}
