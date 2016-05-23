package numberguessing;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
	private static Scanner keyboard;
	private static int tries = 0;

	public static void check() {
		keyboard = new Scanner(System.in);
		System.out.println("I have chosen a number between 1 and 10. Try to guess it.");

		Random r = new Random();
		int num = 1 + r.nextInt(10);
		System.out.println(num);

		System.out.print("Your guess: ");
		int guess = keyboard.nextInt();
		tries++;
		while (guess != num) {
			System.out.println("That is incorrect. Guess again.");
			System.out.print("Your guess: ");
			guess = keyboard.nextInt();
			tries++;
		}
		System.out.println("That's right! You're a good guesser.");
		System.out.println("It only took you " + tries + " tries.");
	}

	public static void main(String[] args) {
		check();
	}
}
