package stringfunctions;

public class StringFunction {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		String s1="welcome";
		String s2="Welcome";
		
		//These two things are not same.
		//This is actually a string in memory that has 0 characters and length of 0.
		
		String empty="";
		//This is a string that has not been allocated in memory yet.
	    String nullString=null;
	    
	    System.out.println("Empty String Length: "+empty.length() +" Null String Length: "+nullString);
		
	    if(s1.equals(s2))
	    	System.out.println("Both strings are equal(Equals method");
	    else
	    	System.out.println("Not equal");

	    
	    if(s1.equalsIgnoreCase(s2))
	    	System.out.println("Both strings are equal(equalsIgnoreCase)");
	    else
	    	System.out.println("Not equal");

	    
	    System.out.println("Index of c: "+s1.indexOf('c'));
	    
	    //Generally used to find the file name (.)
	    System.out.println("Last Index of c: "+s1.lastIndexOf('e'));
	    
	    //replaceFirst
	    System.out.println("ReplaceFirst: "+s1.replaceFirst("we","WE"));
	    
	    //replaceAll
	    System.out.println("ReplaceAll: "+s1.replaceAll("e","E"));
	    
	    System.out.println("Compare to :"+s1.compareTo(s2));
	
	}

}
