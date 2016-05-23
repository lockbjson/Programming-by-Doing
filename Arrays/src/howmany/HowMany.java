package howmany;

import java.util.Scanner;

public class HowMany {
	public static void main(String[] args) {
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
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (num == a[i]) {
				count = count + 1;
			}
		}
		System.out.println(num + " was found " + count + " times.");
	}

}
