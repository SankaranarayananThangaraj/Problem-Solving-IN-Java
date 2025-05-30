package basic.to.intermediate;
import java.util.Scanner;

public class Q13_SmallestOfNNumbers {
	
	/**
	 * This program first reads how many numbers the user wants to enter 
	 (N). Then it reads those N numbers and finds the smallest among 
	 them.
	 
	 Problem Flow:
	Get total number of inputs N
	Read first number as smallest
	Loop remaining N-1 times
	Compare each number with smallest
	Update smallest if a smaller number is found
	Print final smallest number
	
	Sample Input / Output:
	Input:
	Enter how many numbers you want to input: 5
	Enter number 1: 22
	Enter number 2: 18
	Enter number 3: 31
	Enter number 4: 6
	Enter number 5: 27
	Output:
	The smallest number is: 6

	 */
	public static void main(String[] args) {

        // Step 1: Variable Declaration
        /**
         * Declare variables for input count (n), current input (num), and the smallest value.
         */
        int n, num, smallest;

        // Step 2: User Input - Count
        /**
         * Ask user how many numbers they want to input.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how many numbers you want to input: ");
        n = scanner.nextInt();

        // Step 3: Read First Number
        /**
         * Read the first number and assume it's the smallest for now.
         */
        System.out.print("Enter number 1: ");
        smallest = scanner.nextInt();

        // Step 4: Loop Through Remaining Numbers
        /**
         * Loop from 2 to n to read the rest of the numbers.
         * Compare each with current smallest and update if needed.
         */
        for (int i = 2; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            num = scanner.nextInt();
            if (num < smallest) {
                smallest = num;
            }
        }

        // Step 5: Output Result
        /**
         * After checking all numbers, print the smallest one.
         */
        System.out.println("The smallest number is: " + smallest);

        // Step 6: Close Scanner
        scanner.close();
    }

}
