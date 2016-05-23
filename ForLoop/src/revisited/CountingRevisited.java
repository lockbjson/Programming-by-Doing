package revisited;

import java.util.Scanner;

public class CountingRevisited {
	public static void main(String[] args) {

		int num1, num2, num3, result;

		Scanner keyboard = new Scanner(System.in);
		System.out.print("Count from: ");
		num1 = keyboard.nextInt();
		System.out.print("Count to: ");
		num2 = keyboard.nextInt();
		System.out.print("Count by: ");
		num3 = keyboard.nextInt();

		result = num1 + num3;

		for (result = num1; result <= num2; result += num3) {
			System.out.print(result + " ");
		}

	}
}
