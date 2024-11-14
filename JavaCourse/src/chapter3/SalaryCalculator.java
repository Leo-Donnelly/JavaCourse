package chapter3;

import java.util.Scanner;

/* 
 * If statements. salespeople pay £1000 a week and if they sell 10 or more bonus is £250
 */

public class SalaryCalculator {

	public static void main(String[] args) {
		
	//init known values
	int salary = 1000;
	int bonus = 250;
		
	// get unknown values
	System.out.println("How many sales did the employee make this week?");
	Scanner scanner = new Scanner(System.in);
	int sales = scanner.nextInt();
	scanner.close();
		
	//quick detour for bonus earners
	if(sales>10) {
		salary = salary + bonus;
	}
	
	//output
	System.out.println("The ending salary for the employee is £"+salary);
	}

}
