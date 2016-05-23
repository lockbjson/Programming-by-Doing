package finding;

import java.util.Scanner;

public class FindingValue {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int[] a = new int[10];
		System.out.print("Array: ");
		for (int i = 0; i < a.length; i++) {
			a[i] = 1 + (int) (Math.random() * 50);
			System.out.print(a[i] + " ");
		}
		System.out.print("\nValue to find: ");
		int num = keyboard.nextInt();
		System.out.println();
		boolean num_found = false;
		for (int i = 0; i < a.length; i++) {
			if (num == a[i] && ! num_found) {
				num_found = true;
			}
		}
		if (num_found) {
			System.out.println(num + " is in the array.");
		} else {
			System.out.println(num + " is not in the array.");
		}
	}
}
