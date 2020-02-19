/* Several overloaded print methods that will be called based on the data type of the argument passed.
 * Author: Abdullah Sahapdeen
 * Date: 11/15/2018
 * Section: 004-3C2415
 */
package asahapde_lab05;

public class asahapde_lab05_q1 {

	public static void main(String[] args) {
		print(3);
		print('f');
		print(4 > 3);
		print(9.81);
		print("great");

	}

	public static void print(char a) {
		System.out.println("The character is " + a);
	}

	public static void print(int b) {
		System.out.println("The integer is " + b);
	}

	public static void print(String c) {
		System.out.println("The string is " + c);
	}

	public static void print(double d) {
		System.out.println("The double is " + d);
	}

	public static void print(boolean e) {
		System.out.println("The boolean is " + e);
	}

}
