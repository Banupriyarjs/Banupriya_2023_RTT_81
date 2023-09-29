package inheritance;

public abstract class Shape implements IArea {
	public String name;
	public String getName()
	{
		return name;
		
	}
	public void  setName(String name)
	{
		this.name=name;
	}
	abstract public double calculatePerimeter();

}
