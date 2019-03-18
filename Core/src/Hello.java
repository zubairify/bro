
@FunctionalInterface
public interface Hello {
	String sayHello();
	
	String toString();
	
	default void greeting(String name) {
		System.out.println(name + " greets " + sayHello());
	}
	
	static int calcSquare(int num) {
		return num * num;
	}
}
