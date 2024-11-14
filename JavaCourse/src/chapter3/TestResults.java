package chapter3;

import java.util.Scanner;

public class TestResults {

	public static void main(String[] args) {
		//get test score
		System.out.println("Enter your test score:");
		Scanner scanner = new Scanner(System.in);
		double score = scanner.nextInt();
		scanner.close();
		
		//determine the grade
		char grade;
		
		if(score<40) {
			grade = 'F';
		}
		else if(score<50) {
			grade = 'D';
		}
		else if(score<60) {
			grade = 'C';
		}
		else if(score<70) {
			grade = 'B';
		}
		else {
			grade = 'A';
		}
		System.out.println("Your grade was "+ grade);
	}

}
