package basic.to.intermediate;
import java.util.Scanner;

public class Q11_FactorialTable {
	
	/**
	 * This program reads a number n from the user and prints the 
	 factorial of numbers from 1 to n in a table format.
	 
	 Problem Flow:
	Read n from user
	Start fact = 1
	Loop from 1 to n
	Multiply fact *= i
	Print each number with its factorial
	
	Sample Output:
	Input:
	Enter the N value: 5

	Output:
	N   |   Factorial
	--------------------
  	1  |            1
  	2  |            2
  	3  |            6
  	4  |           24
  	5  |          120
	 */

	    public static void main(String[] args) {

	        // Step 1: Variable Declaration
	        /**
	         * We declare two variables:
	         * n for the user input
	         * fact to calculate and store factorial
	         */
	        int n;
	        long fact = 1;

	        // Step 2: User Input
	        /**
	         * Using Scanner class, we ask the user to enter a number n.
	         */
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the N value: ");
	        n = scanner.nextInt();

	        // Step 3: Output Header
	        /**
	         * We print the table header before looping.
	         */
	        System.out.println();
	        System.out.println("N   |   Factorial");
	        System.out.println("---------------------");

	        // Step 4: Factorial Calculation and Output
	        /**
	         * We use a loop from 1 to n.
	         * In each iteration, multiply fact by the current number i.
	         * Print the number and its factorial.
	         */
	        for (int i = 1; i <= n; i++) {
	            fact *= i;
	            System.out.printf("%-3d | %11d\n", i, fact);
	        }

	        // Step 5: Close Scanner
	        scanner.close();
	    }
}
