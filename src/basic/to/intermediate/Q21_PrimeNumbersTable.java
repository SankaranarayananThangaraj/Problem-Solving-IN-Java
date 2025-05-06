package basic.to.intermediate;
import java.util.Scanner;


public class Q21_PrimeNumbersTable {
	
	/**
	 * This program reads a number n and prints the first n prime numbers.
	 A prime number is a number that is divisible only by 1 and itself.
	 
	 Problem Flow
	Get input n (how many primes).
	Start checking from 2.
	Use isPrime() to validate.
	If prime, print it and increment count.
	Stop when count reaches n.
	 
	Input / Output Example
	Input:
	How many Prime numbers? 10
	Output:
	2 3 5 7 11 13 17 19 23 29

	 */

	 public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of primes to generate
        System.out.print("How many Prime numbers? ");
        int n = scanner.nextInt();  // Read number of primes

        // Handle edge case where n <= 0
        if (n <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            int count = 0;  // Count of primes found
            int num = 2;    // Start checking from 2 (the first prime)

            // Loop to find and print the first n primes
            while (count < n) {
                if (isPrime(num)) {
                    System.out.print(num + " ");
                    count++;
                }
                num++;
            }
        }

        // Close the scanner
        scanner.close();
    }

    // Helper method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;  // Numbers less than or equal to 1 are not prime
        }
        
        // Check for factors from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;  // If divisible by any number, it's not prime
            }
        }

        return true;  // Number is prime if no factors found
    }

}
