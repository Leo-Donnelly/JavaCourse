package chapter12;

import java.util.Map;

public class HashMaps {

	public static void main(String[] args) {
		Map<K, V> fruitCalories = new HashMap();
		fruitCalories.put("Apple", 95);
		fruitCalories.put("lemon", 20);
		fruitCalories.put("banana", 105);
		fruitCalories.put("orange", 45);
		fruitCalories.put("lemon", 17);
		
		System.out.println(fruitCalories.size()); //4
		System.out.println(fruitCalories); // banana 105 orange 45 apple 95 lemon 17
		
		System.out.println(fruitCalories.get("lemon")); //17
		
		System.out.println(fruitCalories.entrySet()); // banana 105 orange 45 apple 95 lemon 17
		
		fruitCalories.remove("orange");
		System.out.println(fruitCalories); // banana 105 apple 95 lemon 17
	}

}
