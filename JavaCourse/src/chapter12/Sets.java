package chapter12;

import java.util.Set;

public class Sets {

	public static void main(String[] args) {
		Set<String> fruit = new HashSet();
		fruit.add("apple");
		fruit.add("lemon");
		fruit.add("banana");
		fruit.add("orange");
		fruit.add("lemon");
		
		System.out.println(fruit.size()); // 4
		System.out.println(fruit); // banana orange apple lemon
		
		var i = fruit.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		for(String item: fruit) {
			System.out.println(item);
		}
		
		//fruit.forEach(x -> System.out.println(x));
		
		fruit.forEach(System.out::println);

}
