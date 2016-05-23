package twentyquestion;

import java.util.Scanner;

public class TwentyQuestion {
	private static String type;
	private static String size;
	private static String result;

	public static void check() {
		if (type.equalsIgnoreCase("animal")) {
			if (size.equalsIgnoreCase("no")) {
				result = "squirrel";
			} else if (size.equalsIgnoreCase("yes")) {
				result = "moose";
			}
		} else if (type.equalsIgnoreCase("vegetable")) {
			if (size.equalsIgnoreCase("no")) {
				result = "carrot";
			} else if (size.equalsIgnoreCase("yes")) {
				result = "watermelon";
			}
		} else if (type.equalsIgnoreCase("mineral")) {
			if (size.equalsIgnoreCase("no")) {
				result = "paper clip";
			} else if (size.equalsIgnoreCase("yes")) {
				result = "Camaro";
			}
		}
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("TWO QUESTIONS!");
		System.out.println("Think of an object, and I'll try to guess it.");

		System.out.println("Question 1) Is it animal, vegetable, or mineral? ");
		System.out.print("> ");
		type = keyboard.next();

		System.out.println("Question 2) Is it bigger than a breadbox? ");
		System.out.print("> ");
		size = keyboard.next();

		TwentyQuestion.check();

		System.out.println("My guess is that you are thinking of a " + result);
		System.out.println("I would ask you if I'm right, but I don't actually care.");
	}
}
