package guessinggame;

import java.util.Scanner;

public class GuessingGame {
	private static int guess;
	private static int number = 7;

	public static void check() {
		if (guess == number) {
			System.out.println("LOL!!! U GOT IT! I CANT BELEIVE U GESSED IT WAS " + number);
		} else {
			System.out.println("WOOT! U SUXOR!!! I PWN JOO!!! IT WAS " + number);
		}
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("TEH WORST NUMBER GESSING GAME EVAR!!!!!!");
		System.out.print("I'M THKING OF A NBR FROM 1-10. TRY 2 GESS! ");
		guess = keyboard.nextInt();
		check();
	}

}
