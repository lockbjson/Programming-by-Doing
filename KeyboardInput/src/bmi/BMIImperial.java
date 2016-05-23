package bmi;

import java.util.Scanner;

public class BMIImperial {
	public static void main(String[] args) {
		final double inchsToMeters = 0.0254;
		final double poundsToKg = 0.453592;
		int height;
		int weight;
		double bmi;
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Your height in inches: ");
		height = keyboard.nextInt();

		System.out.print("Your weight in pounds: ");
		weight = keyboard.nextInt();

		bmi = (weight * poundsToKg) / Math.pow((height * inchsToMeters), 2);
		
		System.out.println("Your BMI is " + (double)Math.round(bmi*1000000)/1000000);

	}

}
