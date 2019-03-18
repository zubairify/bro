
public class HelloImpl {
	
	public static void main(String[] args) {
		
		Hello h = () -> "Hello World!";		// implementation
		
		System.out.println(h.sayHello());	// invocation
		
		h.greeting("Zubair");
		
		System.out.println(Hello.calcSquare(5));
		
	}
}
