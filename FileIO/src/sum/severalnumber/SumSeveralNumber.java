package sum.severalnumber;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SumSeveralNumber {
	public static void main(String[] args) throws IOException {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Which file would you like to read numbers from: ");
		String file = keyboard.next();
		if (file.equals("5nums.txt")) {
			System.out.println("Reading numbers from \"5nums.txt\"");
			keyboard = new Scanner(new File("D:/5nums.txt"));
			int sum = 0;
			for (int i = 0; i < 15; i++) {
				while (keyboard.hasNext()) {
					int a = keyboard.nextInt();
					System.out.print(a + " ");
					sum = sum + a;
				}
			}
			System.out.println("\nTotal is " + sum);
		}
		if (file.equals("6nums.txt")) {
			System.out.println("Reading numbers from \"6nums.txt\"");
			keyboard = new Scanner(new File("D:/6nums.txt"));
			int sum = 0;
			for (int i = 0; i < 15; i++) {
				while (keyboard.hasNext()) {
					int a = keyboard.nextInt();
					System.out.print(a + " ");
					sum = sum + a;
				}
			}
			System.out.println("\nTotal is " + sum);
		}
		if (file.equals("7nums.txt")) {
			System.out.println("Reading numbers from \"7nums.txt\"");
			keyboard = new Scanner(new File("D:/7nums.txt"));
			int sum = 0;
			for (int i = 0; i < 15; i++) {
				while (keyboard.hasNext()) {
					int a = keyboard.nextInt();
					System.out.print(a + " ");
					sum = sum + a;
				}
			}
			System.out.println("\nTotal is " + sum);
		}
	}

}
