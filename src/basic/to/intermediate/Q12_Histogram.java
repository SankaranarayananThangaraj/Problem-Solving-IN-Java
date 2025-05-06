package basic.to.intermediate;
import java.util.Scanner;

public class Q12_Histogram {
	
	/**
	 * This program reads 5 numbers (each between 1 and 30) from the user.
	 For each number, it prints a line with that many asterisks *, 
	 forming a simple bar chart or histogram.
	 
	 Problem Flow:
	Read 5 numbers from the user
	Loop through each number
	For each number:
	Print the number
	Print that many * using inner loop
	
	Sample Output:
	Input:
	Enter 5 Numbers in a same line: 
	3 7 2 6 1
	Output:
	3 ***
 	7 *******
 	2 **
 	6 ******
 	1 *
 	
	 */
	public static void main(String[] args) {

        // Step 1: Variable Declaration
        /**
         * We declare an array to store 5 numbers.
         */
        int[] numbers = new int[5];

        // Step 2: User Input
        /**
         * Using Scanner class, we ask the user to input 5 numbers in a single line.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 5 Numbers in a same line: ");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Step 3: Display Histogram
        /**
         * Loop through each number in the array.
         * Print the number followed by that many asterisks '*'.
         */
        for (int i = 0; i < 5; i++) {
            System.out.print(numbers[i] + " ");
            for (int j = 0; j < numbers[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Step 4: Close Scanner
        scanner.close();
    }
}


