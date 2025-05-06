package basic.to.intermediate;
import java.util.Scanner;

public class Q15_HeatAnalysis {
	
	/**
	 *  This program uses a switch statement to examine the value of 
	 an integer called flag. Based on its value, it prints one of the
	 following messages:
		HOT if the flag has the value 1.
		LUKE WARM if the flag has the value 2.
		COLD if the flag has the value 3.
		OUT OF RANGE if the flag has any other value.
		
	 Problem Flow:
	Prompt the user to input an integer value for the flag.
	Use a switch statement to check the value of the flag and assign the correct heat status.
	Print the flag value and its corresponding heat status.
	
	Sample Input / Output:
	Input:
	Enter Heat code (1-3): 2

	Output:
	Flag 2 is LUKE WARM


	 */
	public static void main(String[] args) {

        // Step 1: Variable Declaration
        /**
         * Declare an integer variable for flag and a string for status.
         */
        int flag;
        String status;

        // Step 2: User Input
        /**
         * Prompt the user to enter the heat code (1 to 3).
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Heat code (1-3): ");
        flag = scanner.nextInt();

        // Step 3: Switch Case Analysis
        /**
         * Use a switch statement to determine the heat status based on flag.
         */
        switch (flag) {
            case 1:
                status = "HOT";
                break;
            case 2:
                status = "LUKE WARM";
                break;
            case 3:
                status = "COLD";
                break;
            default:
                status = "OUT OF RANGE";
        }

        // Step 4: Output Result
        /**
         * Print the result with flag value and corresponding heat status.
         */
        System.out.println("Flag " + flag + " is " + status);

        // Step 5: Close Scanner
        scanner.close();
    }

}
