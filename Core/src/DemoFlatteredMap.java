import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DemoFlatteredMap {
	public static void main(String[] args) {
		Map<String, String> people = new HashMap<>();
		people.put("Polo", "Mumbai");
		people.put("Lili", "Pune");
		people.put("Mili", "Bangalore");
		
		List<String> cities = people.values().stream()
				  .map(ct -> ct.toUpperCase()).collect(Collectors.toList());
		
		cities.forEach(System.out::println);
		
		Map<String, List<String>> contacts = new HashMap<>();
		contacts.put("Polo", Arrays.asList("555-1123", "555-3389"));
		contacts.put("Lili", Arrays.asList("555-2243", "555-5264"));
		contacts.put("Mili", Arrays.asList("555-6654", "555-3242"));
		
		List<String> phones = contacts.values().stream()
		  .flatMap(Collection::stream)
		    .collect(Collectors.toList());

		phones.forEach(System.out::println);
	}
}





