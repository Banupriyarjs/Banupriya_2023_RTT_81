package collections;

public class Car {
	
	int id;
	String name;
	public Car(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
    @Override
	public String toString()
    {
    	return id+" "+name;
    }
}
