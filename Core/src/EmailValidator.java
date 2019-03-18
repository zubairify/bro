
public class EmailValidator {

	// 1- Only 1 occurrences of @ and .
	// 2- Min 4 chars before @
	// 3- Min 3 chars between @ and .
	// 4- Min 2 chars after .
	public static void main(String[] args) {
		String email = "zubair@mail.com";

		int ioat = email.indexOf('@');
		int idot = email.indexOf('.');

		if (ioat == email.lastIndexOf('@') && idot == email.lastIndexOf('.') 
				&& ioat >= 4 && (idot - ioat) > 3 && (email.length() - idot) > 2)
			System.out.println("Valid Email");
		else
			System.out.println("Invalid Email");
	}
}
