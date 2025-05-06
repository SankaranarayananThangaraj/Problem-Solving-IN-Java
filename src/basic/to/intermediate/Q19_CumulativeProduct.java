package basic.to.intermediate;
import java.util.Scanner;

public class Q19_CumulativeProduct {
	
	/**
	 * This program reads a set of numbers from the user and calculates 
	 the cumulative product, which means multiplying all the numbers 
	 together one by one.
	 
	 Code Flow 
	Get number count n
	Use for loop to input numbers
	Multiply each number with product
	Print final result
	
	Test Data
	Input:
	6.2, 12.3, 5.0, 18.8, 7.1, 12.8
	Output:
	Cumulative Total = 514537.165312


	 */
	public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of numbers to input
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();  // Read number count

        // Initialize product to 1 (since multiplying by 1 doesn't change the result)
        double product = 1.0;

        // Ask the user to input the numbers and compute the cumulative product
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            double num = scanner.nextDouble();  // Read each number
            product *= num;  // Multiply the current number with the cumulative product
        }

        // Display the cumulative product result
        System.out.printf("Cumulative Total = %.12f\n", product);  // Printing with high precision

        // Close the scanner
        scanner.close();
    }
}
