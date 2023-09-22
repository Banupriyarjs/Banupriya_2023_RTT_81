package collections;

import java.util.ArrayList;

public class ArrayListDemo {

	//@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		Car car1=new Car(1,"Tesla");
		Car car2= new Car(2,"Toyoto");
		Car car3= new Car(3,"Honda");
		
		ArrayList<Car> arrayList=new ArrayList<Car>();
		
		arrayList.add(car1);
		arrayList.add(car2);
		arrayList.add(car3);
		
		System.out.println("Original ArrayList : "+arrayList);
		
		//ArrayList<Car> arrayListCloned= (ArrayList<Car>)arrayList.clone();
		ArrayList<Car> arrayListCloned = new ArrayList<Car>();
		arrayListCloned=(ArrayList<Car>)arrayList.clone();
		
		System.out.println("Cloned ArrayList : "+arrayListCloned);
		
	}

}
