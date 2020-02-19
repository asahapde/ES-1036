/* A program that allows two users to play a word guessing game.
 * Author: Abdullah Sahapdeen
 * Date: 11/09/2018
 * Section: 004-3C2415
 */
package asahapde_lab04;

import java.util.Scanner; // Import the scanner class

public class asahapde_lab04_q2 {
	public static void main(String[] args) {
		WordGame game = new WordGame(); // Initialize the word game object
	}

}

class WordGame {
	public WordGame() {
		Scanner in = new Scanner(System.in); // Initialize the scanner object

		// The variables
		StringBuilder guessWord = new StringBuilder(); // The guessed word
		String userWord; // The main word the user enters
		String guessLetter; // The letter guessed by the user
		String userChoice; // The choice entered by the user

		// Ask user for input
		System.out.println("Enter a word to begin the game: ");
		userWord = new String(in.next()); // Store user input

		// Start the guessed word with all stars
		for (int i = 0; i < userWord.length(); i++) {
			guessWord.append("*");
		}

		// Run for 10 tries
		for (int userTurn = 1; userTurn <= 10; userTurn++) {
			System.out.println("\n|Current Turn: " + userTurn + "|");
			System.out.println(guessWord.toString().toUpperCase()); // Output the guessed word

			// Ask user for input
			System.out.println("Would you like to guess the word? (y/n): ");
			userChoice = in.next(); // get the user input

			// Validate that user enter y or n
			while (!(userChoice.equals("y") || userChoice.equals("n"))) {
				System.out.println("Incorect input! Please enter y or n: ");
				userChoice = in.next();
			}

			// Validate if the correct word has been entered
			if (userChoice.equals("y")) {
				
				// Ask user for input
				System.out.println("Please enter your choice: ");
				userChoice = in.next(); // Get the user input
				
				// If the correct work is entered
				if (userChoice.equalsIgnoreCase(userWord.toString())) {
					for (int j = 0; j < guessWord.length(); j++) {
						guessWord.setCharAt(j, userChoice.charAt(j));
					}

					System.out.println("\n" + guessWord.toString().toUpperCase());
					System.out.println("You win with " + (10 - userTurn) + " turn(s) remaining!");

					break;
				} else {
					continue;
				}
			}

			// Ask user to guess a character
			System.out.println("Input a character to make a guess: ");
			guessLetter = in.next();

			// Check if the guessed character is part of the word
			for (int i = 0; i < userWord.length(); i++) {
				if (userWord.substring(i, i + 1).equalsIgnoreCase(guessLetter)) {
					guessWord.setCharAt(i, guessLetter.charAt(0));
				}
			}
			
			// If the correct word has been entered by guessing every individual character
			if (guessWord.indexOf("*") == -1) {
				System.out.println("\n" + guessWord.toString().toUpperCase());
				System.out.println("You win with " + (10 - userTurn) + " turn(s) remaining!");
				break;
			}
		}
		
		// If the user has not guessed the word after 10 tries
		if(!(guessWord.indexOf("*") == -1))
		{
			System.out.println("\nGameover!"); 
			System.out.println("The word was " + userWord.toString().toUpperCase());
		}

		in.close(); // Close the scanner object
	}
}
