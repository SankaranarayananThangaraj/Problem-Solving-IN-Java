package basic.to.intermediate;
import java.util.Scanner;

public class Q14_TextAnalysis {
	
	/**
	 *  This program will read a line of text from the user, analyze 
	 each character, and count how many are letters, digits, whitespace, 
	 or other types of characters (like punctuation).
	 
	 Problem Flow:
	Prompt the user to input a line of text.
	Initialize counters for letters, digits, spaces, and other characters.
	Loop through each character and classify it into one of the categories.
	Display the count for each category: letters, digits, spaces, and others.

	Sample Input / Output:
	Input:
	Enter the text below:
	Hello World! 123

	Output:
	Letters : 10
	Digits : 3
	Space Chars : 2
	Others : 2

	 */

	    public static void main(String[] args) {

	        // Step 1: Variable Declaration
	        /**
	         * Declare counters for letters, digits, spaces, and others.
	         */
	        int letters = 0, digits = 0, spaces = 0, others = 0;

	        // Step 2: User Input
	        /**
	         * Ask the user to enter a line of text using Scanner and nextLine().
	         */
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the text below:");
	        String text = scanner.nextLine();

	        // Step 3: Character Analysis
	        /**
	         * Loop through each character and classify it using Character class methods.
	         */
	        for (int i = 0; i < text.length(); i++) {
	            char ch = text.charAt(i);
	            if (Character.isLetter(ch)) {
	                letters++;
	            } else if (Character.isDigit(ch)) {
	                digits++;
	            } else if (Character.isWhitespace(ch)) {
	                spaces++;
	            } else {
	                others++;
	            }
	        }

	        // Step 4: Output Result
	        /**
	         * Display the result of the analysis.
	         */
	        System.out.println("Letters : " + letters);
	        System.out.println("Digits : " + digits);
	        System.out.println("Space Chars : " + spaces);
	        System.out.println("Others : " + others);

	        // Step 5: Close Scanner
	        scanner.close();
	    }
	}

