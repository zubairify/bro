import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleDemo {
	
	public static void main(String[] args) {
		
		Locale hilo = new Locale("hi");
		ResourceBundle bundle = ResourceBundle.getBundle("msgs", hilo);
		
		System.out.println(bundle.getString("greeting"));
		System.out.println(bundle.getString("message"));
	}
}
