/* A program that gets two coordinates and computes the perimeter of the triangle formed
 * Author: Abdullah Sahapdeen
 * Date: 9/27/2018
 * Section: 004-3C2415
 */
package asahapde_lab00;

import java.util.Scanner; //Import the scanner class

public class asahapde_lab00_q3 {
	//The main method
	public static void main(String[] args) {

		// Declare double variables
		double x1 = 0, y1 = 0, x2 = 0, y2 = 0, side1 = 0, side2 = 0, distance = 0, perimeter = 0;

		// Declare a different type variable
		Scanner inputScanner = new Scanner(System.in); //Create a new scanner object that takes the keyboard as input

		// Get user inputs
		System.out.print("Please enter x1: "); // Ask user for input
		x1 = inputScanner.nextInt(); // Get user input

		
		System.out.print("Please enter y1: "); // Ask user for input
		y1 = inputScanner.nextInt(); // Get user input


		System.out.print("Please enter x2: "); // Ask user for input
		x2 = inputScanner.nextInt(); // Get user input


		System.out.print("Please enter y2: "); // Ask user for input
		y2 = inputScanner.nextInt(); // Get user input


		side1 = Math.abs(x2 - x1); // Compute the first side length of the triangle
		side2 = Math.abs(y2 - y1); // Compute the second side length of the triangle

		// Compute the hypotenuse of the triangle
		distance = Math.sqrt(Math.pow(side1, 2.0) + Math.pow(side2, 2.0));

		// Compute the perimeter of the triangle
		perimeter = side1 + side2 + distance;

		// Output the result to the user
		System.out.println("The perimeter of the triangle formed by the points (" +
		Double.toString(x1) + "," + Double.toString(y1) + ") and (" +
				Double.toString(x2) + "," + Double.toString(y2) + 
				") is " + Double.toString(perimeter));

		inputScanner.close(); //Close the input scanner
	}

}
