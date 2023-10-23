package string;

public class StringDemo {

	public static void main(String[] args) 
		{
		  String s = new String("Java Technology");
		   s.substring(5);
		   System.out.println(s.length());
		 //  System.out.println(s.substring(5)); 
		  System.out.println(s); 
		  String s2 = s.substring(6, 15); 
		  System.out.println(s2); 
		 }
}