package stringfunctions;

public class CompareToFunction {

	public static void main(String[] args) {
		//Syntax
		//String1.compareTo(String2)		
		/*if s1 > s2, it returns a positive number.
		if s1 < s2, it returns a negative number.
		if s1 == s2, it returns 0.*/
		
		String s1="hello";
		String s2="hello";
		String s3="hemlo";
		String s4="flag";
		
		System.out.println(s1.compareTo(s2));// 0 Both Strings are Equal.
		System.out.println(s1.compareTo(s3)); //-1 S1<S3  l is only time lower than m
		System.out.println(s1.compareTo(s4)); //2  h is two times greater than f
		
		String str1="Perscholas";
		String str2="Perscholas";
		String str3="Perschola";
		String str4="PerscholasX";
		System.out.println(str1.compareTo(str2)); //0
		System.out.println(str1.compareTo(str3)); // 1(because s1>s3)
		System.out.println(str1.compareTo(str4)); // -1(because s1<s4 )

	}

}
