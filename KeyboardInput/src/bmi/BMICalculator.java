package bmi;

import java.util.Scanner;

public class BMICalculator {
	public static void main(String[] args) {
		double height;
		int weight;
		double bmi;

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Your height in m: ");
		height = keyboard.nextDouble();

		System.out.print("Your weight in kg: ");
		weight = keyboard.nextInt();

		bmi = weight / (height * height);

		System.out.println("Your BMI is " + (double)Math.round(bmi * 100000)/100000);
	}

}
