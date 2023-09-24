package controlflowstatements;

public class IfElseBlock {
	
	public static void main(String[] args)
	{
		
		int radius=5;
		double area;
		int number=25;
		
		//if(radius>=0);
		/*1. Errant Semicolan
		 * The block of code within curly braces will execute, even when a negative radius is entered.
		 * Its neither a compiler error or runtime error . Its a logical error*/
	    if(radius>=0)
		{
			area=radius*radius*3.14;
			
			System.out.println("Radius:"+area);
		}
		
	    
	    if(number%2==0)
	     	System.out.println(number+" is an Even number");
	    else 
	    	System.out.println(number+" is an Odd number");
	      
	    //2. above code can be replaced by
	    
	    boolean even= number%2==0;
	    
	    System.out.println("Even Number : "+even);
	    
	    if(even) // Instead of if (even==true)
	    	
	    	System.out.println(even+" is an Even number");
	    else 
	    	System.out.println(even+" is an Odd number");
	   	
	    
	    //3
	    
	    int x=-5;
	    
	    if(x<0)
	    	System.out.println("x is negative");
	    else if(x==0)
	    	System.out.println("x is zero");
	    else
	    	System.out.println("x is positive");
	}

}
