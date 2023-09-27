package arrays_practice_assignment;

public class ArraysClassAssignment {

	public static void main(String[] args)

	{
		String example = "This is an example";
		// find the position of the first space in the string
		int firstSpacePosition = example.indexOf(" ");
		System.out.println("\nPosition of First Space: " + firstSpacePosition);

		// find the position of the last space in the string
		int lastSpacePosition = example.lastIndexOf(" ");

		System.out.println("\n\nPosition of Last Space: " + lastSpacePosition);

		// substring of the characters between the first and last space of the string
		System.out.println("\n\nSubstring between the first and last space of the string: "
				+ example.substring(firstSpacePosition, lastSpacePosition));

		// do the same thing to find the substring of the first and last vowel of the
		// string

		int firstVowelPosition = 0;
		int lastVowelPosition = 0;

		for (int i = 0; i < example.length(); i++) {
			if (example.charAt(i) == 'a' || example.charAt(i) == 'e' || example.charAt(i) == 'i'
					|| example.charAt(i) == 'o' || example.charAt(i) == 'u') {
				firstVowelPosition = i;
				break;
				// lastVowelPosition=example.lastIndexOf(i);
			}
		}
		for(int j=0;j<example.length();j++)
		{
			
			
		if (example.charAt(j) == 'a' || example.charAt(j) == 'e' || example.charAt(j) == 'i'
					|| example.charAt(j) == 'o' || example.charAt(j) == 'u') {
				lastVowelPosition=j;
				
			}
		}

	//	System.out.println(firstVowelPosition);
		// System.out.println(lastVowelPosition);
		
		
		System.out.println("\n\nSubstring between the first and last vowel of the string: "
				+ example.substring(firstVowelPosition, lastVowelPosition));


		// use the string.charAt function and use a for loop to loop over the entire
		// string.
		// and print out each character with a new line after it.
		// you need to use the string.length() function also

		System.out.println("\n\n---------------CharAt(index)-----------------------");

		for (int i = 0; i < example.length(); i++) {
			System.out.println(example.charAt(i));
		}

		// using only indexOf(" ") print the substring that contains the word "is"
		// use 2 substrings to do this.
		
		// https://edabit.com/challenges
		// Change to Java / Very Easy or Easy / Strings and try to do some of them
		
		
	String test = "ABC DEF GHI";
     System.out.println("Test\n\n");
     System.out.println(test.substring(0,test.indexOf(" ")));
     String firstString=test.substring(0,test.indexOf(" "));
     int flen=firstString.length();
     System.out.println(flen);
     
     System.out.println(test.indexOf(" ")-1);
      System.out.println(test.substring(flen+1,test.length()-test.indexOf(" ")-1));
	}

}