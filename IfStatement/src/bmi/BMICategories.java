package bmi;

import java.util.Scanner;

public class BMICategories {
	private static double height;
	private static int weight;
	private static double bmi;
	private static String category;
	private static double inchsToMeters = 0.0254;
	private static double poundsToKG = 0.453592;

	public static void check() {
		if (bmi < 18.5) {
			category = "underweight";
		}
		if (bmi >= 18.5 && bmi < 24.9) {
			category = "normal weight";
		}
		if (bmi >= 25.0 && bmi < 29.9) {
			category = "overweight";
		}
		if (bmi >= 30.0) {
			category = "obese";
		}
	}

	public static void calculator() {
		// bmi = weight / (height * height);
		bmi = (weight * 0.453592) / Math.pow(inchsToMeters * height, 2);
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Your height in m: ");
		height = keyboard.nextDouble();

		System.out.print("Your weight in kg: ");
		weight = keyboard.nextInt();

		System.out.println();
		calculator();
		System.out.println("Your BMI is " + (double) Math.round(bmi * 10) / 10);
		check();
		System.out.println("BMI Category: " + category);

	}

}
