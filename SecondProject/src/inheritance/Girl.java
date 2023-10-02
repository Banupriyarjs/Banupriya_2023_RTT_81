package inheritance;

public class Girl extends Person {
	/*
	 * Guided Lab -303.10.1 - Inheritance and Object Type Casting
	 */
	static double ageFactor = 1.3;

	public Girl(String aName) {
		name = "Ms." + aName;
	}

	public String talk() {
		return "Hello" + jump();
	}

	public String jump() {
		return "I am jumping";
	}

	public static double lifeSpan() {
		return (lifeSpan * ageFactor);
	}
}
