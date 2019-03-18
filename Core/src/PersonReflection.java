import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PersonReflection {
	
	public static void main(String[] args) {
//		Person p = new Person("Polo", 21);
//		System.out.println(p);
//		System.out.println(p.getClass());
//		
//		Class pc = p.getClass();
		
		// Manually loads any Java class
		Class pc = null;
		try {
			pc = Class.forName("Person");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(pc.getName());
		
		Constructor[] constructors = pc.getConstructors();
		System.out.println("-- List of constructors");
		for (Constructor constructor : constructors) 
			System.out.println(constructor);

		Method[] methods = pc.getMethods();
		System.out.println("-- List of methods");
		for (Method method : methods) 
			System.out.println(method);

		Method[] decMethods = pc.getDeclaredMethods();
		System.out.println("-- List of declared methods");
		for (Method method : decMethods) 
			System.out.println(method);

		Field[] fields = pc.getDeclaredFields();
		System.out.println("-- List of fields");
		for (Field field : fields) 
			System.out.println(field);
		
		
	}
}









