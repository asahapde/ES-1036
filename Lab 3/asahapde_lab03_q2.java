/* A program according to the specifications below that will approximate the inverse tangent of a number input by the user.
 * Author: Abdullah Sahapdeen
 * Date: 10/25/2018
 * Section: 004-3C2415
 */
package asahapde_lab03;

import java.util.Scanner; // Import the Scanner class

public class asahapde_lab03_q2 {

	// The main method
	public static void main(String[] args) {
		// Initialize the canner object with keyboard as the input
		Scanner in = new Scanner(System.in);

		double number = 0; // Store the number
		String cont = "y"; // Stores if the user wants to continue

		do {
			// Ask user for input
			System.out.print("Enter a value to compute the inverse tangent (-1 to 1): ");
			number = in.nextDouble(); // Store the user input

			// Validate if the number entered is between 1 and -1
			if ((number > 1) || (number < -1)) {
				System.out.println("Incorrect Input!");
				continue;
			}

			// Output the results
			System.out.print("The result is " + computeInverseTangent(number) + "\n");

			// Ask user if they want to continue
			do {
				System.out.print("Would you like to continue? (y/n): ");
				cont = in.next(); // Get the user choice
			} while ((cont.charAt(0)!='y') && (cont.charAt(0)!='n')); // Validate that user enters y or n

		} while (cont.equals("y")); // Continue if the user choose "y"

		System.out.println("\nGoodbye!"); // Output to indicate end of program

		in.close(); // Close the scanner object

	}

	/*
	 * Computes the inverse tangent of a number double number - holds the number
	 */
	public static double computeInverseTangent(double number) {

		double result = 0.0; // Holds the result

		// Computes the inverse tangent according to the formula
		for (int n = 0; n < 10000; n++) {
			result += ((computePower(-1, n)) * (computePower(number, (2 * n) + 1))) / ((2 * n) + 1);
		}

		return result; // return the result

	}

	/*
	 * Returns the the result of a base to a power double base - holds the base
	 * number double power - holds the power number
	 */
	public static double computePower(double base, int power) {
		double result = base;
		boolean negative = false; // The power is not negative

		// If the power is negative
		if (power < 0) {
			power *= -1; // Get the absolute value of the power number
			negative = true; // The power is negative
		}

		// Compute the result by multiplying the base by itself (power number) times
		for (int i = 0; i < (power - 1); i++) {
			result *= base;
		}

		// if the power number is negative and non zero divide 1 by the result
		if (negative && (power != 0))
			return 1.0 / result;
		else if ((negative == false) && (power != 0)) // If the power number is positive and non zero
			return result;
		else // If the power number is 0
			return 1;

	}

}
