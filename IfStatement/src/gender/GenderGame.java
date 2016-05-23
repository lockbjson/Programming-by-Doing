package gender;

import java.util.Scanner;

public class GenderGame {

	private static String gender;
	private static String firstName;
	private static String lastName;
	private static int age;
	private static String married;
	private static String call;
	private static Scanner keyboard;

	public static void check() {
		if (gender.equalsIgnoreCase("F") && age > 20) {
			askMarried();
		}
		if (gender.equalsIgnoreCase("F") && age < 20) {
			call = firstName + " ";
		}
		if (gender.equalsIgnoreCase("M") && age > 20) {
			call = "Mr. ";
		} else if (gender.equalsIgnoreCase("M") && age < 20) {
			call = firstName + " ";
		}
	}

	public static void askMarried() {
		System.out.print("Are you married, " + firstName + " (y or n)? ");
		married = keyboard.next();
		if (married.equalsIgnoreCase("y")) {
			call = "Mrs. ";
		} else if (married.equalsIgnoreCase("n")) {
			call = "Ms. ";
		}
	}

	public static void main(String[] args) {
		keyboard = new Scanner(System.in);
		System.out.print("What is your gender (M or F): ");
		gender = keyboard.next();

		System.out.print("First name: ");
		firstName = keyboard.next();

		System.out.print("Last name: ");
		lastName = keyboard.next();

		System.out.print("Age: ");
		age = keyboard.nextInt();

		check();

		System.out.println("Then I shall call you " + call + lastName);
	}
}
