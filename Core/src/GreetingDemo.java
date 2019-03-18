import static java.lang.System.out;

class GreetingDemo {
	
	public static void main(String[] args) {
		
		Greeting g1 = out::println;
		
		g1.print("Zubair");
	}	
}