package javaprograms;

public class AreaofCircle 
{
	static final double PI=3.14159;
	public static void main(String[] args)
	{
		double radius;
		double Area;
		radius=20.2;
		
		Area=radius*radius*PI;
		
		System.out.println("Area : "+Area);
		System.out.println("Area : "+String.format("%.2f", Area));
	}

}