package chapter4;

import java.util.Scanner;

/*
 * FOR loop
 */
public class Cashier {

	public static void main(String[] args) {
		//get num of items to scan
		System.out.println("Enter number of items you want to scan:");
		Scanner scanner = new Scanner(System.in);
		int quantity = scanner.nextInt();
		
		double total = 0;
		
		//create loop to iterate through all of the items and acumate the costs
		
		for(int i=0; i<quantity; i++) {
			
			System.out.println("Enter the cost of the item:");
			double price = scanner.nextDouble();
			
			total = total + price;
			
		}
		
		scanner.close();
		
		System.out.println("Your total is £"+total);
	}

}
