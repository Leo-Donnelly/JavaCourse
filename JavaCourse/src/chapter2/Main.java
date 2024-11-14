package chapter2;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// get num hours worked
		System.out.println("Enter the numbers of hours worked:");
		Scanner scanner = new Scanner(System.in);
		int hours = scanner.nextInt();
		
		//get hourly rate
		System.out.println("Enter the employee's pay rate:");
		double rate = scanner.nextDouble();
		scanner.close();
		
		//multiply hours and pay rate
		double grossPay = hours * rate;
		
		//display result
		System.out.println("The gross pay for the employee is £"+grossPay);
		
	}

}
