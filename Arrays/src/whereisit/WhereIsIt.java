package whereisit;

import java.util.Scanner;

public class WhereIsIt {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		int a[] = new int[10];
		System.out.print("Array: ");

		for (int i = 0; i < a.length; i++) {
			a[i] = 1 + (int) (Math.random() * 50);
			System.out.print(a[i] + " ");
		}
		System.out.print("\nValue to find: ");
		int num = keyboard.nextInt();
		System.out.println();
		boolean bo = false;
		int b = 0;
		for (int i = 0; i < a.length; i++) {
			if (num == a[i]) {
				b = i;
				// System.out.println(num + " is in slot " + i + ".");
				bo = true;
			}
		}
		if (bo) {
			System.out.println(num + " is in slot " + b + ".");
		} else {
			System.out.println(num + " is not in the array.");
		}
	}
}
