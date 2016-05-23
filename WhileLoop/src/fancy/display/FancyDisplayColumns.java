package fancy.display;

import java.util.Scanner;

public class FancyDisplayColumns {
	private static String choose;
	private static String player1, player2;
	private static int pile = 1;
	private static int counta = 3;
	private static int countb = 4;
	private static int countc = 5;
	private static int num = 0;
	private static String r1_cA, r2_cA, r3_cA, r4_cA, r5_cA;
	private static String r1_cB, r2_cB, r3_cB, r4_cB, r5_cB;
	private static String r1_cC, r2_cC, r3_cC, r4_cC, r5_cC;

	public static void checkABC() {
		r1_cA = "  ";
		r2_cA = "  ";
		r3_cA = "* ";
		r4_cA = "* ";
		r5_cA = "* ";
		r1_cB = "  ";
		r2_cB = "* ";
		r3_cB = "* ";
		r4_cB = "* ";
		r5_cB = "* ";
		r1_cC = "* ";
		r2_cC = "* ";
		r3_cC = "* ";
		r4_cC = "* ";
		r5_cC = "* ";
		System.out.println(r1_cA + r1_cB + r1_cC);
		System.out.println(r2_cA + r2_cB + r2_cC);
		System.out.println(r3_cA + r3_cB + r3_cC);
		System.out.println(r4_cA + r4_cB + r4_cC);
		System.out.println(r5_cA + r5_cB + r5_cC);
		System.out.println("A" + " " + "B" + " " + "C");
	}

	public static void checkA() {
		if (counta == 0) {
			r1_cA = "  ";
			r2_cA = "  ";
			r3_cA = "  ";
			r4_cA = "  ";
			r5_cA = "  ";
			System.out.println(r1_cA + r1_cB + r1_cC);
			System.out.println(r2_cA + r2_cB + r2_cC);
			System.out.println(r3_cA + r3_cB + r3_cC);
			System.out.println(r4_cA + r4_cB + r4_cC);
			System.out.println(r5_cA + r5_cB + r5_cC);
			System.out.println("A" + " " + "B" + " " + "C");
		}
		if (counta == 1) {
			r1_cA = "  ";
			r2_cA = "  ";
			r3_cA = "  ";
			r4_cA = "  ";
			r5_cA = "* ";
			System.out.println(r1_cA + r1_cB + r1_cC);
			System.out.println(r2_cA + r2_cB + r2_cC);
			System.out.println(r3_cA + r3_cB + r3_cC);
			System.out.println(r4_cA + r4_cB + r4_cC);
			System.out.println(r5_cA + r5_cB + r5_cC);
			System.out.println("A" + " " + "B" + " " + "C");
		}
		if (counta == 2) {
			r1_cA = "  ";
			r2_cA = "  ";
			r3_cA = "  ";
			r4_cA = "* ";
			r5_cA = "* ";
			System.out.println(r1_cA + r1_cB + r1_cC);
			System.out.println(r2_cA + r2_cB + r2_cC);
			System.out.println(r3_cA + r3_cB + r3_cC);
			System.out.println(r4_cA + r4_cB + r4_cC);
			System.out.println(r5_cA + r5_cB + r5_cC);
			System.out.println("A" + " " + "B" + " " + "C");
		}
		if (counta == 3) {
			r1_cA = "  ";
			r2_cA = "  ";
			r3_cA = "* ";
			r4_cA = "* ";
			r5_cA = "* ";
			System.out.println(r1_cA + r1_cB + r1_cC);
			System.out.println(r2_cA + r2_cB + r2_cC);
			System.out.println(r3_cA + r3_cB + r3_cC);
			System.out.println(r4_cA + r4_cB + r4_cC);
			System.out.println(r5_cA + r5_cB + r5_cC);
			System.out.println("A" + " " + "B" + " " + "C");
		}
	}

