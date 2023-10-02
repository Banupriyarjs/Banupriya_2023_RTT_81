package encapsulation;

public class EncapsulationExample {

	public static void main(String[] args) {
		/*
		 * Guided LAB - 303.9.1 Encapsulation in Java
		 */
		
		
		HumanBeing  h1=new HumanBeing();
		h1.setHeight(1.65f);
		h1.setWeight(68);
		h1.setBmi(calculateBMI(h1));
		
		System.out.println("Person has "+h1.getWeight()+"kgs\nand is "+h1.getHeight()+
				" meters in height,\nwhich result in BMI of "+h1.getBmi());

	}
public static float calculateBMI(HumanBeing h1)
{
	return h1.getWeight()/(h1.getHeight()*h1.getHeight());
}
}
