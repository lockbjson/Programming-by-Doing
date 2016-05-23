package fancy.display;

import java.util.Scanner;

public class FancyDisplayRows {
	private static String symbols = "";
	private static String choose;
	private static String player1, player2;
	private static int pile = 1;
	private static int counta = 3;
	private static int countb = 4;
	private static int countc = 5;
	private static int num;

	public static void checkA() {
		if (counta == 0) {
			symbols = "";
			System.out.println("A: " + symbols);
		}
		if (counta == 1) {
			symbols = "*";
			System.out.println("A: " + symbols);
		}
		if (counta == 2) {
			symbols = "**";
			System.out.println("A: " + symbols);
		}
		if (counta == 3) {
			symbols = "***";
			System.out.println("A: " + symbols);
		}
	}

	public static void checkB() {
		if (countb == 0) {
			symbols = "";
			System.out.println("B: " + symbols);
		}
		if (countb == 1) {
			symbols = "*";
			System.out.println("B: " + symbols);
		}
		if (countb == 2) {
			symbols = "**";
			System.out.println("B: " + symbols);
		}
		if (countb == 3) {
			symbols = "***";
			System.out.println("B: " + symbols);
		}
		if (countb == 4) {
			symbols = "****";
			System.out.println("B: " + symbols);
		}
	}

	public static void checkC() {
		if (countc == 0) {
			symbols = "";
			System.out.println("C: " + symbols);
		}
		if (countc == 1) {
			symbols = "*";
			System.out.println("C: " + symbols);
		}
		if (countc == 2) {
			symbols = "**";
			System.out.println("C: " + symbols);
		}
		if (countc == 3) {
			symbols = "***";
			System.out.println("C: " + symbols);
		}
		if (countc == 4) {
			symbols = "****";
			System.out.println("C: " + symbols);
		}
		if (countc == 5) {
			symbols = "*****";
			System.out.println("C: " + symbols);
		}
	}

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Player 1, enter your name: ");
		player1 = keyboard.next();
		System.out.print("Player 1, enter your name: ");
		player2 = keyboard.next();
		System.out.println();

		checkA();
		checkB();
		checkC();
		System.out.println();
		while (pile != 0) {
			if (pile == 1) {
				System.out.print(player1 + ", choose a pile: ");
				choose = keyboard.next();
				if (choose.equals("A")) {
					System.out.print("How many to remove from pile " + choose + ": ");
					num = keyboard.nextInt();
					System.out.println();
					counta = counta - num;
					checkA();
					checkB();
					checkC();
					System.out.println();
					pile = 2;
				}
				if (choose.equals("B")) {
					System.out.print("How many to remove from pile " + choose + ": ");
					num = keyboard.nextInt();
					System.out.println();
					countb = countb - num;
					checkA();
					checkB();
					checkC();
					System.out.println();
					pile = 2;
				}
				if (choose.equals("C")) {
					System.out.print("How many to remove from pile " + choose + ": ");
					num = keyboard.nextInt();
					System.out.println();
					countc = countc - num;
					checkA();
					checkB();
					checkC();
					System.out.println();
					pile = 2;
				}
				if (counta == 0 && countb == 0 && countc == 0) {
					checkA();
					checkB();
					checkC();
					System.out.println();
					System.out.println(player2 + ", there are no counters left, so you WIN!");
					pile = 0;
				}
				if (counta == 1 && countb == 0 && countc == 0) {
					checkA();
					checkB();
					checkC();
					System.out.println();
					System.out.print(player2 + ", you must take the last remaining counter, so ");
					System.out.println("you lose. " + player1 + " wins!");
					pile = 0;
				} else if (counta == 0 && countb == 1 && countc == 0) {
					checkA();
					checkB();
					checkC();
					System.out.println();
					System.out.print(player2 + ", you must take the last remaining counter, so ");
					System.out.println("you lose. " + player1 + " wins!");
					pile = 0;
				} else if (counta == 0 && countb == 0 && countc == 1) {
					checkA();
					checkB();
					checkC();
					System.out.println();
					System.out.print(player2 + ", you must take the last remaining counter, so ");
					System.out.println("you lose. " + player1 + " wins!");
					pile = 0;
				}
			}
			if (pile == 2) {
				System.out.print(player2 + ", choose a pile: ");
				choose = keyboard.next();
				if (choose.equals("A")) {
					System.out.print("How many to remove from pile " + choose + ": ");
					num = keyboard.nextInt();
					System.out.println();
					counta = counta - num;
					checkA();
					checkB();
					checkC();
					System.out.println();
					pile = 1;
				}
				if (choose.equals("B")) {
					System.out.print("How many to remove from pile " + choose + ": ");
					num = keyboard.nextInt();
					System.out.println();
					countb = countb - num;
					checkA();
					checkB();
					checkC();
					System.out.println();
					pile = 1;
				}
				if (choose.equals("C")) {
					System.out.print("How many to remove from pile " + choose + ": ");
					num = keyboard.nextInt();
					System.out.println();
					countc = countc - num;
					checkA();
					checkB();
					checkC();
					System.out.println();
					pile = 1;
				}
				if (counta == 0 && countb == 0 && countc == 0) {
					checkA();
					checkB();
					checkC();
					System.out.println();
					System.out.println(player1 + ", there are no counters left, so you WIN!");
					pile = 0;
				}
				if (counta == 1 && countb == 0 && countc == 0) {
					checkA();
					checkB();
					checkC();
					System.out.println();
					System.out.print(player1 + ", you must take the last remaining counter, so ");
					System.out.println("you lose. " + player2 + " wins!");
					pile = 0;
				} else if (counta == 0 && countb == 1 && countc == 0) {
					checkA();
					checkB();
					checkC();
					System.out.println();
					System.out.print(player1 + ", you must take the last remaining counter, so ");
					System.out.println("you lose. " + player2 + " wins!");
					pile = 0;
				} else if (counta == 0 && countb == 0 && countc == 1) {
					checkA();
					checkB();
					checkC();
					System.out.println();
					System.out.print(player1 + ", you must take the last remaining counter, so ");
					System.out.println("you lose. " + player2 + " wins!");
					pile = 0;
				}
			}
		}
	}

}
