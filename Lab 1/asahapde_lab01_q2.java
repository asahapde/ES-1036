/* A program that converts a lower case letter to upper case
 * Author: Abdullah Sahapdeen
 * Date: 10/04/2018
 * Section: 004-3C2415
 */
package asahapde_lab01;

import java.util.Scanner; //Import the scanner object

public class asahapde_lab01_q2 {

	public static void main(String[] args) {
		//The scanner object that gets input from the keyboard
		Scanner in = new Scanner(System.in);
		
		//The char variables to hold the smaller case letter and the upper case letter
		char letS;
		char letU;
		
		// Output info about the program *Header*
		System.out.println("******************************************************");
		System.out.println("ES1036: Lab 01 Q2");
		System.out.println("Date: October 4, 2018");
		System.out.println("Name: Abdullah Sahapdeen");
		System.out.println("Student Number: 251033977");
		System.out.println("Program's mission: Convert a lowercase character\r\n" + 
				"to its uppercase variant\r\n" + 
				"");
		System.out.println("******************************************************");
		
		//Ask user for the character
		System.out.print("Input a character: ");
		
		//Get the character input from user
		letS = in.next().charAt(0);
		
		//Convert the smaller case character to upper case
		letU = (char)(((int)letS)-32);
		
		//Output the upper case character to user
		System.out.println(letU);
		
		in.close(); //Close the scanner object
		
	}

}