	public static void checkB() {
		if (countb == 0) {
			r1_cB = "  ";
			r2_cB = "  ";
			r3_cB = "  ";
			r4_cB = "  ";
			r5_cB = "  ";
			System.out.println(r1_cA + r1_cB + r1_cC);
			System.out.println(r2_cA + r2_cB + r2_cC);
			System.out.println(r3_cA + r3_cB + r3_cC);
			System.out.println(r4_cA + r4_cB + r4_cC);
			System.out.println(r5_cA + r5_cB + r5_cC);
			System.out.println("A" + " " + "B" + " " + "C");
		}
		if (countb == 1) {
			r1_cB = "  ";
			r2_cB = "  ";
			r3_cB = "  ";
			r4_cB = "  ";
			r5_cB = "* ";
			System.out.println(r1_cA + r1_cB + r1_cC);
			System.out.println(r2_cA + r2_cB + r2_cC);
			System.out.println(r3_cA + r3_cB + r3_cC);
			System.out.println(r4_cA + r4_cB + r4_cC);
			System.out.println(r5_cA + r5_cB + r5_cC);
			System.out.println("A" + " " + "B" + " " + "C");
		}
		if (countb == 2) {
			r1_cB = "  ";
			r2_cB = "  ";
			r3_cB = "  ";
			r4_cB = "* ";
			r5_cB = "* ";
			System.out.println(r1_cA + r1_cB + r1_cC);
			System.out.println(r2_cA + r2_cB + r2_cC);
			System.out.println(r3_cA + r3_cB + r3_cC);
			System.out.println(r4_cA + r4_cB + r4_cC);
			System.out.println(r5_cA + r5_cB + r5_cC);
			System.out.println("A" + " " + "B" + " " + "C");
		}
		if (countb == 3) {
			r1_cB = "  ";
			r2_cB = "  ";
			r3_cB = "* ";
			r4_cB = "* ";
			r5_cB = "* ";
			System.out.println(r1_cA + r1_cB + r1_cC);
			System.out.println(r2_cA + r2_cB + r2_cC);
			System.out.println(r3_cA + r3_cB + r3_cC);
			System.out.println(r4_cA + r4_cB + r4_cC);
			System.out.println(r5_cA + r5_cB + r5_cC);
			System.out.println("A" + " " + "B" + " " + "C");
		}
		if (countb == 4) {
			r1_cB = "  ";
			r2_cB = "* ";
			r3_cB = "* ";
			r4_cB = "* ";
			r5_cB = "* ";
			System.out.println(r1_cA + r1_cB + r1_cC);
			System.out.println(r2_cA + r2_cB + r2_cC);
			System.out.println(r3_cA + r3_cB + r3_cC);
			System.out.println(r4_cA + r4_cB + r4_cC);
			System.out.println(r5_cA + r5_cB + r5_cC);
			System.out.println("A" + " " + "B" + " " + "C");
		}
	}

	public static void checkC() {
		if (countc == 0) {
			r1_cC = "  ";
			r2_cC = "  ";
			r3_cC = "  ";
			r4_cC = "  ";
			r5_cC = "  ";
			System.out.println(r1_cA + r1_cB + r1_cC);
			System.out.println(r2_cA + r2_cB + r2_cC);
			System.out.println(r3_cA + r3_cB + r3_cC);
			System.out.println(r4_cA + r4_cB + r4_cC);
			System.out.println(r5_cA + r5_cB + r5_cC);
			System.out.println("A" + " " + "B" + " " + "C");
		}
		if (countc == 1) {
			r1_cC = "  ";
			r2_cC = "  ";
			r3_cC = "  ";
			r4_cC = "  ";
			r5_cC = "* ";
			System.out.println(r1_cA + r1_cB + r1_cC);
			System.out.println(r2_cA + r2_cB + r2_cC);
			System.out.println(r3_cA + r3_cB + r3_cC);
			System.out.println(r4_cA + r4_cB + r4_cC);
			System.out.println(r5_cA + r5_cB + r5_cC);
			System.out.println("A" + " " + "B" + " " + "C");
		}
		if (countc == 2) {
			r1_cC = "  ";
			r2_cC = "  ";
			r3_cC = "  ";
			r4_cC = "* ";
			r5_cC = "* ";
			System.out.println(r1_cA + r1_cB + r1_cC);
			System.out.println(r2_cA + r2_cB + r2_cC);
			System.out.println(r3_cA + r3_cB + r3_cC);
			System.out.println(r4_cA + r4_cB + r4_cC);
			System.out.println(r5_cA + r5_cB + r5_cC);
			System.out.println("A" + " " + "B" + " " + "C");
		}
		if (countc == 3) {
			r1_cC = "  ";
			r2_cC = "  ";
			r3_cC = "* ";
			r4_cC = "* ";
			r5_cC = "* ";
			System.out.println(r1_cA + r1_cB + r1_cC);
			System.out.println(r2_cA + r2_cB + r2_cC);
			System.out.println(r3_cA + r3_cB + r3_cC);
			System.out.println(r4_cA + r4_cB + r4_cC);
			System.out.println(r5_cA + r5_cB + r5_cC);
			System.out.println("A" + " " + "B" + " " + "C");
		}
		if (countc == 4) {
			r1_cC = "  ";
			r2_cC = "* ";
			r3_cC = "* ";
			r4_cC = "* ";
			r5_cC = "* ";
			System.out.println(r1_cA + r1_cB + r1_cC);
			System.out.println(r2_cA + r2_cB + r2_cC);
			System.out.println(r3_cA + r3_cB + r3_cC);
			System.out.println(r4_cA + r4_cB + r4_cC);
			System.out.println(r5_cA + r5_cB + r5_cC);
			System.out.println("A" + " " + "B" + " " + "C");
		}
		if (countc == 5) {
			r1_cC = "* ";
			r2_cC = "* ";
			r3_cC = "* ";
			r4_cC = "* ";
			r5_cC = "* ";
			System.out.println(r1_cA + r1_cB + r1_cC);
			System.out.println(r2_cA + r2_cB + r2_cC);
			System.out.println(r3_cA + r3_cB + r3_cC);
			System.out.println(r4_cA + r4_cB + r4_cC);
			System.out.println(r5_cA + r5_cB + r5_cC);
			System.out.println("A" + " " + "B" + " " + "C");
		}
	}

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Player 1, enter your name: ");
		player1 = keyboard.next();
		System.out.print("Player 2, enter your name: ");
		player2 = keyboard.next();

