/* A program that displays a menu with four conversion options and exit.
 * Author: Abdullah Sahapdeen
 * Date: 10/18/2018
 * Section: 004-3C2415
 */
package ashapde_lab02;

import java.util.Scanner; //Import the scanner 

public class asahapde_lab02_q1 {

	// The main method
	public static void main(String[] args) {
		// Initialize the scanner object with keyboard as input
		Scanner in = new Scanner(System.in);

		// The variable that hold the option entered by user from the main menu
		int option = 0;

		// The variable that hold the number input by the user for conversions
		double num = 0;

		// Output the program header
		System.out.println("------------------------------");
		System.out.println("Abdullah Sahapdeen");
		System.out.println("Lab 02");
		System.out.println("Date: October 18, 2018");
		System.out.println("Question 1");
		System.out.println("------------------------------");

		do {
			// Output the menu
			System.out.println("******************************");
			System.out.println("****** Value Conversion ******");
			System.out.println("******************************");
			System.out.println("* 1. Celsius -> Fahrenheit *");
			System.out.println("* 2. Centimeters -> Inches *");
			System.out.println("* 3. Meters -> Feet        *");
			System.out.println("* 4. Km/h -> MPH           *");
			System.out.println("* 5. Exit                  *");
			System.out.println("******************************");

			// Ask the user which operation to perform
			System.out.println("Please input a choice (1-5): ");
			option = in.nextInt(); // Get the user input

			// If input is not between 1-5
			if (option < 1 || option > 5) {
				continue;
			}

			// Logic of what to do for each option 1-4
			switch (option) {
			case 1:
				// Ask user for the input
				System.out.println("Input a Degree in Celcius: ");
				num = in.nextDouble(); // Get the user input

				// if the temperature is less than 0
				if (num < 0)
					System.out.println("Ice may be possible, please be careful.");

				//Print the conversion
				System.out.println("The conversion is " + (((9.0 / 5.0) * num) + 32) + " F");
				break; // Break out of case 1
			case 2:
				do {
					// Ask user for the input
					System.out.println("Input a number in centimeters: ");
					num = in.nextDouble(); // Get the user input
					
					// Check if the input is positive
					if (num >= 0) {
						System.out.println("The conversion is " + (num * 0.39) + " Inches");
						break;
					}
				} while (true); // Keep asking for input until positive value is entered
				break; // Break out of case 2
			case 3:
				do {
					// Ask user for the input
					System.out.println("Input a number in meters: ");
					num = in.nextDouble(); // Get the user input
					
					// Check if the input is positive
					if (num >= 0) {
						System.out.println("The conversion is " + (num * 3.28) + " Feet");
						break;
					}
				} while (true); // Keep asking for input until positive value is entered
				break; // Break out of case 3
			case 4:
				do {
					// Ask user for the input
					System.out.println("Input a number of Km/h (0-160): ");
					num = in.nextDouble(); // Get the user input
					
					// Check if the input between 0 -160
					if (num >= 0 && num <= 160) {
						System.out.println("The conversion is " + (num * 0.39) + " MPH");
						break; 
					}
				} while (true); // Keep asking for input until value between 0 -160 is entered
				break; // Break out of case 4
			case 5:
				// Print after exiting the program
				System.out.println("------------------------------");
				System.out.println("Goodbye!");
				System.out.println("------------------------------");
				break; // Break out of case 5
			}

		} while (option != 5); // Exit the loop if 5 is entered



		in.close(); // Close the scanner object
	}
}
