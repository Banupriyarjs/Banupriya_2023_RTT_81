package collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
	 
		Map<String,Integer> stringMap=new HashMap<>();
        stringMap.put("one", 1);
        stringMap.put("two", 2);
        
        Integer one=stringMap.get("one");
        Integer two=stringMap.get("two");
        
        System.out.println(stringMap.get("one")); //1
        System.out.println(stringMap.get("two"));  //To get the key value --2
        
        Map<Integer,String> numbers=new HashMap<>();
        
        numbers.put(1,"1st");
        numbers.put(2,"2nd");
        numbers.put(3,"3rd");
        numbers.put(4,"4th");
         System.out.println(numbers);
        numbers.remove(4);  // remove an element
        System.out.println("After removing: \n");
        
        System.out.println(numbers);
        
        //loop over the map
        for(Integer key:numbers.keySet())
        {
        	System.out.println("Key : "+key+"  "+"Value: "+numbers.get(key));
        }
        
        
	}

}
