package chapter6;
/*
 * write a class that creates instances of rectangle class to find total area of two rooms in a house
 */

public class HomeAreaCalc {

	public static void main(String[] args) {
		/********
		 * RECTANGLE 1
		 **********/
		
		//create instance of rectangle class
		Rectangle room1 = new Rectangle();
		room1.setWidth(25);
		room1.setLength(50);
		double areaOfRoom1 = room1.calculateArea();
		
		/********
		 * RECTANGLE 2
		 **********/
		//create instance of rectangle class
		
		Rectangle room2 = new Rectangle(30, 75);
		double areaOfRoom2 = room2.calculateArea();
		
		double totalArea = areaOfRoom1 + areaOfRoom2;
		
		System.out.println("The total area is " + totalArea);
		
	}

}
