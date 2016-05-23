package safe.square.root;

import java.util.Scanner;

public class SafeSquare {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int num;
		System.out.println("SQUARE ROOT!");

		// ------do-while-------
		// do {
		// System.out.print("Enter a number: ");
		// num = keyboard.nextInt();
		// double sqrt = (double) Math.sqrt(num);
		// if (num > 0) {
		// System.out.println("The square root of " + num + " is " + sqrt);
		// } else {
		// System.out.println("You can't take the square root of a negative
		// number, silly.");
		// }
		// } while (num < 0);

		// -------while------
		System.out.print("Enter a number: ");
		num = keyboard.nextInt();

		while (num < 0) {
			System.out.println("You can't take the square root of a negative number, silly.");
			System.out.print("Enter a number: ");
			num = keyboard.nextInt();
		}
		double sqrt = (double) Math.sqrt(num);
		System.out.println("The square root of " + num + " is " + sqrt);
	}

}
