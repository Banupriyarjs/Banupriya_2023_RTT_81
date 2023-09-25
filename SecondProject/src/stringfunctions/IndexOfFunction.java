package stringfunctions;

public class IndexOfFunction {
	public static void main(String[] args) {
		/*
		 * The indexOf() method returns the index of the first occurrence of the
		 * specified character/substring within the string.
		 */
		
		String message="Welcome Java Welcome Java";
		
		System.out.println("Index of l : "+message.indexOf('l'));
	    System.out.println("Index of Java : "+message.indexOf("Java"));
	    
	    System.out.println("Last Index of a : "+message.lastIndexOf('a'));
	    
	    System.out.println("Last Index of Java : "+message.lastIndexOf("Java"));
		
	}
}
