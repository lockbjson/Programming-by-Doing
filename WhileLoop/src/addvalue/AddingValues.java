package addvalue;

import java.util.Scanner;

public class AddingValues {
	private static int total = 0;
	private static Scanner keyboard;

	public static void calculate() {
		keyboard = new Scanner(System.in);
		System.out.println("I will add up the numbers you give me.");

		System.out.print("Number: ");
		int num = keyboard.nextInt();
		total = num + total;

		while (num != 0) {
			System.out.println("The total so far is " + total);
			System.out.print("Number: ");
			num = keyboard.nextInt();
			total = num + total;
		}
		total = num + total;
		System.out.println("The total is " + total);
	}

	public static void main(String[] args) {
		calculate();
	}
}
