package basic.to.intermediate;
import java.util.Scanner;

public class Q05_AreaVolumeSphere {
	
	/**
	 *  This program calculates the Volume and Surface Area of a sphere 
	 *  using the following formulas:
			Volume (V) = (4/3) × π × r³
			Area (A) = 4 × π × r²
	
	Problem Flow:
	Get r (radius) from user
	Calculate area using A = 4πr²
	Calculate volume using V = (4/3)πr³
	Display both values
	
	 Input / Output Example:
	Input:
	Enter Radius of Sphere: 7
	Output:
	Volume of Sphere: 1436.571429
	Area of Sphere  : 615.428571
	
	 */
public static void main(String[] args) {
		
		// Step 1: Variable Declaration
		/**
		 * Declare required memory variables:
		 * r for radius, area for surface area, volume for volume
		 */
		double r, area, volume;

		// Step 2: User Input
		/**
		 * Using Scanner class, we ask the user to enter the radius.
		 */
		Scanner sc = new Scanner(System.in); // Create Scanner object
		
		System.out.print("Enter Radius of Sphere: ");
		r = sc.nextDouble(); // Read radius

		// Step 3: Calculations
		/**
		 * Apply formulas:
		 * area   = 4 × π × r²
		 * volume = (4 / 3.0) × π × r³
		 */
		area = 4 * Math.PI * r * r;
		volume = (4.0 / 3.0) * Math.PI * r * r * r;

		// Step 4: Output
		/**
		 * Display surface area and volume using formatted output.
		 */
		System.out.printf("Volume of Sphere: %.6f\n", volume);
		System.out.printf("Area of Sphere  : %.6f\n", area);

		sc.close(); // Close Scanner
	}


}
