package loops;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		String original,reverse="";
		
		System.out.println("Enter a number/string : ");
		Scanner input=new Scanner(System.in);
		original=input.nextLine();
		
		for(int i=original.length()-1;i>=0;i--)
		{
			reverse=reverse+original.charAt(i);
		}
		if(original.equals(reverse))
			System.out.println("The entered string/number is a palindrome");
		else
			System.out.println("The entered string/number is not a palindrome");
		
		input.close();
	
	
	}

}
