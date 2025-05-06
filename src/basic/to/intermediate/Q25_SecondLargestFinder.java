package basic.to.intermediate;
import java.util.Scanner;

public class Q25_SecondLargestFinder {
	
	/**
	 * This program reads n integers into an array and finds the second
	 largest number among them. It uses a class with methods for input, 
	 processing (finding second largest), and output. It showcases 
	 array handling and object-oriented principles in Java.
	 
	Problem Flow 
	Read input size n
	Store values in array
	Use loop to compare and find:
		largest
		secondLargest
	Display result
	
	Input / Output Example
Input:
Enter how many numbers: 6
Enter the numbers:
10
45
22
45
8
19

Output:
Second largest number is: 22


	 */

	    // Method to read the numbers from user input
    public static int[] inputNumbers(int n, Scanner scanner) {
        int[] numbers = new int[n];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();  // Read each number into the array
        }
        return numbers;
    }

    // Method to find the second largest number in the array
    public static int findSecondLargest(int[] numbers) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > largest) {
                secondLargest = largest;  // Update second largest
                largest = num;  // Update largest
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;  // Update second largest if it's smaller than largest but larger than second largest
            }
        }

        // Handle case when there is no valid second largest number
        if (secondLargest == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("There is no second largest number.");
        }

        return secondLargest;
    }

    // Method to display the second largest number
    public static void displaySecondLargest(int secondLargest) {
        System.out.println("Second largest number is: " + secondLargest);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get the number of elements from the user
        System.out.print("Enter how many numbers: ");
        int n = scanner.nextInt();

        // Handle edge case where there are fewer than two numbers
        if (n < 2) {
            System.out.println("Please enter at least two numbers.");
            return;
        }

        // Step 1: Read the numbers into an array
        int[] numbers = inputNumbers(n, scanner);

        // Step 2: Find the second largest number
        try {
            int secondLargest = findSecondLargest(numbers);

            // Step 3: Output the result
            displaySecondLargest(secondLargest);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
         // Close the scanner
        scanner.close();
    }

}
