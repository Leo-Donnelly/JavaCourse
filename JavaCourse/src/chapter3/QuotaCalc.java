package chapter3;

import java.util.Scanner;

/*
 * IF ELSE - sales people expected 10 sales a week, If they do give a congrats if not inform them if they short.
 */
public class QuotaCalc {

	public static void main(String[] args) {
		//init values we know
		int quota = 10;
		
		//get values we dont know
		System.out.println("Enter the amount of sales made this week:");
		Scanner scanner = new Scanner(System.in);
		int sales = scanner.nextInt();
		scanner.close();
		
		//make decision on path to take and output
		if(sales>=quota) {
			System.out.println("Well done you have made more than 10 sales this week!");
		}
		else {
			int salesshort = quota - sales;
			System.out.println("You have fell short of the required 10 sales a week by "+salesshort+" sales. Better luck next time.");
		}

}
}
