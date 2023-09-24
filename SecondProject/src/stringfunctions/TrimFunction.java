package stringfunctions;

public class TrimFunction {

	public static void main(String[] args) {
		
		String s1=" Hello ";
		String s2=" How are you ? ";
		
		String s3=s1+s2;
		
		System.out.println("Without Trim function "+s3);
		
		System.out.println("After Trim "+s3.trim());
		
		
	}
}
