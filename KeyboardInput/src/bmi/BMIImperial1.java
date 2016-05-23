package bmi;

import java.util.Scanner;

public class BMIImperial1 {
	public static void main(String[] args) {
		final double inchsToMeters = 0.0254;
		final double poundsToKg = 0.453592;
		final double feetToMeters = 0.3048;

		int height1, height2, weight;
		double bmi;

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Your height (feet only): ");
		height1 = keyboard.nextInt();

		System.out.print("Your height (inches): ");
		height2 = keyboard.nextInt();

		System.out.print("Your weight in pounds: ");
		weight = keyboard.nextInt();

		bmi = (weight * poundsToKg) / Math.pow((height1 * feetToMeters + height2 * inchsToMeters), 2);

		System.out.println("Your BMI is " + (double) Math.round(bmi * 1000000) / 1000000);
	}

}