		System.out.println();

		checkABC();
		while (pile != 0) {
			if (pile == 1) {
				System.out.println();
				System.out.print(player1 + ", choose a pile: ");
				choose = keyboard.next();
				if (choose.equals("A")) {
					System.out.print("How many to remove from pile " + choose + ": ");
					num = keyboard.nextInt();
					counta = counta - num;
					System.out.println();
					checkA();
					pile = 2;
				}
				if (choose.equals("B")) {
					System.out.print("How many to remove from pile " + choose + ": ");
					num = keyboard.nextInt();
					countb = countb - num;
					System.out.println();
					checkB();
					pile = 2;
				}
				if (choose.equals("C")) {
					System.out.print("How many to remove from pile " + choose + ": ");
					num = keyboard.nextInt();
					countc = countc - num;
					System.out.println();
					checkC();
					pile = 2;
				}
				if (counta == 0 && countb == 0 && countc == 0) {
					System.out.println();
					System.out.println(player2 + ", there are no counters left, so you WIN!");
					pile = 0;
				}
				if (counta == 1 && countb == 0 && countc == 0) {
					System.out.println();
					System.out.print(player2 + ", you must take the last remaining counter, so ");
					System.out.println("you lose. " + player1 + " wins!");
					pile = 0;
				} else if (counta == 0 && countb == 1 && countc == 0) {
					System.out.println();
					System.out.print(player2 + ", you must take the last remaining counter, so ");
					System.out.println("you lose. " + player1 + " wins!");
					pile = 0;
				} else if (counta == 0 && countb == 0 && countc == 1) {
					System.out.println();
					System.out.print(player2 + ", you must take the last remaining counter, so ");
					System.out.println("you lose. " + player1 + " wins!");
					pile = 0;
				}
			}
			if (pile == 2) {
				System.out.println();
				System.out.print(player2 + ", choose a pile: ");
				choose = keyboard.next();
				if (choose.equals("A")) {
					System.out.print("How many to remove from pile " + choose + ": ");
					num = keyboard.nextInt();
					counta = counta - num;
					System.out.println();
					checkA();
					pile = 1;
				}
				if (choose.equals("B")) {
					System.out.print("How many to remove from pile " + choose + ": ");
					num = keyboard.nextInt();
					countb = countb - num;
					System.out.println();
					checkB();
					pile = 1;
				}
				if (choose.equals("C")) {
					System.out.print("How many to remove from pile " + choose + ": ");
					num = keyboard.nextInt();
					countc = countc - num;
					System.out.println();
					checkC();
					pile = 1;
				}
				if (counta == 0 && countb == 0 && countc == 0) {
					System.out.println();
					System.out.println(player1 + ", there are no counters left, so you WIN!");
					pile = 0;
				}
				if (counta == 1 && countb == 0 && countc == 0) {
					System.out.println();
					System.out.print(player1 + ", you must take the last remaining counter, so ");
					System.out.println("you lose. " + player2 + " wins!");
					pile = 0;
				} else if (counta == 0 && countb == 1 && countc == 0) {
					System.out.println();
					System.out.print(player1 + ", you must take the last remaining counter, so ");
					System.out.println("you lose. " + player2 + " wins!");
					pile = 0;
				} else if (counta == 0 && countb == 0 && countc == 1) {
					System.out.println();
					System.out.print(player1 + ", you must take the last remaining counter, so ");
					System.out.println("you lose. " + player2 + " wins!");
					pile = 0;
				}
			}
		}
	}
}
