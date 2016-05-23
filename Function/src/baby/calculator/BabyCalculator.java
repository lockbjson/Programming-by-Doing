package baby.calculator;

import java.util.Scanner;

public class BabyCalculator {
	public static int add(int a, int b) {
		return a + b;
	}

	public static int subtract(int a, int b) {
		return a - b;
	}

	public static int multiply(int a, int b) {
		return a * b;
	}

	public static int divide(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int a, b, c;
		String op;

		do {
			System.out.print("> ");
			a = keyboard.nextInt();
			op = keyboard.next();
			b = keyboard.nextInt();
			if (a != 0) {
				if (op.equals("+")) {
					c = add(a, b);
				} else if (op.equals("-")) {
					c = subtract(a, b);
				} else if (op.equals("*")) {
					c = multiply(a, b);
				} else if (op.equals("/")) {
					c = divide(a, b);
				} else {
					System.out.println("Undefined operator: '" + op + "'.");
					c = 0;
				}
				System.out.println(c);
			} else {
				System.out.println("Bye, now.");
			}
		} while (a != 0);
	}
}