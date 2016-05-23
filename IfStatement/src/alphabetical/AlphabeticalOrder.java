package alphabetical;

import java.util.Scanner;

public class AlphabeticalOrder {
	private static String name;
	private static String result;

	public static void check() {
		if (name.compareTo("Carswell") == 0) {
			result = name;
			System.out.println("you don't have to wait long, " + name);
		} else if (name.compareTo("Jones") == 0) {
			result = name;
			System.out.println("that's not bad, " + name);
		} else if (name.compareTo("Smith") == 0) {
			result = name;
			System.out.println("looks like a bit of a wait, " + name);
		} else if (name.compareTo("Young") == 0) {
			result = name;
			System.out.println("it's gonna be a while, " + name);
		} else if ("Young".compareTo(name) == 0) {
			result = name;
			System.out.println("not going anywhere for a while?, " + name);
		}
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("What's your last name? ");
		name = keyboard.next();
		check();
	}
}
