package chapter4;

import java.util.Scanner;

/*
 * LOOP BREAK search string to determine if it contains letter "A".
 */

public class LetterSearch {
	public static boolean letterFound = false;

	public static void main(String[] args) {
		//get text
		System.out.println("Enter some text:");
		Scanner scanner = new Scanner(System.in);
		String text = scanner.next();
		scanner.close();
		
		
		//search text for letter A
		for(int i=0; i<text.length(); i++) {
			char currentLetter = text.charAt(i);
			if(currentLetter == 'A' || currentLetter == 'a') {
				letterFound = true;
				break;
			}
		}
		if(letterFound=true) {
			System.out.println("Letter 'A' found");
		}
		else {
			System.out.println("Letter 'A' not found");
		}
		
	}

}
