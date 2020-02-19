/* A program that gets input and computes a value
 * Author: Abdullah Sahapdeen
 * Date: 9/27/2018
 * Section: 004-3C2415
 */
package asahapde_lab00;

import java.util.Scanner; //Import the Scanner class

public class asahapde_lab00_q1 {
	//The main method
	public static void main(String[] args) {
		// Declare integer variables
		int integer1 = 0; // first number to be input by user
		int integer2 = 0; // second number to be input by user
		int result; // variable in which sum will be stored

		// Declare a different type variable
		Scanner inputScanner = new Scanner(System.in); //Create a new scanner object that takes the keyboard as input
		// Ask your TA about this line

		// Print output to screen
		System.out.println("Enter an integer :");
		// prompt ; "\n" represents a new line
		// read an integer using the inputScanner variable
		integer1 = inputScanner.nextInt();
		
		// Print output to screen
		System.out.println("Enter a second integer ");
		integer2 = inputScanner.nextInt(); //Get the integer input

		// Compute a value
		result = integer1 / integer2 * integer1 + integer2;
		
		// Output the result to the console
		System.out.println("The result is: " + Integer.toString(result));

		inputScanner.close(); //Close the input scanner

	}

}
