import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.Vector;
import java.util.function.Consumer;

public class CollectionDemo {
	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.add("Apple");
		v.add("Oracle");
		v.add("Google");
		v.add("Microsoft");
		v.add("Apache");
		
		System.out.println("-- Traversing over vector using for-loop");
		for(int i=0; i<v.size(); i++)
			System.out.println(v.get(i));
		
		System.out.println("-- Traversing over vector using iterator");
		Iterator<String> itr = v.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println("-- Traversing over vector using for-each");
		for (String node : v) 
			System.out.println(node);
		
		ArrayList<String> lst = new ArrayList<>();
		lst.add("Facebook");
		lst.add("Amazon");
		lst.add("Google");
		
		v.addAll(lst);	// merging collection
		System.out.println("-- Traversing over updated vector using for-each");
		for (String node : v) 
			System.out.println(node);
		
		// Converting collection types
		HashSet<String> set = new HashSet<>(v);
		System.out.println("-- Traversing over Hashset using for-each");
		for (String node : set) 
			System.out.println(node);
		
		TreeSet<String> tree = new TreeSet<>(set);
		System.out.println("-- Traversing over TreeSet using for-each");
		for (String node : tree.descendingSet()) 
			System.out.println(node);
	
		System.out.println("-- Traversing in Java 8 style");
		
		class ConsumerImpl implements Consumer<String> {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		}
		
		Consumer<String> consumerTest = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};
		
		Consumer<String> consumer = (str) -> System.out.println(str); 
		
		tree.forEach(System.out::println);
	}
}










