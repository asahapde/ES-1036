/* A program that solves a quadratic equation
 * Author: Abdullah Sahapdeen
 * Date: 10/04/2018
 * Section: 004-3C2415
 */
package asahapde_lab01;

import java.util.Scanner; //Import the scanner class

public class asahapde_lab01_q3 {

	public static void main(String[] args) {
		// The scanner object that gets input from the keyboard
		Scanner in = new Scanner(System.in);

		// Integer variables
		int a = 0, b = 0, c = 0;

		// Double variables
		double det = 0, r1 = 0, r2 = 0; // b^2-4ac, root1, root2

		// Output info about the program *Header*
		System.out.print("******************************************************\r\n" + "");
		System.out.println("ES1036: Lab 01 Q3");
		System.out.println("Date: October 4, 2018");
		System.out.println("Name: Abdullah Sahapdeen");
		System.out.println("Student Number: 251033977");
		System.out.print("Program's mission: Solve a quadratic with the form\r\n" + "ax^2 + bx + c = 0\r\n" + "");
		System.out.println("******************************************************");

		// Ask user for the value
		System.out.print("Please input a: ");

		// Get the value from user
		a = in.nextInt();

		// Ask user for the value
		System.out.print("Please input b: ");

		// Get the value from user
		b = in.nextInt();

		// Ask user for the value
		System.out.print("Please input c: ");

		// Get the value from user
		c = in.nextInt();

		// Calculate b^2 - 4ac
		det = Math.sqrt(Math.pow(b, 2) - (4 * a * c));

		// Algorithm to determine if the equation has any roots
		if (a == 0)
			if (b == 0)
				if (c == 0)
					System.out.println("The solution is trivial");
				else // if b == 0 && c != 0
					System.out.println("A solution does not exist!\r\n" + "");
			else { // if b!= 0
				if (c == 0) // if b != 0 && c==0
					System.out.println("Your equation has a trivial root: 0");
				else // if b != 0 && c!= 0
				{
					r1 = (-1 * c) / b; // Compute the single root
					System.out.println("Your equation has a real root: " + r1);
				}
			}
		else { // if a != 0
			if (b == 0 && c == 0)
				System.out.println("Your equation has a trivial root: 0");
			else if (det >= 0) {
				r1 = ((-1 * b) + det) / (2 * a); // Quadratic formula positive square root
				r2 = ((-1 * b) - det) / (2 * a); // Quadratic formula negative square root
				System.out.println("Your equation has real roots: " + r1 + " and " + r2); // real solution
			} else { // if det < 0
				r1 = ((-1 * b) / (2 * a)); // Compute Real number part of complex formula
				r2 = ((Math.sqrt((4 * a * c) - (Math.pow(b, 2)))) / (2 * a)); // Compute Complex part of complex formula
				System.out.println(
						"Your equation has complex roots: " + r1 + " + " + r2 + "i" + " and " + r1 + " - " + r2 + "i"); // Complex
																														// number
			}
		}

		in.close(); // Close the scanner object
	}

}
