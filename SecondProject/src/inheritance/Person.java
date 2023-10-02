package inheritance;

public class Person {

	/*
	 * Guided Lab -303.10.1 - Inheritance and Object Type Casting
	 */

	String name;
	static int lifeSpan = 60;
	static double ageFactor = 1.0;

	public Person() {
		name = "";
	}

	public Person(String aName) {
		name = aName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return ("Hello,my name is " + name);
	}

	public String talk() {
		return ("I have nothing to say.");

	}

	public String walk() {
		return ("I have nowhere to go.");
	}

	public static double lifeSpan() {
		return (lifeSpan * ageFactor);
	}
}
