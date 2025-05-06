package basic.to.intermediate;
import java.util.Scanner;

public class Q04_Fahrenheit2Celsius {
	
	/**
	 * This program converts temperature from Fahrenheit to Celsius using the formula:
		C = (5/9) × (F - 32)
		
	Problem Flow:
	Input temperature in Fahrenheit
	Apply formula: C = (5 / 9.0) × (F - 32)
	Display result in Celsius
	
	Input / Output Example:
	Sample Inputs to Test (from question):
	68, 150, 212, 0, -22
	Sample Output (for 68°F):
	68.000000 deg F is 20.000000 deg C
	
	 */
    public static void main(String[] args) {

        // Step 1: Variable Declaration
        /**
         * We declare two variables:
         * F for temperature in Fahrenheit
         * C for converted temperature in Celsius
         */
        double F, C;

        // Step 2: User Input
        /**
         * Using Scanner class, we ask the user to enter the Fahrenheit value.
         */
        Scanner sc = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter temperature in Fahrenheit: ");
        F = sc.nextDouble(); // Read Fahrenheit temperature

        // Step 3: Calculation
        /**
         * Apply the formula:
         * C = (5 / 9.0) * (F - 32)
         */
        C = (5.0 / 9.0) * (F - 32);

        // Step 4: Output
        /**
         * Display the result using formatted output.
         */
        System.out.printf("%.6f deg F is %.6f deg C\n", F, C);

        sc.close(); // Close Scanner
    }


}
