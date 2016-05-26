package where_is_it;

import java.util.ArrayList;
import java.util.Scanner;

public class WhereIsIt {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		int[] a = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = 1 + (int) (Math.random() * 50);
			al1.add(a[i]);
		}
		System.out.println("ArrayList: " + al1);
		System.out.print("Value to find: ");
		int num = keyboard.nextInt();
		System.out.println();
		int b = 0;
		int c = 0;
		boolean num_found = false;
		for (int i = 0; i < a.length; i++) {
			b = al1.get(i);
			if (b == num) {
				num_found = true;
				c = i;
				// System.out.println(num + " is in the ArrayList.");
				// System.out.println(num + " is in slot " + i);
			}
		}
		if (!num_found) {
			System.out.println(num + " is not in the ArrayList.");
		} else {
			System.out.println(num + " is in slot " + c);
		}
	}
}
