package stringbuffer;

public class StringBufferExample {

	public static void main(String[] args) {
		
		
		//change x to be abc123xyz
		
		//Creates 5 objects to process the next 3 lines
		String x="abcxyz";
		String x1=x.substring(0,3)+"123"+x.substring(3);
		
		String y=x.toUpperCase();
		
		//xyzabc
		StringBuffer buffer=new StringBuffer();
		buffer.append("abc");
		buffer.append("xyz");
		buffer.reverse();
		
		//StringBuffer substring does the same as String substring
		String sub=buffer.substring(0,3);
		
		//you can insert into the string buffer anywhere
		buffer.insert(3, "123");
		
		System.out.println(buffer.toString());
		
		//remove from string buffer
		buffer.delete(3, 6);
		
			
		//String Buffer
       StringBuffer sb = new StringBuffer("135");
		
		sb.replace(0, 5, "6789");
		System.out.println(sb.toString());
		sb.insert(0, "12345");
		System.out.println(sb.toString());
		sb.reverse();
		System.out.println(sb.toString());
		sb.delete(0, 5);
		
		System.out.println(sb.toString());
	}

}
