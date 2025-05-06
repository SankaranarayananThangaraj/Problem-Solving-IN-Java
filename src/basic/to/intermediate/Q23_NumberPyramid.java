package basic.to.intermediate;
import java.util.Scanner;

public class Q23_NumberPyramid {
	
	/**This program prints a numeric pyramid pattern where numbers 
	 increase from the middle outwards and then decrease symmetrically. 
	 The pattern is centered and uses nested loops
	 
	 Problem Flow Summary
	Ask user for number of lines (n).
	For each line i from 1 to n:
	Print spaces to align the pyramid.
	Print increasing numbers (i to i + i - 1).
	Print decreasing numbers back to i.
	Move to the next line after printing each row.
	
Input / Output Example
Input:
Enter Number of Lines: 5

Output:
   1
   232
  34543
 4567654
567898765


	 
	 */

	 public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of lines
        System.out.print("Enter Number of Lines: ");
        int n = scanner.nextInt();  // Read number of lines

        // Outer loop for each row
        for (int i = 1; i <= n; i++) {
            // Print spaces to center the pyramid
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print increasing numbers from i to 2i-1
            for (int j = i; j < i + i; j++) {
                System.out.print(j);
            }

            // Print decreasing numbers from 2i-2 down to i
            for (int j = i + i - 2; j >= i; j--) {
                System.out.print(j);
            }

            // Move to the next line after printing this row
            System.out.println();
        }

        // Close the scanner
        scanner.close();
    }

}
