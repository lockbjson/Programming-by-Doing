package dice;

import java.util.Scanner;

public class DiceDoubles {
	private static int sum;

	public static void check() {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);

		System.out.println("HERE COMES THE DICE!");

		System.out.print("Roll #1: ");
		int num1 = keyboard.nextInt();
		System.out.print("Roll #2: ");
		int num2 = keyboard.nextInt();
		sum = num1 + num2;
		System.out.println("The total is " + sum);

		while (num1 != num2) {
			System.out.print("Roll #1: ");
			num1 = keyboard.nextInt();
			System.out.print("Roll #2: ");
			num2 = keyboard.nextInt();
			sum = num1 + num2;
			System.out.println("The total is " + sum);
		}
	}

	public static void main(String[] args) {
		check();
	}
}
