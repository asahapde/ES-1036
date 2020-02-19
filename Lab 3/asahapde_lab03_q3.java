/* A program that prints the employee info 
 * Author: Abdullah Sahapdeen
 * Date: 10/25/2018
 * Section: 004-3C2415
 */
package asahapde_lab03;

import java.util.Scanner; // Import the scanner object

public class asahapde_lab03_q3 {

	// The main method
	public static void main(String[] args) {
		// Initialize the scanner object with keyboard as the input
		Scanner in = new Scanner(System.in);

		Employee e; // Stores the employee object
		String firstName; // Stores the employee's first name
		String lastName; // Stores the employee's last name
		int salary; // Stores the employee's salary

		// Ask user for the input
		System.out.print("Enter the employee’s first name: ");
		firstName = in.next(); // Store the user input

		// Ask user for the input
		System.out.print("Enter the employee’s last name: ");
		lastName = in.next(); // Store the user input

		do {
			// Ask user for the input
			System.out.print("Enter the employee’s salary: ");
			salary = in.nextInt(); // Store the user input
		} while (salary <= 0); // Validate negative salary

		// Initialize the employee object with the given info
		e = new Employee(firstName, lastName, salary);

		// Output the user info
		e.printInfo();

		// Output to indicate the end of program
		System.out.println("\nGoodbye!");

		in.close(); // Close the scanner object

	}

}
