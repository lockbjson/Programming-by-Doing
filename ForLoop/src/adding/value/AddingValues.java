package adding.value;

import java.util.Scanner;

public class AddingValues {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Number: ");
		int num = keyboard.nextInt();
		System.out.println();
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			System.out.print(i + " ");
			sum = sum + i;
		}
		System.out.println("\nThe sum is " + sum);

	}

}
