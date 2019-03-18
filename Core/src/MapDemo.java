import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class MapDemo {
	
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
	
		map.put("jack", "jill");
		map.put("scott", "tiger");
		map.put("java", "duke");
		map.put("jack", "rose");
		
		for(String key : map.keySet())
			System.out.println(key + ": " + map.get(key));
		
//		System.out.println(map.get("scott"));
//		System.out.println(map.get("java"));
//		System.out.println(map.get("jack"));
		
		Queue<String> que = new LinkedList<>();
		// add elements and fetch them to print
		
	}
}













