package threecard;

import java.util.Random;
import java.util.Scanner;

public class ThreeCardMonte {
	private static int guess;
	private static String card1 = "##";
	private static String card2 = "##";
	private static String card3 = "##";

	public static void check() {
		Random r = new Random();

		int number = 1 + r.nextInt(3);

		if (guess == number) {
			System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
			System.out.println();
			if (number == 1) {
				card1 = "AA";
				System.out.println(card1 + "  " + card2 + "  " + card3);
				System.out.println(card1 + "  " + card2 + "  " + card3);
				System.out.println("1 " + "  " + "2 " + "  " + "3 ");
			} else if (number == 2) {
				card2 = "AA";
				System.out.println(card1 + "  " + card2 + "  " + card3);
				System.out.println(card1 + "  " + card2 + "  " + card3);
				System.out.println("1 " + "  " + "2 " + "  " + "3 ");
			} else if (number == 3) {
				card3 = "AA";
				System.out.println(card1 + "  " + card2 + "  " + card3);
				System.out.println(card1 + "  " + card2 + "  " + card3);
				System.out.println("1 " + "  " + "2 " + "  " + "3 ");
			}
		} else {
			System.out.println("Ha! Fast Eddie wins again! The ace was card number " + number);
			System.out.println();
			if (number == 1) {
				card1 = "AA";
				System.out.println(card1 + "  " + card2 + "  " + card3);
				System.out.println(card1 + "  " + card2 + "  " + card3);
				System.out.println("1 " + "  " + "2 " + "  " + "3 ");
			} else if (number == 2) {
				card2 = "AA";
				System.out.println(card1 + "  " + card2 + "  " + card3);
				System.out.println(card1 + "  " + card2 + "  " + card3);
				System.out.println("1 " + "  " + "2 " + "  " + "3 ");
			} else if (number == 3) {
				card3 = "AA";
				System.out.println(card1 + "  " + card2 + "  " + card3);
				System.out.println(card1 + "  " + card2 + "  " + card3);
				System.out.println("1 " + "  " + "2 " + "  " + "3 ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println(
				"You slide up to Fast Eddie's card table and plop down your cash. \nHe glances at you out of the corner of his eye and starts shuffling. \nHe lays down three cards.");
		System.out.println(card1 + "  " + card2 + "  " + card3);
		System.out.println(card1 + "  " + card2 + "  " + card3);
		System.out.println("1 " + "  " + "2 " + "  " + "3 ");
		System.out.println();
		System.out.print("> ");
		guess = keyboard.nextInt();
		System.out.println();
		check();
	}
}
