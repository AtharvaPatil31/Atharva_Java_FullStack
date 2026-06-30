package HashMap;

import java.util.HashMap;

public class MapDemo {
	
	public static void main(String[]  args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("01","Tiger");
		map.put("02","Elephant");
		map.put("03","Panda");
		map.put("04","Lion");
		map.put("05","Cheetah");
		map.put("05","Sparrow");
		
		System.out.println("One: "+map.get("01"));
		System.out.println("Two: "+map.get("02"));
		System.out.println("Three: "+map.get("03"));
		
		map.forEach((key,value) -> System.out.println(key + " : " + value)); // BiConsumer Function Interface
	} 

}
