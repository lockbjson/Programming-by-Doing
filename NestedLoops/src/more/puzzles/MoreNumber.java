package more.puzzles;

import java.util.Scanner;

public class MoreNumber {
	public static void fun1() {
		for (int a = 1; a < 6; a++) {
			for (int b = 0; b < 10; b++) {
				if (a == 5 && b > 6) {
					break;
				}
				if ((a + b) > 10) {
					System.out.println(a + "" + b);
				}
				// int n = a * 10 + b;
				// if (n <= 56 && a + b > 10) {
				// System.out.println(n);
				// }
			}
		}
	}

	public static void fun2() {
		for (int a = 1; a < 10; a++) {
			for (int b = 0; b < 10; b++) {
				int n1 = a * 10 + b;
				int n2 = b * 10 + a;
				if (n1 - n2 == a + b) {
					System.out.println(n1);
				}
			}
		}
	}

	public static void main(String[] args) {
		int a = 1;
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		while (a != 0) {
			System.out.println("1) Find two digit numbers <= 56 with sums of digits > 10");
			System.out.println("2) Find two digit number minus number reversed which equals sum of digits");
			System.out.println("3) Quit\n");
			System.out.print(">");
			int choose = keyboard.nextInt();
			if (choose == 1) {
				fun1();
			}
			if (choose == 2) {
				fun2();
			}
			if (choose == 3) {
				a = 0;
			}
		}
	}
}
