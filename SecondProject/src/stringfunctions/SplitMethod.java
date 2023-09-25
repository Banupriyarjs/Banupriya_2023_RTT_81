package stringfunctions;

import java.util.Arrays;

public class SplitMethod {

	public static void main(String[] args) {
		
		//Syntax
		//string.split(String regex,int limit)
		//● regex - the string is divided at this regex (can be strings)
		//● limit (optional) - controls the number of resulting substring

		
		String vowels="a::d::i::o::u";
		
		// splitting the string at "::"
		// storing the result in an array of strings
		
		String[] result=vowels.split("::");
		System.out.println("Length :"+result.length);
		
		// converting array to string and printing it
		System.out.println(Arrays.toString(result));
		
		for(String s:result)
		{
			System.out.println(s);
		}

	}

}
