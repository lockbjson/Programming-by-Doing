package counting.machine;

import java.util.Scanner;

public class CountingMachine {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Count to: ");
		int num = keyboard.nextInt();
		int count;
		count = num;
		for (num = 0; num <= count; num++) {
			System.out.print(num + " ");
		}

	}

}
