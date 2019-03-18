
public class Person implements Comparable<Person> {
	private String name;
	private int age;
	
	static {	// static initializer block - executes when class loads
		System.out.println("Person class loaded..");
	}
	
	{	// instance block - executes when instantiated
		System.out.println("Person class instantiated..");
	}
	
	public Person() {
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Name: " + name + "\tAge: " + age;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person p = (Person) obj;
			if(p.name.equals(this.name) && age == p.age)
				return true;
		}
		return false;
	}
	
	public int getAge() {
		return age;
	}

	public static void main(String[] args) {
		Person p1 = new Person("Polo", 21);
		Person p2 = new Person("Polo", 21);
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		System.out.println(p1);	// implicitly calls toString()
		System.out.println(p2.toString());
		
		System.out.println(p1.equals(p2));
	}

	@Override
	public int compareTo(Person p) {
		return name.compareTo(p.name);
	}
}











