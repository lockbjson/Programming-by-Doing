package howold;

import java.util.Scanner;

public class AgeMessage3 {
	private static String name;
	private static int age;

	public static void check() {
		if (age < 16) {
			System.out.println("You can't drive, " + name);
		}
		if (age >= 16 && age <= 17) {
			System.out.println("You can drive but not vote, " + name);
		}
		if (age >= 18 && age <= 24) {
			System.out.println("You can vote but not rent a car, " + name);
		}
		if (age >= 25) {
			System.out.println("You can do pretty much anything, " + name);
		}
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Your name: ");
		name = keyboard.next();
		System.out.print("Your age: ");
		age = keyboard.nextInt();
		AgeMessage3.check();
	}

}
