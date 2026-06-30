package Streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapStreamDemo {
	
	public static void main(String[] args) {
		Map<String, String> people = new HashMap<>();
		
		people.put("Polo","Pune");
		people.put("Mili","Mumbai");
		people.put("Shraddha","Delhi");
		
//		people.keySet().stream().forEach(System.out::println);
//		people.values().stream().forEach(System.out::println);
//		List<String> cities = people.values().stream().map( c -> c.toUpperCase()).sorted().collect(Collectors.toList());
//		
//		cities.forEach(System.out::println);
			
		Map<String, List<String>> contacts = new HashMap<>();
		
		contacts.put("Fradu", Arrays.asList("1212-3434","5656-7878"));
		contacts.put("Sean", Arrays.asList("2121-2121","9898-9090"));
		contacts.put("Atharva", Arrays.asList("4040-3030","2020-1010"));
	
//	contacts.values().stream().flatMap(Collection::stream).forEach(System.out::println);
	

	// print all number that has 8
	
	contacts.values().stream().flatMap(Collection::stream).filter(number -> number.contains("8")).forEach(System.out::println);
	
	
	// Print all number removing "-"
	contacts.values().stream().flatMap(Collection::stream).map(s -> s.replace("-","")).forEach(System.out::println);
	
	
	}

}
