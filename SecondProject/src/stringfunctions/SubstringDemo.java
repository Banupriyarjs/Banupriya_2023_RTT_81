package stringfunctions;

public class SubstringDemo {

	public static void main(String[] args) 
	{
		String string="This is a string";
		
		//substring with a start and end
		
		String result=string.substring(0,4); //This
		
		System.out.println(result);
		
		//substring with a start
		System.out.println(string.substring(4))	; // is a string
		
		String fileName="image.jpg";
		int lastDot=fileName.lastIndexOf(".");
		
		String ext=fileName.substring(fileName.lastIndexOf(".")); //.jpg
		
		 ext=fileName.substring(fileName.lastIndexOf(".")+1);//jpg
		
		System.out.println(ext);
		
		String name="Arjun Kumar";
		
		int spacePosition=name.lastIndexOf(" ");
		String firstName=name.substring(0,spacePosition);
		String lastName=name.substring(spacePosition+1);
		
		System.out.println("First Name:"+firstName);
		System.out.println("Last Name:"+lastName);
		
	}

}
