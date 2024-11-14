package chapter3;

import java.util.Scanner;

/*
 * nested ifs, to qualify for a loan person must make £30,000 a year and having worked for at least 2 years at current job
 */

public class LoanQualifier {

	public static void main(String[] args) {
		
		//init what we know
		int requiredSalary = 30000;
		int requiredYears = 2;
		
		//get what we don't
		System.out.println("Enter your salary:");
		Scanner scanner = new Scanner(System.in);
		double salary = scanner.nextInt();
		
		System.out.println("Enter years worked:");
		double years = scanner.nextInt();
		
		scanner.close();
		
		//make decision
		if(salary >= requiredSalary) {
			if(years>=requiredYears) {
				System.out.println("You are able to get a loan.");
			}
			else {
				System.out.println("You have the required salary but have not worked enough years.");
			}
		}
		else {
			System.out.println("You have not met the required salary.");
		}
		
	}

}
