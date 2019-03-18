
public class StringDemo {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = new String("Hello");
		String s3 = "Hello";
		
		// Comparing addresses
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		
		// Comparing content
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		// Manipulating string
		s1 = s1 + "World";
		System.out.println(s1);
		
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(3, 7));
		
		System.out.println(s1.indexOf('o'));
		System.out.println(s1.lastIndexOf('o'));
		System.out.println(s1.charAt(5));
		
		System.out.println(s1.concat("ofJava"));
		System.out.println(s1.replace('o', 'a'));
		
		System.out.println(s1);
	}
}








