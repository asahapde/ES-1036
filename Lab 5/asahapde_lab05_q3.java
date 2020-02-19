/* A program that will scale and print a rectangle  
 * Author: Abdullah Sahapdeen
 * Date: 11/15/2018
 * Section: 004-3C2415
 */
package asahapde_lab05;

import java.util.Scanner; // Import the scanner class

public class asahapde_lab05_q3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); // Initialize the scanner object with keyboard as input

		Rectangle rect; // Rectangle object we create

		char option; // User menu option

		int x1, y1, x2, y2; // The rectangle coordinates

		// Ask user for input
		System.out.println("Please enter x1: ");
		x1 = in.nextInt(); // Get the user input

		// Ask user for input
		System.out.println("Please enter y1: ");
		y1 = in.nextInt(); // Get the user input

		// Ask user for input
		System.out.println("Please enter x2: ");
		x2 = in.nextInt(); // Get the user input

		// Ask user for input
		System.out.println("Please enter y2: ");
		y2 = in.nextInt(); // Get the user input

		rect = new Rectangle(x1, y1, x2, y2);

		do {
			System.out.println("a. Scale");
			System.out.println("b. Print");
			System.out.println("c. Shift");
			System.out.println("d. Exit");

			// Ask user for input
			System.out.println("Please enter a choice: ");
			option = in.next().charAt(0); // Get the user input

			// Validate that the user inputs a valid choice
			while ((int) option < 97 || (int) option > 100) {
				System.out.println("Please enter a,b or c: ");
				option = in.next().charAt(0);
			}

			switch (option) {
			case 'a':
				System.out.println("Please enter a scale: ");
				rect.scale(in.nextDouble());
				break;
			case 'b':
				rect.print();
				break;
			case 'c':
				int shift = 0;
				System.out.println("Please enter a shift value: ");
				shift = in.nextInt();

				if (shift < 0) {
					if (rect.getShift() + shift < 0)
						shift = 0;
					else
						shift = (rect.getShift() + shift);
				}
				rect.shift(shift);
				break;
			case 'd':
				System.out.println("Goodbye!");
				break;
			}

		} while (option != 'd'); // Loop until user exits

		in.close(); // Close the scanner class

	}

}

class Rectangle {
	private double side1;
	private double side2;
	private int shift = 0;

	public Rectangle(double x1, double y1, double x2, double y2) {
		side1 = (x2 - x1);
		side2 = (y2 - y1);
	}

	public void scale(double scale) {
		side1 *= scale;
		side2 *= scale;
	}

	public void print() {
		for (int i = 0; i < side2; i++) {
			for (int j = 0; j < side1 + shift; j++) {
				if ((i == 0 || i == side2 - 1) && j >= shift)
					System.out.print("*");
				else if (j == shift || j == side1 + shift - 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("\n");
		}
	}

	public void shift(int shift) {
		this.shift = shift;
	}

	public int getShift() {
		return shift;
	}

}
