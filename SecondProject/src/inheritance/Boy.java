package inheritance;

public class Boy extends Person {
	/*
	 * Guided Lab -303.10.1 - Inheritance and Object Type Casting
	 */
	
	static double ageFactor=1.1;
	
	public String talk()
	{
		System.out.println(super.talk() +"....but I love Java class");
		
		return ("This is a message from Boy Class");
	}
	public String walk()
	{
		return ("Boy: I am now walking");
	}

}
