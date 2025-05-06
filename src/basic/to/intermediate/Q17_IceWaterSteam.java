package basic.to.intermediate;
import java.util.Scanner;

public class Q17_IceWaterSteam {
	
	/**
	 *  This program checks the temperature value (temp) and determines 
	 the physical state of water:
		If temp < 0 → "ICE"
		If temp is between 0 and 100 (inclusive) → "WATER"
		If temp > 100 → "STEAM"
		
		Flow Summary:
		Get user input for temperature
		Use if-else to decide the state of water
		Display the result to the user
		
		Sample I/O:
		Input:
		Enter the water temperature: 120
		Output:
		Water status is STEAM for the Temperature 120.00

	 */
	 public static void main(String[] args) {

	        // Step 1: Variable Declaration
	        /**
	         * Declare a float variable to hold the temperature value.
	         * A string variable to hold the water state.
	         */
	        float temp;
	        String state;

	        // Step 2: User Input
	        /**
	         * Prompt the user to enter the temperature of water.
	         */
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the water temperature: ");
	        temp = scanner.nextFloat();

	        // Step 3: Determine Water State
	        /**
	         * Use if-else statements to classify the temperature.
	         */
	        if (temp < 0) {
	            state = "ICE";
	        } else if (temp <= 100) {
	            state = "WATER";
	        } else {
	            state = "STEAM";
	        }

	        // Step 4: Display Output
	        /**
	         * Print the result with temperature formatted to 2 decimal places.
	         */
	        System.out.printf("Water status is %s for the Temperature %.2f\n", state, temp);

	        // Step 5: Close Scanner
	        scanner.close();
	    }

}
