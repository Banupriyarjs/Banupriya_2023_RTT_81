package inheritance;

public class TestPeople {

	/*
	 * Guided Lab -303.10.1 - Inheritance and Object Type Casting
	 */
	public static void main(String[] args) {
		Person aPerson;
		Boy parker;
		Girl coco;
		aPerson=new Person("Duoduo");
		parker=new Boy();
		coco=new Girl("Coco");
		
		//Boy b=new Person(); //Throws Error.Type mismatch.Cannot convert from Person to boy.
		//Girl g=new Person();
		
		System.out.println(aPerson);
		System.out.println(aPerson.talk());
		System.out.println(aPerson.walk());
		System.out.println();
		
		System.out.println(parker);
		System.out.println(parker.talk());
		System.out.println(parker.walk());
		System.out.println();
		
		
		System.out.println(coco);
		System.out.println(coco.talk());
		System.out.println(coco.walk());
		System.out.println();
		
		
		System.out.println((Person)coco);
		System.out.println(((Person)coco).talk());
		System.out.println(((Person)coco).walk());
		System.out.println();
		
		
		System.out.println((Person)parker);
		System.out.println(((Person)parker).talk());
		System.out.println(((Person)parker).walk());
		System.out.println();

		System.out.println(Person.lifeSpan());
		System.out.println(Boy.lifeSpan());
		System.out.println(Girl.lifeSpan());
		
		//System.out.println(((Boy)aPerson).talk());
	}

}
