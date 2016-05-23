package nim;

import java.util.Scanner;

public class Nim {

	public static void main(String[] args) {

		String player1;
		String player2;
		String choose;
		int num;
		int counta = 3;
		int countb = 4;
		int countc = 5;
		int pile = 1;

		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Player 1, enter your name: ");
		player1 = keyboard.next();
		System.out.print("Player 2, enter your name: ");
		player2 = keyboard.next();
		System.out.println();
		while (pile != 0) {
			if (pile == 1) {
				System.out.println("A: " + counta + "\t" + "B: " + countb + "\t" + "C: " + countc);
				System.out.println();
				System.out.print(player1 + ", choose a pile: ");
				choose = keyboard.next();
				System.out.println();
				if (choose.equals("A") && counta == 0) {
					System.out.print("Nice try, " + player1 + ". That pile is empty. Choose again: ");
					choose = keyboard.next();
					while (!choose.equals("B")) {
						System.out.print("Nice try, " + player1 + ". That pile is empty. Choose again: ");
						choose = keyboard.next();
					}
				}
				if (choose.equals("B") && countb == 0) {
					System.out.print("Nice try, " + player1 + ". That pile is empty. Choose again: ");
					choose = keyboard.next();
					while (!choose.equals("C")) {
						System.out.print("Nice try, " + player1 + ". That pile is empty. Choose again: ");
						choose = keyboard.next();
					}
				}
				if (choose.equals("C") && countc == 0) {
					System.out.print("Nice try, " + player1 + ". That pile is empty. Choose again: ");
					choose = keyboard.next();
					while (!choose.equals("A")) {
						System.out.print("Nice try, " + player1 + ". That pile is empty. Choose again: ");
						choose = keyboard.next();
					}
				}
				if (choose.equals("A")) {
					System.out.print("How many to remove from pile " + choose + ": ");
					num = keyboard.nextInt();
					if (num <= 0) {
						System.out.print("You must choose at least 1. How many? ");
						num = keyboard.nextInt();
					}
					System.out.println();
					if (num > counta) {
						System.out.print("Pile " + choose + " doesn't have that many. Try again: ");
						num = keyboard.nextInt();
					}
					counta = counta - num;
					pile = 2;
				} else if (choose.equals("B")) {
					System.out.print("How many to remove from pile " + choose + ": ");
					num = keyboard.nextInt();
					if (num <= 0) {
						System.out.print("You must choose at least 1. How many? ");
						num = keyboard.nextInt();
					}
					System.out.println();
					if (num > countb) {
						System.out.print("Pile " + choose + " doesn't have that many. Try again: ");
						num = keyboard.nextInt();
					}
					countb = countb - num;
					pile = 2;
				} else if (choose.equals("C")) {
					System.out.print("How many to remove from pile " + choose + ": ");
					num = keyboard.nextInt();
					if (num <= 0) {
						System.out.print("You must choose at least 1. How many? ");
						num = keyboard.nextInt();
					}
					System.out.println();
					if (num > countc) {
						System.out.print("Pile " + choose + " doesn't have that many. Try again: ");
						num = keyboard.nextInt();
					}
					countc = countc - num;
					pile = 2;
				} else {
					System.out.println(choose + " wasn't one of the options. Try again.");
				}
				if (counta == 0 && countb == 0 && countc == 0) {
					System.out.println("A: " + counta + "\t" + "B: " + countb + "\t" + "C: " + countc);
					System.out.println();
					System.out.println(player2 + ", there are no counters left, so you WIN!");
					pile = 0;
				}
				if (counta == 1 && countb == 0 && countc == 0) {
					System.out.println("A: " + counta + "\t" + "B: " + countb + "\t" + "C: " + countc);
					System.out.println();
					System.out.print(player2 + ", you must take the last remaining counter, so ");
					System.out.println("you lose. " + player1 + " wins!");
					pile = 0;
				} else if (counta == 0 && countb == 1 && countc == 0) {
					System.out.println("A: " + counta + "\t" + "B: " + countb + "\t" + "C: " + countc);
					System.out.println();
					System.out.print(player2 + ", you must take the last remaining counter, so ");
					System.out.println("you lose. " + player1 + " wins!");
					pile = 0;
				} else if (counta == 0 && countb == 0 && countc == 1) {
					System.out.println("A: " + counta + "\t" + "B: " + countb + "\t" + "C: " + countc);
					System.out.println();
					System.out.print(player2 + ", you must take the last remaining counter, so ");
					System.out.println("you lose. " + player1 + " wins!");
					pile = 0;
				}
			}
			if (pile == 2) {
				System.out.println("A: " + counta + "\t" + "B: " + countb + "\t" + "C: " + countc);
				System.out.println();
				System.out.print(player2 + ", choose a pile: ");
				choose = keyboard.next();
				System.out.println();
				if (choose.equals("A") && counta == 0) {
					System.out.print("Nice try, " + player2 + ". That pile is empty. Choose again: ");
					choose = keyboard.next();
					while (!choose.equals("B")) {
						System.out.print("Nice try, " + player1 + ". That pile is empty. Choose again: ");
						choose = keyboard.next();
					}
				}
				if (choose.equals("B") && countb == 0) {
					System.out.print("Nice try, " + player2 + ". That pile is empty. Choose again: ");
					choose = keyboard.next();
					while (!choose.equals("C")) {
						System.out.print("Nice try, " + player2 + ". That pile is empty. Choose again: ");
						choose = keyboard.next();
					}
				}
				if (choose.equals("C") && countc == 0) {
					System.out.print("Nice try, " + player2 + ". That pile is empty. Choose again: ");
					choose = keyboard.next();
					while (!choose.equals("A")) {
						System.out.print("Nice try, " + player2 + ". That pile is empty. Choose again: ");
						choose = keyboard.next();
					}
				}
				if (choose.equals("A")) {
					System.out.print("How many to remove from pile " + choose + ": ");
					num = keyboard.nextInt();
					if (num <= 0) {
						System.out.print("You must choose at least 1. How many? ");
						num = keyboard.nextInt();
					}
					System.out.println();
					if (num > counta) {
						System.out.print("Pile " + choose + " doesn't have that many. Try again: ");
						num = keyboard.nextInt();
					}
					counta = counta - num;
					pile = 1;
				} else if (choose.equals("B")) {
					System.out.print("How many to remove from pile " + choose + ": ");
					num = keyboard.nextInt();
					if (num <= 0) {
						System.out.print("You must choose at least 1. How many? ");
						num = keyboard.nextInt();
					}
					System.out.println();
					if (num > countb) {
						System.out.print("Pile " + choose + " doesn't have that many. Try again: ");
						num = keyboard.nextInt();
					}
					countb = countb - num;
					pile = 1;
				} else if (choose.equals("C")) {
					System.out.print("How many to remove from pile " + choose + ": ");
					num = keyboard.nextInt();
					if (num <= 0) {
						System.out.print("You must choose at least 1. How many? ");
						num = keyboard.nextInt();
					}
					System.out.println();
					if (num > countc) {
						System.out.print("Pile " + choose + " doesn't have that many. Try again: ");
						num = keyboard.nextInt();
					}
					countc = countc - num;
					pile = 1;
				} else {
					System.out.println(choose + " wasn't one of the options. Try again.");
				}
				if (counta == 0 && countb == 0 && countc == 0) {
					System.out.println("A: " + counta + "\t" + "B: " + countb + "\t" + "C: " + countc);
					System.out.println();
					System.out.println(player1 + ", there are no counters left, so you WIN!");
					pile = 0;
				}
				if (counta == 1 && countb == 0 && countc == 0) {
					System.out.println("A: " + counta + "\t" + "B: " + countb + "\t" + "C: " + countc);
					System.out.println();
					System.out.print(player1 + ", you must take the last remaining counter, so ");
					System.out.println("you lose. " + player2 + " wins!");
					pile = 0;
				} else if (counta == 0 && countb == 1 && countc == 0) {
					System.out.println("A: " + counta + "\t" + "B: " + countb + "\t" + "C: " + countc);
					System.out.println();
					System.out.print(player1 + ", you must take the last remaining counter, so ");
					System.out.println("you lose. " + player2 + " wins!");
					pile = 0;
				} else if (counta == 0 && countb == 0 && countc == 1) {
					System.out.println("A: " + counta + "\t" + "B: " + countb + "\t" + "C: " + countc);
					System.out.println();
					System.out.print(player1 + ", you must take the last remaining counter, so ");
					System.out.println("you lose. " + player2 + " wins!");
					pile = 0;
				}
			}
		}
	}
}
