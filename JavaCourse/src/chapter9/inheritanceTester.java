package chapter9;

public class inheritanceTester {

	public static void main(String[] args) {
		
		Mother mum = new Mother();
		mum.setName("billy joel");
		
		System.out.println(mum.getName() + mum.getGender());
		
		Rectangle rectangle = new Rectangle();
		rectangle.print();
		
		Square square = new Square();
		square.print("square");

	}
	
	public static void testSquareOverride() {
		Rectangle rectangle = new Rectangle();
		rectangle.setLength(4);
		rectangle.setWidth(8);
		System.out.println(rectangle.calculatePerimeter());
		
		Square square = new Square();
		square.setLength(4);
		square.setWidth(8);
		System.out.println(square.calculatePerimeter());
	}

}
