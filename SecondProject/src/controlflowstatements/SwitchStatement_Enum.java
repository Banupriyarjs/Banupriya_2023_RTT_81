package controlflowstatements;
public class SwitchStatement_Enum {
	
	/*An enum is a special "class" that represents a group of constants 
	 * (unchangeable variables, like final variables).
	 * separate the constants with a comma. Note that they should be in upper case letters:*/
	enum Cars
	{
		BMW,
		JEEP,
		AUDI,
		TOYOTO,
		HONDA;
	}

	public static void main(String[] args) {
		
		//declaring enum variable
		Cars c=Cars.AUDI;
		//String car=c.AUDI; //Type mismatch: cannot convert from SwitchStatement_Enum.Cars to String
			
		switch(c)
		{
			case BMW:
					System.out.println("You choose BMW");
					break;
			case JEEP:
				System.out.println("You choose JEEP");
				break;
			case AUDI:
				System.out.println("You choose AUDI");
				break;
			case HONDA:
				System.out.println("You choose HONDA");
				break;
			default:
				System.out.println("New brand's car");
				break;
		}
		
		
	}

}
