package basic.to.intermediate;
import java.util.Scanner;

public class Q18_StringReverse {
	
	/**
	 *  This program takes a string (text) and creates its reverse 
	 version in another string (reverseText). Each character from the 
	 original string is added in reverse order to the new string.
	 
	 Flow Summary
	Read the input string
	Loop from last character to first
	Use comma operator in loop (i--, j++)
	Add each character to reverseText
	Print the reversed output
	
	Sample I/O
	Input:
	Enter the string below:
	hello
	Output:
	Reversed Text: olleh

	 */
	 public static void main(String[] args) {

	        // Step 1: Variable Declaration
	        /**
	         * Declare variables for input string and the reversed version.
	         */
	        String text, reverseText = "";

	        // Step 2: User Input
	        /**
	         * Prompt the user to enter a string.
	         */
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the string below:");
	        text = scanner.nextLine();

	        // Step 3: Reverse Logic
	        /**
	         * Loop from the end of the string to the beginning.
	         * Append characters to reverseText.
	         */
	        for (int i = text.length() - 1, j = 0; i >= 0; i--, j++) {
	            reverseText += text.charAt(i);
	        }

	        // Step 4: Output Result
	        /**
	         * Print the reversed string.
	         */
	        System.out.println("Reversed Text: " + reverseText);

	        // Step 5: Close Scanner
	        scanner.close();
	    }

}
