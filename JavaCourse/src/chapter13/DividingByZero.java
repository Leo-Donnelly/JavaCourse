package chapter13;

public class DividingByZero {

	public static void main(String[] args) {

		divideZero();
		

	}
	public static void divideZero() {
		try {
			int c = 30/0;
		}catch(Exception e) {
			System.out.println("Division is fun!");
			e.printStackTrace();
		}
	}

}
