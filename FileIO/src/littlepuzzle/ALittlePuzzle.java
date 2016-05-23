package littlepuzzle;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ALittlePuzzle {
	public static void main(String[] args) throws IOException {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Open which file: ");
		String file = keyboard.nextLine();
		if (file.equals("puzzle.txt")) {
			keyboard = new Scanner(new File("D:/puzzle.txt"));
			String c = keyboard.nextLine();
			System.out.println(c.length());
			for (int a = 0; a < 45; a++) {
				int b = a * 3;
				char ch = c.charAt(b);
				System.out.print(ch);
			}
		}
		if (file.equals("puzzle2.txt")) {
			keyboard = new Scanner(new File("D:/puzzle2.txt"));
			String c = keyboard.nextLine();
			System.out.println(c.length());
			for (int a = 0; a < 42; a++) {
				int b = a * 3;
				char ch = c.charAt(b);
				System.out.print(ch);
			}
		}
	}
}
