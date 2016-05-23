package oneshot;

import java.util.Random;
import java.util.Scanner;

public class OneShotHiLo {
	private static int guess;
	private static String msg;

	public static void check() {
		Random r = new Random();

		int number = 1 + r.nextInt(100);

		if (guess < number) {
			msg = "Sorry, you are too low. I was thinking of " + number;
		} else if (guess > number) {
			msg = "Sorry, you are too high. I was thinking of " + number;
		} else if (guess == number) {
			msg = "You guessed it! What are the odds?!";
		}
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("I'm thinking of a number between 1-100. Try to guess it.");
		guess = keyboard.nextInt();
		check();
		System.out.println(msg);
	}
}
