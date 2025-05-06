package basic.to.intermediate;
import java.util.*;
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
        
		//Declare the variable
		Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();

        int sum = 0;

        // Loop from 2 to 30
        for (int i = 2; i <= 30; i++) {
            if (i % 2 == 0) { // Check if number is even
                sum += i;     // Add even number to sum
            }
        }

        // Print the final result
        System.out.println("Sum of even numbers from 2 to " + num + " = " + sum);
    
    }
	}



