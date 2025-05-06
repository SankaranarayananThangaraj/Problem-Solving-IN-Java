package basic.to.intermediate;
import java.util.Scanner;

public class Q08_SumOfOddIntegers {
	
	/**
	 * This program calculates the sum of the first n odd integers 
	 (Example: 1 + 3 + 5 + ... + (2n - 1)).
	 
	 Problem Flow:
	Input n from user
	Loop from 1 to (2n−1) in steps of 2
	Accumulate the sum
	Print the result
	
	Input / Output Example:
	Input:
	Enter how many odd numbers to sum: 5
	Output:
	Sum of first 5 odd numbers is 25
	(1 + 3 + 5 + 7 + 9 = 25)

	 */
	public static void main(String[] args) {

		// Step 1: Variable Declaration
		/**
		 * Declare variables:
		 * n for number of odd integers
		 * sum to store result
		 * i for loop control
		 */
		int n, sum = 0;

		// Step 2: User Input
		/**
		 * Use Scanner to read how many odd numbers to sum
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many odd numbers to sum: ");
		n = sc.nextInt();

		// Step 3: Calculation
		/**
		 * Loop from 1 to (2n - 1), incrementing by 2
		 * Add each odd number to sum
		 */
		for (int i = 1; i <= 2 * n - 1; i += 2) {
			sum += i;
		}

		// Step 4: Output
		/**
		 * Print the final sum
		 */
		System.out.println("Sum of first " + n + " odd numbers is " + sum);

		sc.close(); // Close Scanner
	}


}
