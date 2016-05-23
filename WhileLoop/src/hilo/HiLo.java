package hilo;

import java.util.Random;
import java.util.Scanner;

public class HiLo {
	private static int tries = 0;
	private static Scanner keyboard;
	private static int count = 1;
	private static int maxTries = 7;

	public static void check() {
		keyboard = new Scanner(System.in);
		System.out.println("I'm thinking of a number between 1-100. You have 7 guesses.");

		Random r = new Random();
		int num = 1 + r.nextInt(100);
		System.out.println(num);
		System.out.print("First guess: ");
		int guess = keyboard.nextInt();
		count += 1;
		tries++;
		while (guess != num && tries < maxTries) {
			if (guess < num) {
				System.out.println("Sorry, you are too low.");
			} else if (guess > num) {
				System.out.println("Sorry, that guess is too high.");
			}
			System.out.print("Guess # " + count++ + ": ");
			guess = keyboard.nextInt();
			tries++;
		}
		if (guess == num) {
			System.out.println("You guessed it! What are the odds?!?");
		} else if (tries >= maxTries) {
			System.out.println("Sorry, you didn't guess it in 7 tries. You lose.");
		}
	}

	public static void main(String[] args) {
		check();
	}

}
