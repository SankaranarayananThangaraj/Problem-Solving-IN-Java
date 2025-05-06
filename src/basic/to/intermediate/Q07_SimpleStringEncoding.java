package basic.to.intermediate;
import java.util.Scanner;
public class Q07_SimpleStringEncoding {
	
	/**
	 * This program reads a five-letter word from the user and encodes 
	 it by subtracting 1 from the ASCII value of each character. 
	 It then prints the newly encoded word.
	 
	 Problem Flow:
	Get 5-letter word input
	Loop each character → subtract 1 from ASCII
	Build new string with changed characters
	Print encoded result
	
	Input / Output Example:
	Input:
	Enter a Five letter word: white
	Output:
	Encoded Word: vghsd
	 */
public static void main(String[] args) {
		
		// Step 1: Variable Declaration
		/**
		 * Declare variables:
		 * word for input string
		 * encodedWord for result string
		 */
		String word, encodedWord = "";

		// Step 2: User Input
		/**
		 * Use Scanner to read a 5-letter word from the user
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Five letter word: ");
		word = sc.nextLine();

		// Step 3: Encoding
		/**
		 * Loop through each character,
		 * subtract 1 from ASCII value,
		 * and build encodedWord
		 */
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			ch = (char)(ch - 1); // Subtract 1 from ASCII
			encodedWord += ch;  // Append to result
		}

		// Step 4: Output
		/**
		 * Display the encoded word
		 */
		System.out.println("Encoded Word: " + encodedWord);

		sc.close(); // Close Scanner
	}


}
