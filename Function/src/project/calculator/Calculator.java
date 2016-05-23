package project.calculator;

import java.util.Scanner;

public class Calculator {

	public static int addition(String a, String b) {
		return Integer.valueOf(a) + Integer.valueOf(b);
	}

	public static int subtraction(String a, String b) {
		return Integer.valueOf(a) - Integer.valueOf(b);
	}

	public static int multiplication(String a, String b) {
		return Integer.valueOf(a) * Integer.valueOf(b);
	}

	public static double division(String a, String b) {
		return Double.valueOf(a) / Double.valueOf(b);
	}

	public static int exponents(String a, String b) {
		return (int) Math.pow(Integer.valueOf(a), Integer.valueOf(b));
	}

	public static double sine(String degree) {
		return (double) Math.sin(Math.toRadians(Double.valueOf(degree)));
	}

	public static double cosine(String degree) {
		return (double) Math.cos(Math.toRadians(Double.valueOf(degree)));
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);

		String a, b;
		double c = 0;
		String op;

		do {
			System.out.print("> ");
			a = keyboard.next();
			op = keyboard.next();
			if (a.equals("sin")) {
				c = sine(op);
			} else if (a.equals("cos")) {
				c = cosine(op);
			} else {
				b = keyboard.next();
				if (Integer.valueOf(a) != 0) {
					if (op.equals("+")) {
						c = addition(a, b);
					} else if (op.equals("-")) {
						c = subtraction(a, b);
					} else if (op.equals("*")) {
						c = multiplication(a, b);
					} else if (op.equals("/")) {
						c = division(a, b);
					} else if (op.equals("^")) {
						c = exponents(a, b);
					} else {
						System.out.println("Undefined operator: '" + op + "'.");
						c = 0;
					}
				}
				if (Double.valueOf(a) == 0) {
					System.out.println("Bye!!!");
					break;
				}
			}
			System.out.println(c);
		} while (true);
	}
}
