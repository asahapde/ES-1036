package asahapde_lab06;

import java.util.Scanner;

public class asahapde_lab06_q1 {

	public static void main(String[] args) {
		//ConsoleInput.getValidatedInteger(-10, 10);
		//ConsoleInput.getValidatedDouble(-50.0, 50.0);
		//ConsoleInput.getValidatedDouble(-1e6, 1);
		//ConsoleInput.getValidatedChar('b', 'g');
		ConsoleInput.getValidatedCharWrap('x', 'b');
		ConsoleInput.in.close();
	}

	static class ConsoleInput {
		private static Scanner in = new Scanner(System.in);

		public static int getValidatedInteger(int minValue, int maxValue) {
			String inputString;
			int input = 0;

			do {
				System.out.println("Please enter an integer between " + minValue + " and " + maxValue + " inclusive: ");
				inputString = in.next();

				try {
					input = Integer.parseInt(inputString);
					if (input < minValue || input > maxValue) {
						System.out.println("Incorrect range!");
					}
				} catch (Exception e) {
					System.out.println("Incorrect format!");
				}
			} while (input < minValue || input > maxValue);

			return input;
		}

		public static double getValidatedDouble(double minValue, double maxValue) {
			String inputString;
			double input = 0;

			do {
				System.out.println("Please enter a double between " + minValue + " and " + maxValue + " inclusive: ");
				inputString = in.next();

				try {
					input = Double.parseDouble(inputString);
					if (input < minValue || input > maxValue) {
						System.out.println("Incorrect range!");
						continue;
					}
					break;
				} catch (Exception e) {
					System.out.println("Incorrect format!");
				}

			} while (true);

			return input;
		}

		public static char getValidatedChar(char minChar, char maxChar) {
			String inputString;
			char input;

			do {
				System.out.println("Please enter a character between " + minChar + " and " + maxChar + " inclusive: ");
				inputString = in.next();

				try {
					input = inputString.charAt(0);
					if ((int)input < (int) minChar || (int)input > (int) maxChar) {
						System.out.println("Incorrect range!");
						continue;
					}
					break;
				} catch (Exception e) {
					System.out.println("Incorrect format!");
				}

			} while (true);

			return input;

		}

// 97 - 122
		public static char getValidatedCharWrap(char minChar, char maxChar) {
			String inputString;
			char input;
			char temp = minChar;
			char temp2 = maxChar;
			minChar = (char) Math.min(temp,temp2);
			maxChar = (char) Math.max(temp, temp2);
			

			do {
				System.out.println(
						"Please enter a  wrapped character between " + temp + " and " + temp2 + " inclusive: ");
				inputString = in.next();

				try {
					input = inputString.charAt(0);
					if (((int) input > (int) minChar && (int) input < (int) maxChar) || (int) input < 97
							|| (int) input > 122) {
						System.out.println("Incorrect range!");
						continue;
					}
					break;
				} catch (Exception e) {
					System.out.println("Incorrect format!");
				}

			} while (true);

			return input;

		}

	}

}
