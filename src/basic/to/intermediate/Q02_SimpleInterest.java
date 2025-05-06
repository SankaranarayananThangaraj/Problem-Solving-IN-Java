package basic.to.intermediate;
import java.util.Scanner;

public class Q02_SimpleInterest {
	
	/**
	 * Write a Java program to calculate Simple Interest using the formula:
 		SI = (P × N × R) / 100
 		Where:
		P = Principal amount
		N = Number of years
		R = Rate of interest
		
		Problem Flow:
		User inputs:
			Principal (P)
			Rate (R)
			Years (N)
		Program calculates:
			SI = (P × N × R) / 100
		Output displays the Simple Interest value.
		
		Input / Output Example:
		Input:
		Enter Principal Amount: 10000  
		Enter Rate of Interest: 5  
		Enter No. of Years: 2
		Output:
		Simple Interest = 1000.00
	 */
	public static void main(String args[]) {
	// Step 1: Variable Declaration
    /**
     * We declare three variables for input:
     * P = Principal amount
     * R = Rate of Interest
     * N = Number of Years
     * And one variable for result: SI = Simple Interest
     */
    float P, R, N, SI;

    // Step 2: User Input
    /**
     * Using Scanner class, we ask the user to enter:
     * Principal, Rate, and Number of Years
     */
    Scanner sc = new Scanner(System.in); // Create scanner object

    System.out.print("Enter Principal Amount: ");
    P = sc.nextFloat(); // Read principal

    System.out.print("Enter Rate of Interest: ");
    R = sc.nextFloat(); // Read rate

    System.out.print("Enter No. of Years: ");
    N = sc.nextFloat(); // Read number of years

    // Step 3: Calculation
    /**
     * Simple Interest = (P × N × R) / 100
     */
    SI = (P * N * R) / 100;

    // Step 4: Output
    /**
     * Display the result with 2 decimal places
     */
    System.out.printf("Simple Interest = %.2f\n", SI);

    sc.close(); // Close scanner
	}
}