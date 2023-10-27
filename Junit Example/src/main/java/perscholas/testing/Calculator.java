package perscholas.testing;

public class Calculator {

	public double add(double x,double y)
	{
		return x+y;
	}
	public double substract(double x,double y)
	{
		return x-y;
	}
	public double multiply(double x,double y)
	{
		return x*y;
	}
	public double divide(double x,double y)
	{
		return x/y;
	}
	public static void main(String[] args) {
		Calculator calc= new Calculator();
		
		double sum=calc.add(5.2,7.8);
		double sub = calc.substract(10.0, 3.9);
	}

}
