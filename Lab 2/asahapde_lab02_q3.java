/* A program that takes an input integer and outputs the number’s factorial.
 * Author: Abdullah Sahapdeen
 * Date: 10/18/2018
 * Section: 004-3C2415
 */
package ashapde_lab02;

import java.util.Scanner; // Import the scanner class

public class asahapde_lab02_q3 {

	// The main method
	public static void main(String[] args) {
		// Initialize the scanner object with keyboard as input
		Scanner in = new Scanner(System.in);

		int num = 0; // The input entered by user
		double fact = 1; // The factorial result

		// Output the program header
		System.out.println("------------------------------");
		System.out.println("Abdullah Sahapdeen");
		System.out.println("Lab 02");
		System.out.println("Date: October 18, 2018");
		System.out.println("Question 3");
		System.out.println("------------------------------");

		// Ask user for input
		System.out.print("Input an integer number to calculate its factorial: ");
		num = in.nextInt(); // Get user input

		// Validate data for no negative input
		while (num < 0) {
			// Tell user to enter a positive input
			System.out.print("Invalid Entry! Please enter a positive integer: ");
			num = in.nextInt(); // Get user input
		}

		// Calculate the factorial of the number
		for (int i = num; i > 1; i--) // Iterate from the number to 1
		{
			fact *= i;
		}

		System.out.println("The resulting factorial is: " + fact); // Output the result

		in.close(); // Close the scanner object
	}

}
