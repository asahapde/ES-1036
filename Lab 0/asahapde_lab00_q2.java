/* A program that calculates the distance between two coordinates
 * Author: Abdullah Sahapdeen
 * Date: 9/27/2018
 * Section: 004-3C2415
 */
package asahapde_lab00; 

public class asahapde_lab00_q2 {
	//The main method
	public static void main(String[] args) {
		//Declare double variables
		double x1 = 1, y1 = 2, x2 = 4, y2 = 7, side1 = 0, side2 = 0, distance = 0;

		side1 = x2 - x1; //Compute the first side length of the triangle
		side2 = y2 - y1; //Compute the second side length of the triangle
		
		//Compute the distance between points
		distance = Math.sqrt(side1 * side1 + Math.pow(side2, 2.0));

		//Output the result to the user
		System.out.println(" The distance between points (" 
		+ Double.toString(x1) + "," + Double.toString(y1)
				+ ") and (" + Double.toString(x2) +
				"," + Double.toString(y2) + ") is " +
				Double.toString(distance));

	}

}
