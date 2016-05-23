package calculator;

import java.util.Scanner;

public class AreaCalculator {

	public static double area_circle(int radius) {
		return radius * radius * Math.PI;
	}

	public static int area_rectangle(int length, int width) {
		return length * width;
	}

	public static int area_square(int side) {
		return side * side;
	}

	public static double area_triangle(int base, int height) {
		return (base * height) / 2;
	}

	public static void main(String[] args) {
		int shape = 1;
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Shape Area Calculator version 0.1 (c) 2005 Mitchell Sample Output, Inc.\n");
		while (shape != 0) {
			System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
			System.out.println("1) Triangle");
			System.out.println("2) Rectangle");
			System.out.println("3) Square");
			System.out.println("4) Cirlce");
			System.out.println("5) Quit");
			System.out.print("Which shape: ");
			int choose = keyboard.nextInt();
			System.out.println();
			if (choose == 1) {
				System.out.print("Base: ");
				int base = keyboard.nextInt();
				System.out.print("Height: ");
				int height = keyboard.nextInt();
				System.out.println("\nThe area is " + area_triangle(base, height) + ".\n");
			} else if (choose == 2) {
				System.out.print("Length: ");
				int length = keyboard.nextInt();
				System.out.print("Width: ");
				int width = keyboard.nextInt();
				System.out.println("\nThe area is " + area_rectangle(length, width) + ".\n");
			} else if (choose == 3) {
				System.out.print("Side length: ");
				int side = keyboard.nextInt();
				System.out.println("\nThe area is " + area_square(side) + ".\n");
			} else if (choose == 4) {
				System.out.print("Radius: ");
				int radius = keyboard.nextInt();
				System.out.println("\nThe area is " + area_circle(radius) + ".\n");
			} else if (choose == 5) {
				System.out.println("\nGoodbye.");
				shape = 0;
			}
		}
	}
}
