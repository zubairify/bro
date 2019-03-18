import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FirstAttempt {
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(2,5,7,10,2);
		Stream<Integer> str = numbers.stream().distinct();
		str.forEach(System.out::println);
		System.out.println("-----");
		
		Stream<Integer> str2 = numbers.stream().filter(n -> n >= 5);
		str2.forEach(System.out::println);
		System.out.println("-----");
		
		Stream<Integer> str3 = numbers.stream().limit(3);
		str3.forEach(System.out::println);
		System.out.println("-----");
		
		Stream<Integer> str4 = numbers.stream().distinct().sorted();
		str4.forEach(System.out::println);
		System.out.println("-----");
		
		int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println("Sum of numbers " + sum);
		System.out.println("-----");
	}
}







