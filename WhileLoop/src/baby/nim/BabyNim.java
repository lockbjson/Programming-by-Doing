package baby.nim;

import java.util.Scanner;

public class BabyNim {

	public static void main(String[] args) {
		String choice;
		int counta = 3;
		int countb = 3;
		int countc = 3;
		int num;
		int piles = 1;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("A: " + counta + "\t" + "B: " + countb + "\t" + "C: " + countc);
		System.out.println();

		while (piles != 0) {
			System.out.print("Choose a pile: ");
			choice = keyboard.next();
			if (choice.equals("A")) {
				System.out.print("How many to remove from pile " + choice + ": ");
				num = keyboard.nextInt();
				counta = counta - num;
				System.out.println("A: " + counta + "\t" + "B: " + countb + "\t" + "C: " + countc);
				System.out.println();
			} else if (choice.equals("B")) {
				System.out.print("How many to remove from pile " + choice + ": ");
				num = keyboard.nextInt();
				countb = countb - num;
				System.out.println("A: " + counta + "\t" + "B: " + countb + "\t" + "C: " + countc);
				System.out.println();
			} else if (choice.equals("C")) {
				System.out.print("How many to remove from pile " + choice + ": ");
				num = keyboard.nextInt();
				countc = countc - num;
				System.out.println("A: " + counta + "\t" + "B: " + countb + "\t" + "C: " + countc);
				System.out.println();
			}
			if (counta <= 0 && countb <= 0 && countc <= 0) {
				System.out.println("All piles are empty. Good job!");
				piles = 0;
			}
		}
	}
}
