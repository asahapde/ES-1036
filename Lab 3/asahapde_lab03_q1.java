/* A program that will compute a power given an operand and an integer power value.
 * Author: Abdullah Sahapdeen
 * Date: 10/25/2018
 * Section: 004-3C2415
 */
package asahapde_lab03;

import java.util.Scanner; // Import the scanner class

public class asahapde_lab03_q1 {

	// The main method
	public static void main(String[] args) {

		// Initialize the Scanner object with the keyboard as the input
		Scanner in = new Scanner(System.in);

		double base = 0; // Variable that stores the base
		int power = 0; // Variable that stores the power

		// Ask user for input
		System.out.println("Please enter a real number base: ");
		base = in.nextDouble(); // Store the user input

		// Ask user for input
		System.out.println("Please enter an integer exponent: ");
		power = in.nextInt(); // Store the user input

		// Output the result
		System.out.println("The result is: " + computePower(base, power));

		in.close(); // Close the scanner object
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
