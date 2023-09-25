package stringfunctions;

public class EqualsFunction {
	public static void main(String args[]){
		String s1="PerScholas";
		String s2="PerScholas";
		String s3=new String("PerScholas");
		String s4="Teksystem";
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equals(s3));//true
		System.out.println(s1.equals(s4));//false
		
		
		//By using == operator
		System.out.println(s1==s2);//true (because both refer to same instance)
		System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool)
		}

}
