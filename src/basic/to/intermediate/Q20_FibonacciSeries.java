package basic.to.intermediate;
import java.util.Scanner;

public class Q20_FibonacciSeries {
	/**
	 * This program calculates and displays the first n numbers in the 
	 Fibonacci sequence. Each number is the sum of the previous 
	 two numbers.
	 
	 Code Flow 
	Input: number of terms n
	Initialize first two terms: f1 = 1, f2 = 1
	Loop from i = 3 to n:
		Find next term using f = f1 + f2
		Shift values for next round
	Display all terms
	
	Sample Input/Output
 	Input:
	How many Fibonacci terms? 10
	Output:
	1 1 2 3 5 8 13 21 34 55

	 */

     public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask user for input
        System.out.print("How many Fibonacci terms? ");
        int n = scanner.nextInt();  // Read number of terms
        
        // Handle edge cases for n <= 0
        if (n <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            // First two terms of the Fibonacci sequence
            int f1 = 1, f2 = 1;

            // Output the first Fibonacci number if n is at least 1
            if (n >= 1) {
                System.out.print(f1 + " ");
            }
            
            // Output the second Fibonacci number if n is at least 2
            if (n >= 2) {
                System.out.print(f2 + " ");
            }

            // Calculate and print remaining Fibonacci numbers starting from the 3rd term
            for (int i = 3; i <= n; i++) {
                int nextTerm = f1 + f2;
                System.out.print(nextTerm + " ");
                
                // Shift f1 and f2 for the next iteration
                f1 = f2;
                f2 = nextTerm;
            }
        }
        
        // Close the scanner
        scanner.close();
    }
	
}
