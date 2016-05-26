package finding_value;

import java.util.ArrayList;
import java.util.Scanner;

public class FindingValue {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		int[] a = new int[10];
		for (int i = 0; i < 10; i++) {
			a[i] = 1 + (int) (Math.random() * 50);
			al1.add(a[i]);
		}
		System.out.println("ArrayList 1: " + al1);
		System.out.print("Value to find: ");
		int num = keyboard.nextInt();
		System.out.println();
		for (int i = 0; i < 10; i++) {
			int b = al1.get(i);
			if (b == num) {
				System.out.println(num + " is in the ArrayList.");
				System.out.println(num + " is in slot " + i);
			} else {
				System.out.println(num + " is not in the ArrayList.");
			}
		}
		// for (int i = 0; i < a.length; i++) {
		// if (a[i] == num) {
		// System.out.println(num + " is in the ArrayList.");
		// }
		// }
	}
}
