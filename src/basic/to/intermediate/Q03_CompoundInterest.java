package basic.to.intermediate;

import java.util.Scanner; // Import Scanner class

public class Q03_CompoundInterest {
	
	/**
	 * This program calculates Compound Interest using the formula:
 		F = P × (1 + i)ⁿ
 		Where:
			P = Principal amount
			i = Rate/100
			n = Number of years
 			Here, F is the final amount (principal + interest)
	
		 Problem Flow:
		Input P, R, and N from user
		Calculate i = R / 100
		Use formula F = P × (1 + i)^N
		Display the final compound amount
		
		Input / Output Example:
		Input:
		Enter Principal Value: 10000  
		Enter Rate of Interest: 10  
		Enter No. of Years: 2
		Output:
		Compound Interest 12100.00
	 */
	public static void main(String args[]) {

    // Step 1: Variable Declaration
    /**
     * P = Principal amount
     * R = Rate of Interest
     * N = Number of Years
     * i = Interest rate in decimal
     * F = Final compound amount
     */
    double P, R, N, i, F;

    // Step 2: User Input
    Scanner sc = new Scanner(System.in); // Create scanner object
    System.out.print("Enter Principal Value: ");
    P = sc.nextDouble(); // Read principal

    System.out.print("Enter Rate of Interest: ");
    R = sc.nextDouble(); // Read rate

    System.out.print("Enter No. of Years: ");
    N = sc.nextDouble(); // Read number of years

    // Step 3: Calculation
    i = R / 100; // Convert rate to decimal
    F = P * Math.pow((1 + i), N); // Compound Interest formula

    // Step 4: Output
    System.out.printf("Compound Interest %.2f\n", F); // Display final amount

    sc.close(); // Close scanner
}

}
