package basic.to.intermediate;
import java.util.Scanner;

public class Q16_ColorAnalysis {
	
	/**
	 *  This program uses a switch statement to examine the value of a 
	 char-type variable called colour and prints one of the following
	 messages, depending on the character assigned:
		RED if either r or R is assigned to colour.
		GREEN if either g or G is assigned to colour.
		BLUE if either b or B is assigned to colour.
		BLACK if any other character is assigned to colour.
		
		Problem Flow:
		Prompt the user to enter a single character for the color code.
		Use a switch statement to check the character and assign the corresponding color.
		Print the entered color code and the corresponding color name.

		Sample Input / Output:
		Input:
		Enter Color code character: g
		Output:
		Color Code g is GREEN

	 */ 
	       public static void main(String[] args) {

	        // Step 1: Variable Declaration
	        /**
	         * Declare a character variable for color code and a string for the color name.
	         */
	        char colour;
	        String colorName;

	        // Step 2: User Input
	        /**
	         * Prompt the user to enter a single character for the color code.
	         */
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter Color code character: ");
	        colour = scanner.next().charAt(0);

	        // Step 3: Switch Statement to Determine Color
	        /**
	         * Use a switch statement with cases for lowercase and uppercase values.
	         */
	        switch (colour) {
	            case 'r':
	            case 'R':
	                colorName = "RED";
	                break;
	            case 'g':
	            case 'G':
	                colorName = "GREEN";
	                break;
	            case 'b':
	            case 'B':
	                colorName = "BLUE";
	                break;
	            default:
	                colorName = "BLACK";
	        }

	        // Step 4: Output the Result
	        /**
	         * Print the input character and the corresponding color name.
	         */
	        System.out.println("Color Code " + colour + " is " + colorName);

	        // Step 5: Close Scanner
	        scanner.close();
	    }

}
