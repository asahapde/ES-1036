/* A program that calculates statistics on a set of integer inputs.
 * Author: Abdullah Sahapdeen
 * Date: 10/18/2018
 * Section: 004-3C2415
 */
package ashapde_lab02;

import java.util.Scanner; // Import the scanner class

public class asahapde_lab02_q2 {

	// The main method
	public static void main(String[] args) {
		// Initialize the scanner object with keyboard as input
		Scanner in = new Scanner(System.in);

		int n = 0; // The number of loops
		int num = 0; // Integer numbers entered by user
		int sum = 0; // Sum of all integers entered
		double mean = 0; // Mean value of all integers entered
		int max = Integer.MIN_VALUE; // Max value of all integers entered
		int min = Integer.MAX_VALUE; // Min value of all integers entered
		int even = 0; // Count of even numbers entered
		int odd = 0; // Count of odd numbers entered

		int[] numbers; // Store all the numbers
		double stdev = 0; // Store the standard deviation
		double stdevT = 0; // Store the sum part of stdev

		// Output the program header
		System.out.println("------------------------------");
		System.out.println("Abdullah Sahapdeen");
		System.out.println("Lab 02");
		System.out.println("Date: October 18, 2018");
		System.out.println("Question 2");
		System.out.println("------------------------------");

		do {
			// Ask user for amount of loops
			System.out.println("Enter an integer number for the number of loop iterations: ");
			n = in.nextInt();
		} while (n < 1); // Validate the loop count to be not less than or equal to 0

		numbers = new int[n]; // Initialize the array with the array size

		for (int i = 0; i < n; i++) {
			System.out.println(); // Add a space between each information
			System.out.print("Enter integer " + (i + 1) + ": "); // Ask user for input
			num = in.nextInt(); // Get the number input by user

			numbers[i] = num; // Store the numbers into the array

			sum += num; // Calculate the sum of all integers entered
			mean = (double) sum / (double) (i + 1); // Calculate the mean of all integers input
			max = Math.max(max, num); // Calculate the max of all the integers entered
			min = Math.min(max, num); // Calculate the min of all the integers entered

			stdevT = 0; // Reset the sum back to 0
			for(int j = 0; j < n;j++)
				stdevT += Math.pow(numbers[j] - mean, 2); // Calculate the sum of the stdev equation

			if (n >= 2)
				stdev = (Math.sqrt(stdevT / (n - 1))); // Calculate the standard deviation

			// Check if the number is even or odd
			if (num % 2 == 0)
				even++; // Add 1 to even
			else
				odd++; // Add 1 to odd

			// Output the statistics
			System.out.println("The mean of " + (i + 1) + " input(s) is: " + mean);
			System.out.println("Max value: " + max);
			System.out.println("Min value: " + min);
			System.out.println("Even count: " + even);
			System.out.println("Odd count: " + odd);

			if (n >= 2) // Do not print if there are less than 2 data points
				System.out.println("Standard deviation: " + stdev);
		}

		System.out.println("\nGoodbye!"); // Print before exiting

		in.close(); // Close the scanner object
	}

}
