package chapter5;

import java.util.Scanner;

/*
 * SCOPE, write instant credit check program, anyone who makes more than £25000 and has a credit score of 700 or greater. reject others
 */
public class InstantCreditCheck {
	static int requiredSalary = 25000;
	static int requiredCreditScore = 70;
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		double salary = getSalary();
		int creditScore = getCreditScore();
		scanner.close();
		
		//check if user is qualified
		boolean qualified = isUserQualified(creditScore, salary);
		//notify user
		notifyUser(qualified);

	}

	
	public static double getSalary() {
		System.out.println("Enter your salary:");
		double salary = scanner.nextDouble();
		return salary;
	}
	
	public static int getCreditScore() {
		System.out.println("Enter your credit score:");
		int creditScore = scanner.nextInt();
		return creditScore;
	}
	
	public static boolean isUserQualified(int creditScore, double salary) {
		if(creditScore >= requiredCreditScore && salary >= requiredSalary) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void notifyUser(boolean isQualified) {
		if(isQualified) {
			System.out.println("Congrats you've been aproved!");
		}
		else {
			System.out.println("You've been denied!");
		}
	}
	
}
