package keyboard;

import java.util.Scanner;

public class DumbCalculator {
	public static void main(String[] args) {
		double num1, num2, num3, sum;

		Scanner keyboard = new Scanner(System.in);

		System.out.print("What is your first number? ");
		num1 = keyboard.nextDouble();

		System.out.print("What is your second number? ");
		num2 = keyboard.nextDouble();

		System.out.print("What is your third number? ");
		num3 = keyboard.nextDouble();

		sum = (num1 + num2 + num3) / 2;

		System.out.println("(" + num1 + " + " + num2 + " + " + num3 + ")" + " / 2" + " is... " + sum);
	}

}
