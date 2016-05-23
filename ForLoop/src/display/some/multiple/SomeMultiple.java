package display.some.multiple;

import java.util.Scanner;

public class SomeMultiple {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Choose a number: ");
		int num = keyboard.nextInt();

		for (int i = 1; i <= 12; i++) {
			int result = num * i;
			System.out.println(num + "*" + i + " = " + result);
		}
	}
}
