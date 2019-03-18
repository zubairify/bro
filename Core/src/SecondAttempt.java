import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SecondAttempt {
	public static void main(String[] args) {
		String array[] = {"Foo", "Alfa", "Romeo", "Indigo", "Beta", "King", "g"};

		List<String> input = Arrays.asList(array);
//		input.forEach(System.out::println);
//		
//		input.stream().map(alpha -> alpha.toUpperCase()).forEach(System.out::println);
//		
//		input.stream().map(alpha -> alpha.toUpperCase()).sorted().forEach(System.out::println);
//		
//		input.stream().forEach(System.out::println);
		
//		input.stream().parallel().forEach(System.out::println);
		
		List<Integer> lengths = input.stream().map(str -> str.length())
								.collect(Collectors.toList());
		
		lengths.forEach(System.out::println);
	}
}








