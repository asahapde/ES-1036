package asahapde_lab06;

import java.util.Scanner;

public class asahapde_lab06_q2 {
	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		double[] grade;
		double[] gradeWeight;
		double finalGrade = 0;
		double sumWeight = 0;
		int num;

		System.out.println("How many assignments would you like to compute? ");
		num = in.nextInt();

		grade = new double[num];
		gradeWeight = new double[num];

		for (int i = 0; i < grade.length; i++) {
			System.out.println("Input grade " + (i + 1) + "(0-100):");
			grade[i] = getValidatedDouble(0, 100);

			System.out.println("Input the grade " + (i + 1) + " weight (0.0-1.0):");
			gradeWeight[i] = getValidatedDouble(0.0, 1.0);

			sumWeight += gradeWeight[i];

			finalGrade += (grade[i] * gradeWeight[i]);
		}

		if (sumWeight != 1.0) {
			finalGrade = 0;
			sumWeight = 0;
			System.out.println("The entered weights does not add to 1.0. Please enter the weights: ");
		}

		while (sumWeight != 1.0) {
			for (int i = 0; i < grade.length; i++) {
				System.out.println("Input the grade " + (i + 1) + " weight (0.0-1.0):");
				gradeWeight[i] = getValidatedDouble(0.0, 1.0);

				sumWeight += gradeWeight[i];
				finalGrade += (grade[i] * gradeWeight[i]);
			}

			if (sumWeight != 1.0) {
				sumWeight = 0;
				System.out.println("The entered weights does not add to 1.0. Please enter the weights: ");
			}
		}

		System.out.println("The course grade is: " + finalGrade);
		System.out.println("The max grade is: " + max(grade));
		System.out.println("The min grade is: " + min(grade));
		System.out.println("The variance is: " + var(grade));

	}

	private static double max(double[] array) {
		double result = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > result) {
				result = array[i];
			}
		}

		return result;

	}
	
	private static double min(double[] array) {
		double result = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < result) {
				result = array[i];
			}
		}

		return result;

	}
	
	private static double var (double[] array) {
		double mean = 0;
		double sum = 0;
		double N = array.length;
		double var = 0;
		
		for(int i = 0; i < N; i ++) {
			sum += array[i];
		}
		mean = sum/N;
		
		for(int i = 0; i < N; i ++) {
			var += Math.pow((array[i] - mean),2);
		}
		
		return var/(N);
		
	}

	private static double getValidatedDouble(double minValue, double maxValue) {
		String inputString;
		double input = 0;

		do {
			inputString = in.next();

			try {
				input = Double.parseDouble(inputString);
				if (input < minValue || input > maxValue) {
					System.out.println("Incorrect range! Please enter again: ");
					continue;
				}
				break;
			} catch (Exception e) {
				System.out.println("Incorrect format! Please enter again: ");
			}

		} while (true);

		return input;
	}

}
