package basic.to.intermediate;

import java.util.Scanner;

public class Q01_AreaOfCircle {
	
	/**
	 * Write a program to read the radius of a circle and calculate 
	 * its area using the formula:
		A = π * r²
	
	Problem Flow:
	1. User inputs radius (r)
	2. Program calculates: area = (22.0 / 7) * r * r
	3. Output displays area with radius
	
	Input / Output Example:
	Input:
	Enter Radius of Circle: 7
	Output:
	Area of Circle with Radius 7.0000 is 154.0000
	 */
	
	
	public static void main(String[] args) {
		// Step 1: Variable Declaration
        /**
         * We declare two variables
         * r for radius and area to store the result.
         */
        
        // Declare required memory variables
        float r, area;

        // Step 2: User Input
        /**
         * Using Scanner class, we ask the user to enter the radius.
         */
        Scanner sc = new Scanner(System.in); // Create scanner object

        System.out.print("Enter Radius of Circle: "); // Prompt user

        r = sc.nextFloat(); // Read radius value from user

        // Step 3: Calculation
        /**
         * Area = (22 / 7) * r * r
         */
        area = (22.0f / 7) * r * r; // Calculate area

        // Step 4: Output
        /**
         * Print area with radius up to 4 decimal places
         */
        System.out.printf("Area of Circle with Radius %.4f is %.4f\n", r, area);

        sc.close(); // Close scanner

    }

}
