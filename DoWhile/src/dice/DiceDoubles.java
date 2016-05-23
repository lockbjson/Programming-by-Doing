package dice;

import java.util.Scanner;

public class DiceDoubles {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);

		int num1, num2, total;
		System.out.println("HERE COME THE DICE!");
		do {
			System.out.print("Roll #1: ");
			num1 = keyboard.nextInt();
			System.out.print("Roll #2: ");
			num2 = keyboard.nextInt();
			total = num1 + num2;

			System.out.println("The total is " + total);
		} while (num1 != num2);
	}

}
