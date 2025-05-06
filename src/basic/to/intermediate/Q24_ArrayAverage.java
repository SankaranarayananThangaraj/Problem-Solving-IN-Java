package basic.to.intermediate;
import java.util.Scanner;

public class Q24_ArrayAverage {
	
	/**
	 * This program reads n numbers into an array, calculates the average 
	 of those numbers using a loop, and displays the result. 
	 It demonstrates how to use arrays and object-oriented concepts 
	 like classes and methods in Java.
	 
	Problem Flow
	Read input size n
	Read n elements into array
	Loop through array to compute sum
	Divide sum by n to get average
	Display result
	
	 Input / Output Example
Input:
Enter how many numbers: 5
Enter the numbers:
10
20
30
40
50

Output:
Average of the numbers: 30.00


	 */

	public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of elements (size of the array)
        System.out.print("Enter how many numbers: ");
        int n = scanner.nextInt();  // Read the size of the array

        // Handle edge case where n <= 0
        if (n <= 0) {
            System.out.println("Please enter a positive integer for the number of elements.");
        } else {
            // Create an array to store the numbers
            int[] numbers = new int[n];
            int sum = 0;  // Variable to store the sum of numbers

            // Ask the user to enter the numbers
            System.out.println("Enter the numbers:");
            for (int i = 0; i < n; i++) {
                numbers[i] = scanner.nextInt();  // Read each number into the array
                sum += numbers[i];  // Add the current number to the sum
            }

            // Calculate the average
            double average = (double) sum / n;

            // Display the average with 2 decimal places
            System.out.printf("Average of the numbers: %.2f\n", average);
        }

        // Close the scanner
        scanner.close();
    }

}
