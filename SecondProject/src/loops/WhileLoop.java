package loops;

public class WhileLoop {

	public static void main(String[] args) {

		/*
		 * ● A for loop may be used if the number of repetitions is known. For example,
		 * you may need to print a message 100 times, or it can be supplied by the user.
		
		 * ● A while loop may be used if the number of repetitions is not known. For
		 * example, it may read numbers until the input is 0 or it may read data from a
		 * database. 
		 
		 * ● A do-while loop is a good choice when you are asking a question
		 * that will answer whether or not the loop is repeated
		 */
		// Example 1
		boolean condition = true;
		while (condition) {
			System.out.println("Will run forever");
			condition = false; // must set the condition otherwise the loop will run forever.
		}

		// Example 2
		int count = 0;

		while (count < 10) {
			System.out.println("Welcome to Java " + count);
			count++; // Remember to increment it
		}
	}

}
