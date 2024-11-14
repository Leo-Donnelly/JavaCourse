package chapter4;

import java.util.Scanner;

/*
 * Nested Loops Find average of each students test scores
 */

public class AverageTestScores {

	public static void main(String[] args) {
		// Init what we know
		int numberOfStudents = 24;
		int numberOfTests = 4;
		
		Scanner scanner = new Scanner(System.in);
		
		//process all students
		for(int i=0; i< numberOfStudents; i++) {
			double total = 0;
			
			for(int x=0; x<numberOfTests; x++) {
				System.out.println("Enter score for test #"+(x+1));
				double score = scanner.nextDouble();
				total = total + score;
			}
			double average = total/numberOfTests;
			System.out.println("The test average for student #"+(i+1)+" is "+average);
		}
		scanner.close();

	}

}
