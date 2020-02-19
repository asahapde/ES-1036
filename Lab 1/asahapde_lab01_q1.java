/* A program that calculates the weighted average of four grades
 * Author: Abdullah Sahapdeen
 * Date: 10/04/2018
 * Section: 004-3C2415
 */
package asahapde_lab01;

import java.util.Scanner; // Import the scanner class

public class asahapde_lab01_q1 {

	public static void main(String[] args) {
		//The scanner object that gets input from the keyboard
		Scanner in = new Scanner(System.in);
		
		//The double variables for the grades, grade weights and the final grade
		double g1=0,g2=0,g3=0,g4=0,w1=0,w2=0,w3=0,w4=0,fg=0;
		
		//Output info about the program *Header*
		System.out.println("****************************************************");
		System.out.println("ES1036: Lab 01 Q1");
		System.out.println("Date: October 4, 2018");
		System.out.println("Name: Abdullah Sahapdeen");
		System.out.println("Student Number: 251033977");
		System.out.println("Program's mission: This program calculates a\r\n" + 
				"weighted average of four grades.");
		System.out.println("******************************************************");
		
		
		//Ask user for the grade
		System.out.println("Input the first grade: ");
		g1 = in.nextDouble(); //Get the grade input from user
		
		//Ask user for the grade weight
		System.out.println("Input the first grade weight: ");
		w1 = in.nextDouble(); //Get the grade weight input from user
		
		//Ask user for the grade
		System.out.println("Input the second grade: ");
		g2 = in.nextDouble(); //Get the grade input from user
		
		//Ask user for the grade weight
		System.out.println("Input the second grade weight: ");
		w2 = in.nextDouble(); //Get the grade weight input from user
		
		//Ask user for the grade
		System.out.println("Input the third grade: ");
		g3 = in.nextDouble(); //Get the grade input from user
		
		//Ask user for the grade weight
		System.out.println("Input the third grade weight: ");
		w3 = in.nextDouble(); //Get the grade weight input from user
		
		//Ask user for the grade
		System.out.println("Input the fourth grade: ");
		g4 = in.nextDouble(); //Get the grade input from user
		
		//Ask user for the grade weight
		System.out.println("Input the fourth grade weight: ");
		w4 = in.nextDouble(); //Get the grade weight input from user
		
		//Calculate the final grade
		fg = ((g1*w1)+(g2*w2)+(g3*w3)+(g4*w4))/(w1+w2+w3+w4);
		
		//Output the final grade
		System.out.println("The course grade is: " + fg);
		
		//Close the scanner object
		in.close();
	}

}
