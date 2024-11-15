package chapter12;

import java.util.List;

public class UnchangeableList {

	public static void main(String[] args) {
		List<E> unchangeableList = List.of("apple","lemon","banana");
		unchangeableList.add("orange");
		unchangeableList.remove(1);

	}

}
