package numberguess;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();

		int guess, tries = 0;
		int num = 1 + r.nextInt(10);
		System.out.println(num);
		System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
		do {
			System.out.print("Your guess: ");
			guess = keyboard.nextInt();
			tries++;
			if (guess == num) {
				System.out.println("That's right. You're a good guesser.");
				System.out.println("It only took you " + tries + " tries.");
			} else {
				System.out.println("That is incorrect. Guess again.");
			}
		} while (guess != num);
	}

}
