package chapter4;

import java.util.Scanner;

public class AverageTestScoresSubProg {
	// Init what we know
	public static int numberOfStudents = 24;
	public static int numberOfTests = 4;
	public static Scanner scanner = new Scanner(System.in);
	public static int counter = 0;
	public static double total = 0;

	public static void main(String[] args) {
		//process all students
		for(int counter=0; counter<numberOfStudents; counter++) {
			counter = counter+1;
			getTotal(numberOfTests);
			getAverage(numberOfTests);
			
		}
		scanner.close();
	}
	
	public static double getTotal(int numberOfTests) {
		for(int x=0; x<numberOfTests; x++) {
			System.out.println("Enter score for test #"+(x+1));
			double score = scanner.nextDouble();
			total = total + score;
		}
		return total;
	}
	
	public static void getAverage(double total) {
		double average = total/numberOfTests;
		System.out.println("The test average for student #"+(counter+1)+" is "+average);
	}
	
}
