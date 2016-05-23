package howold;

import java.util.Scanner;

public class HowOldSpecifically {
	private static int age;
	private static String name;

	public static String howOld() {
		String result = "";
		if (age < 16) {
			System.out.print("You can't drive");
		} else if (age >= 16 && age <= 17) {
			System.out.print("You can drive but you can't vote");
		} else if (age >= 18 && age <= 24) {
			System.out.print("You can vote but not rent a car");
		} else {
			System.out.print("You can do pretty much anything");
		}
		return result;
	}

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Hey, what's your name? (Sorry, I keep forgetting.) ");
		name = keyboard.next();

		System.out.print("Ok, " + name + ", how old are you? ");
		age = keyboard.nextInt();

		System.out.print(HowOldSpecifically.howOld() + ", " + name);

	}

}
