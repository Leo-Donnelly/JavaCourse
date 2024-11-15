package chapter12;

import java.util.Queue;

public class LinkedLists {

	public static void main(String[] args) {
		Queue fruit = new LinkedList();
		fruit.add("apple");
		fruit.add("lemon");
		fruit.add("banana");
		fruit.add("orange");
		fruit.add("lemon");
		
		System.out.println(fruit.size()); // 5
		System.out.println(fruit); // apple lemon banana orange lemon
		
		fruit.remove();
		System.out.println(fruit); //lemon banana orange lemon
		
		System.out.println(fruit.peek()); // lemon

	}

}
