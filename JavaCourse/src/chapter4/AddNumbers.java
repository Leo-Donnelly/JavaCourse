package chapter4;

import java.util.Scanner;

/*
 * Do while loop. program allows user to enter two numbers. Adds two numbers then able to repeat till they are done
 */

public class AddNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean again = false;
		do {
			System.out.println("Enter your first number:");
			double num1 = scanner.nextDouble();
			
			System.out.println("Enter your second number:");
			double num2 = scanner.nextDouble();
			
			double sum = num1 + num2;
			
			System.out.println("The sum is "+sum);
			
			System.out.println("Do you want to run again? (TRUE or FALSE)");
			again = scanner.nextBoolean();
			
		}while(again);
		
		scanner.close();
	}

}
