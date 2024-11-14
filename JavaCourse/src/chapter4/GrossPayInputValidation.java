package chapter4;

import java.util.Scanner;

/*
 * while loop each store employee makes £15 an hour. Write a program that allows the employee to enter num of hours worked for the week. no overtime.
 */

public class GrossPayInputValidation {

	public static void main(String[] args) {
		//init known
		int rate = 15;
		int maxHours = 40;
		
		//get unknown
		System.out.println("How many hours did you work this week?");
		Scanner scanner = new Scanner(System.in);
		double hoursWorked = scanner.nextDouble();
		
		//validate input
		while(hoursWorked>maxHours || hoursWorked < 1) {
			System.out.println("Invalid hours worked. Enter again:");
			hoursWorked = scanner.nextDouble();
		}
		scanner.close();
		
		//calc gross
		double gross = rate * hoursWorked;
		System.out.println("Gross pay: £" + gross);

	}

}
