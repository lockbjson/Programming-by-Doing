package guessinggame;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
	private static int guess;

	public static void check() {

		Random r = new Random();
		int choice = 1 + r.nextInt(10);

		if (guess == choice) {
			System.out.println("That's right! My secret number was " + choice + "!");
		} else {
			System.out.println("Sorry, but I was really thinking of " + choice + ".");
		}
	}

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.println("I'm thinking of a number from 1 to 10.");
		System.out.print("Your guess: ");
		guess = keyboard.nextInt();
		check();

	}
}
