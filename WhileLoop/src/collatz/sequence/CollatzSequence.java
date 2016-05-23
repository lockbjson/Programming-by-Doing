package collatz.sequence;

import java.util.Scanner;

public class CollatzSequence {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);

		int num;
		int result = 0;
		int count = 0;
		int largest = 0;
		String tab = "\t";

		System.out.print("Starting number: ");
		num = keyboard.nextInt();
		System.out.print(num);
		System.out.print(tab);
		count++;
		if (num % 2 == 0) {
			result = num / 2;
			System.out.print(result);
			System.out.print(tab);
			count++;
			if (result > num) {
				largest = result;
			} else {
				largest = num;
			}
			do {
				if (result % 2 == 0) {
					result = result / 2;
					System.out.print(result);
					System.out.print(tab);
					count++;
					if (result > largest) {
						largest = result;
					}
				} else {
					result = result * 3 + 1;
					System.out.print(result);
					System.out.print(tab);
					count++;
					if (result > largest) {
						largest = result;
					}
				}
				if (count % 10 == 0) {
					System.out.print("\n");
				}
			} while (result != 1);
			count -= 1;
			System.out.println("\n" + "Terminated after " + count + " steps.");
			System.out.println("The largest value was " + largest);
		} else {
			result = num * 3 + 1;
			System.out.print(result);
			System.out.print(tab);
			count++;
			if (result > num) {
				largest = result;
			} else {
				largest = num;
			}
			do {
				if (result % 2 == 0) {
					result = result / 2;
					System.out.print(result);
					System.out.print(tab);
					count++;
					if (result > largest) {
						largest = result;
					}
				} else {
					result = result * 3 + 1;
					System.out.print(result);
					System.out.print(tab);
					count++;
					if (result > largest) {
						largest = result;
					}
				}
				if (count % 10 == 0) {
					System.out.print("\n");
				}
			} while (result != 1);
			count -= 1;
			System.out.println("\n" + "Terminated after " + count + " steps.");
			System.out.println("The largest value was " + largest);
		}
	}
}
