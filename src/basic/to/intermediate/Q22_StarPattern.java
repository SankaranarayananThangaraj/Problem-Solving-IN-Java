package basic.to.intermediate;
import java.util.Scanner;

public class Q22_StarPattern {
	
	/**This program prints a right-aligned triangle star pattern using 
	 nested for loops. The number of lines (n) is provided by the user.
	 
	Problem Flow
	Get number of lines from user.
	Loop from 1 to n (line-by-line).
	For each line:
	Print n - i spaces.
	Print i stars.
	Go to the next line.

	Input / Output Example
	Input:
	How many Lines? 5
	Output:
   *
   **
  ***
 ****
*****

	 */

	   public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of lines
        System.out.print("How many Lines? ");
        int n = scanner.nextInt();  // Read number of lines

        // Loop through each line
        for (int i = 1; i <= n; i++) {
            // Print spaces first (n - i spaces)
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            // Then print stars (i stars)
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            // Move to the next line after printing spaces and stars
            System.out.println();
        }

        // Close the scanner
        scanner.close();
    }

}
