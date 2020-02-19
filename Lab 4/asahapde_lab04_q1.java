/* A calculator class that will implement several custom math functions and a program that implements the functions.
 * Author: Abdullah Sahapdeen
 * Date: 11/09/2018
 * Section: 004-3C2415
 */

package asahapde_lab04;

import java.util.Scanner; // Import Scanner class

public class asahapde_lab04_q1 {
	private static Scanner in = new Scanner(System.in); // The scanner object
	private static double dInput; // The double input
	private static int iInput; // The integer input

	public static void main(String[] args) {
		char choice; // Stores the user's choice

		do {
			choice = displayMenu(); // Validate input

			switch (choice) {
			case 'a':
				System.out.println("Please enter a real number base: ");
				dInput = in.nextDouble(); // Store the user input

				// Ask user for input
				System.out.println("Please enter an integer exponent: ");
				iInput = in.nextInt(); // Store the user input

				// Output the result
				System.out.println("The result is: " + Calculator.power(dInput, iInput));

				break;
			case 'b':
				System.out.print("Please enter a number in radians: ");
				dInput = in.nextDouble(); // Store the user input

				while ((dInput > 1) || (dInput < -1)) {
					System.out.println("Incorrect Input! Enter a value between -1 and 1: ");
					dInput = in.nextDouble(); // Store the user input
				}

				System.out.print("Please enter the number of iterations: ");
				iInput = in.nextInt(); // Store the user input

				while (iInput < 0) {
					System.out.println("Incorrect Input! Enter a positive number: ");
					iInput = in.nextInt(); // Store the user input
				}

				System.out.println("The result is: " + Calculator.inverseTangent(dInput, iInput));

				break;
			case 'c':
				System.out.print("Please enter a number in radians: ");
				dInput = in.nextDouble(); // Store the user input

				while ((dInput > 1) || (dInput < -1)) {
					System.out.println("Incorrect Input! Enter a value between -1 and 1: ");
					dInput = in.nextDouble(); // Store the user input
				}

				System.out.print("Please enter the number of iterations: ");
				iInput = in.nextInt(); // Store the user input

				while (iInput < 0) {
					System.out.println("Incorrect Input! Enter a positive number: ");
					iInput = in.nextInt(); // Store the user input
				}

				System.out.println("The result is: " + Calculator.sine(dInput, iInput));

				break;
			case 'd':
				System.out.print("Please enter a number for exponential: ");
				dInput = in.nextDouble(); // Store the user input

				System.out.print("Please enter the number of iterations: ");
				iInput = in.nextInt(); // Store the user input

				while (iInput < 0) {
					System.out.println("Incorrect Input! Enter a positive number: ");
					iInput = in.nextInt(); // Store the user input
				}

				System.out.println("The result is: " + Calculator.exponential(dInput, iInput));

				break;
			case 'e':
				System.out.print("Please input a positive integer: ");
				dInput = in.nextDouble(); // Store the user input

				while (dInput < 0) {
					System.out.println("Incorrect Input! Enter a positive number: ");
					dInput = in.nextDouble(); // Store the user input
				}

				break;
			case 'f':
				System.out.println("------------------------------");
				System.out.println("Goodbye!");
				System.out.println("------------------------------");

				break;
			}
		} while (choice != 'f'); // Exit the program

		in.close(); // Close the scanner object
	}

	private static char displayMenu() {
		char input;

		// Display the Menu
		System.out.println("----------------------------");
		System.out.println("-- Calculator Application --");
		System.out.println("----------------------------");
		System.out.println("a. Power Function");
		System.out.println("b. Inverse Tangent Function");
		System.out.println("c. Sine Function");
		System.out.println("d. Exponential Function");
		System.out.println("e. Factorial Function");
		System.out.println("f. Exit");
		System.out.println("----------------------------");

		// Ask user for choice
		System.out.print("Please enter a choice: ");
		input = in.next().charAt(0); // Get the user choice

		// Validate that the choice entered is a menu option
		while ((((int) input) < 97) || (((int) input) > 102)) {
			System.out.print("Invalid Input! Please enter a,b,c,d,e or f: ");
			input = in.next().charAt(0);
		}

		return input;

	}

	static class Calculator {
		public static double power(double base, int exponent) {
			double result = base;
			boolean negative = false; // The exponent is not negative

			// If the exponent is negative
			if (exponent < 0) {
				exponent *= -1; // Get the absolute value of the exponent number
				negative = true; // The exponent is negative
			}

			// Compute the result by multiplying the base by itself (exponent number) times
			for (int i = 0; i < (exponent - 1); i++) {
				result *= base;
			}

			// if the exponent number is negative and non zero divide 1 by the result
			if (negative && (exponent != 0))
				return 1.0 / result;
			else if ((negative == false) && (exponent != 0)) // If the exponent number is positive and non zero
				return result;
			else // If the exponent number is 0
				return 1;
		}

		public static double inverseTangent(double radians, int iterations) {

			double result = 0.0; // Holds the result

			// Computes the inverse tangent according to the formula
			for (int n = 0; n < iterations; n++) {
				result += ((Calculator.power(-1, n)) * (Calculator.power(radians, (2 * n) + 1))) / ((2 * n) + 1);
			}

			return result; // return the result

		}

		public static double sine(double radians, int iterations) {
			double result = 0.0; // Holds the result

			// Computes the sine according to the formula
			for (int n = 0; n < iterations; n++) {
				result += ((Calculator.power(-1, n)) * (Calculator.power(radians, (2 * n) + 1)))
						/ (Calculator.factorial((2 * n) + 1));
			}

			return result; // return the result
		}

		public static double exponential(double exp, int iterations) {
			double result = 0.0; // Holds the result

			// Computes the exponential according to the formula
			for (int n = 0; n < iterations; n++) {
				result += ((Calculator.power(exp, n)) / (Calculator.factorial(n)));
			}

			return result; // return the result
		}

		public static double factorial(int value) {
			double fact = 1; // The factorial result

			for (int i = value; i > 1; i--) // Iterate from the number to 1
			{
				fact *= i; // compute the factorial
			}

			return fact;
		}

	}

}
