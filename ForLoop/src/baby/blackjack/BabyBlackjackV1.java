package baby.blackjack;

import java.util.Random;

public class BabyBlackjackV1 {
	public static void main(String[] args) {
		Random r = new Random();

		int total1 = 0, total2 = 0;

		System.out.println("Baby Blackjack!");
		for (int i = 1; i <= 1; i++) {
			int num1 = 1 + r.nextInt(10);
			int num2 = 1 + r.nextInt(10);
			total1 = num1 + num2;
			System.out.println("\nYou drew " + num1 + " and " + num2 + ".");
			System.out.println("Your total is " + total1 + ".");
		}
		for (int i = 1; i <= 1; i++) {
			int num1 = 1 + r.nextInt(10);
			int num2 = 1 + r.nextInt(10);
			total2 = num1 + num2;
			System.out.println("\nThe dealer has " + num1 + " and " + num2 + ".");
			System.out.println("Dealer's total is " + total2 + ".");
		}
		if (total1 > total2) {
			System.out.println("\nYOU WIN!");
		} else {
			System.out.println("\nTHE DEALER WIN!");
		}
	}
}
