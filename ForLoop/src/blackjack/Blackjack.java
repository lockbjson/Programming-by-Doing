package blackjack;

import java.util.Random;
import java.util.Scanner;

public class Blackjack {

	public static void main(String[] args) {
		int user_total = 0;
		int dealer_total;
		int turn = 1;
		String ask;

		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		System.out.println("Welcome to Mitchell's blackjack program!");

		int card1 = 2 + r.nextInt(10);
		int card2 = 2 + r.nextInt(10);
		int card3 = 2 + r.nextInt(10);
		int card4 = 2 + r.nextInt(10);

		// User
		System.out.println("You get a " + card1 + " and a " + card2 + ".");
		// The total cards of user
		user_total = card1 + card2;
		System.out.println("Your total is " + user_total + ".\n");

		// The dealer
		System.out.println("The dealer has a " + card3 + " showing, and a hidden card.");
		System.out.println("His total is hidden, too.\n");
		dealer_total = card3 + card4;

		while (turn != 0) {
			if (turn == 1) {
				// Hit or Stay
				System.out.print("Would you like to \"hit\" or \"stay\"? ");
				ask = keyboard.next();
				if (ask.equals("hit")) {
					int drewCard = 2 + r.nextInt(10);
					System.out.println("You drew a " + drewCard + ".");
					user_total = user_total + drewCard;
					System.out.println("Your total is " + user_total + ".\n");
					if (user_total > 21) {
						System.out.println("THE DEALER WINS!");
						turn = 0;
					}
				}
				if (ask.equals("stay")) {
					System.out.println();
					turn = 2;
				}
			}
			if (turn == 2) {
				System.out.println("Okay, dealer's turn.");
				System.out.println("His hidden card was a " + card4 + ".");
				System.out.println("His total was " + dealer_total + ".\n");
				while (turn != 0) {
					if (dealer_total <= 16) {
						System.out.println("Dealer chooses to hit.");
						int drewCard = 2 + r.nextInt(10);
						System.out.println("He draws a " + drewCard + ".");
						dealer_total = dealer_total + drewCard;
						System.out.println("His total is " + dealer_total + ".\n");
						if (dealer_total > 21) {
							System.out.println("YOU WIN!");
							turn = 0;
						}
					} else {
						System.out.println("Dealer stays.\n");
						System.out.println("Dealer total is " + dealer_total + ".");
						System.out.println("Your total is " + user_total + ".\n");
						if (user_total > dealer_total) {
							System.out.println("YOU WIN!");
						} else if (user_total == dealer_total) {
							System.out.println("NO ONE WINS!");
						} else {
							System.out.println("THE DEALER WINS!");
						}
						turn = 0;
					}
				}
			}
		}
	}
}
