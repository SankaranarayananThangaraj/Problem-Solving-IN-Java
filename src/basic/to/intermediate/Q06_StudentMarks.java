package basic.to.intermediate;
import java.util.Scanner;

public class Q06_StudentMarks {
	
	/**
	 * This program allows the user to enter 3 test marks of a student, 
	 calculates the total and average, and displays the result.
	 
	Problem Flow:
	Get 3 marks from user
	Add marks → total
	Divide total by 3.0 → average
	Display total and average
	
	Input / Output Example:
	Input:
	Enter Mark 1: 80  
	Enter Mark 2: 75  
	Enter Mark 3: 85  
	Output:
	Total Marks   = 240  
	Average Marks = 80.0
	 */
	public static void main(String[] args) {

		// Step 1: Variable Declaration
		/**
		 * Declare variables:
		 * m1, m2, m3 for marks
		 * total for total marks
		 * average for average marks
		 */
		int m1, m2, m3, total;
		double average;

		// Step 2: User Input
		/**
		 * Use Scanner to get marks from the user
		 */
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Mark 1: ");
		m1 = sc.nextInt();

		System.out.print("Enter Mark 2: ");
		m2 = sc.nextInt();

		System.out.print("Enter Mark 3: ");
		m3 = sc.nextInt();

		// Step 3: Calculation
		/**
		 * Calculate total and average
		 */
		total = m1 + m2 + m3;
		average = total / 3.0;

		// Step 4: Output
		/**
		 * Display total and average marks
		 */
		System.out.println("Total Marks   = " + total);
		System.out.println("Average Marks = " + average);

		sc.close(); // Close Scanner
	}

}
