package chapter3;

import java.util.Scanner;

public class GradeMessage {

	public static void main(String[] args) {
		System.out.println("Please enter your letter grade:");
		Scanner scanner = new Scanner(System.in);
		String grade = scanner.next();
		scanner.close();
		
		String message;
		
		switch(grade) {
		case "A":
			message = "Excelent job";
			break;
		case "B":
			message = "Good job";
			break;
		case "C":
			message = "Okay job";
			break;
		case "D":
			message = "Better luck next time";
			break;
		case "F":
			message = "Oh well you tried";
			break;
		default: 
			message = "Error";
			break;
		}
		System.out.println("Your grade was "+grade+" "+message);

	}

}
