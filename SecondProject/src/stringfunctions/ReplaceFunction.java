package stringfunctions;

public class ReplaceFunction {

	public static void main(String[] args) {
		/*
		 * The replace() method replaces each matching occurrence of the old
		 * character/text in the string with the new character/text.
		 *  The syntax of the  replace() method is either:
		 *
		 * stringobj.replace(char oldChar, char newChar) or
		 * 
		 * stringobj.replace(CharSequence oldText, CharSequence newText) 
		 */
		
		// all occurrences of 'a' is replaced with 'z
		
		String s="abc cba";
		System.out.println(s.replace('a', 'z'));
		
		// all occurences of 'L' is replaced with 'J'
		System.out.println("Lava".replace('L', 'J'));
		
		// all occurences of 'L' is replaced with 'J'
		System.out.println("Lava".replace('L', 'J'));

		// all occurrences of "C++" is replaced with "Java"
		System.out.println(s.replace("C++", "Java"));
		
		// all occurences of "aa" is replaced with "zz"
		System.out.println("aa bb aa zz".replace("aa", "zz"));
		
		// substring not in the string
		System.out.println("Java C++ python".replace("C++", "C"));

	}

}
