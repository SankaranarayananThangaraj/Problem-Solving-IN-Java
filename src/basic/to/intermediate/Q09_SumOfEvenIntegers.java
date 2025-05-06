package basic.to.intermediate;

public class Q09_SumOfEvenIntegers {
	
	/**
	 * This program finds the sum of even numbers between 2 and 30 (inclusive).
	 	
	 Problem Flow:
	Start loop from 2 to 30
	Check if number is even (i % 2 == 0)
	Add to sum
	Print final sum
	
	 Input / Output Example:
	Output:
	Sum of even numbers from 2 to 30 = 240
	(Even numbers: 2 + 4 + 6 + ... + 30 = 240)
	 */
	public static void main(String[] args) {
		
		// Step 1: Variable Declaration
		/**
		 * Declare variables:
		 * sum to store the result
		 * i for loop iteration
		 */
		int sum = 0;

		// Step 2: Loop and Calculation
		/**
		 * Loop from 2 to 30 (inclusive)
		 * Check if number is even
		 * Add to sum
		 */
		for (int i = 2; i <= 30; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}

		// Step 3: Output
		/**
		 * Print the final sum
		 */
		System.out.println("Sum of even numbers from 2 to 30 = " + sum);
	}


}
