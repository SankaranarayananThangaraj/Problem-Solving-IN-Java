package basic.to.intermediate;

public class Q10_ProductOfOddIntegers {
	
	/**
	 * This program calculates and prints the product of odd numbers from 1 to 15.
		(Odd numbers: 1, 3, 5, 7, ..., 15)
		
		Problem Flow:
		Start from 1 to 15
		Increment by 2 to get odd numbers
		Multiply all odd numbers
		Print the final product
		
		Input / Output Example:
		Output:
		Product of odd numbers from 1 to 15 = 2027025
		(Odd numbers: 1 × 3 × 5 × 7 × 9 × 11 × 13 × 15 = 2027025)

	 */
	public static void main(String[] args) {

		// Step 1: Variable Declaration
		/**
		 * Declare variable product to store the result
		 */
		long product = 1; // Use long to avoid overflow

		// Step 2: Loop and Calculation
		/**
		 * Loop from 1 to 15 with step of 2
		 * Multiply each odd number to product
		 */
		for (int i = 1; i <= 15; i += 2) {
			product *= i;
		}

		// Step 3: Output
		/**
		 * Print the final product
		 */
		System.out.println("Product of odd numbers from 1 to 15 = " + product);
	}

}
