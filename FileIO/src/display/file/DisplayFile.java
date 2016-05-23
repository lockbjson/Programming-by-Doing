package display.file;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DisplayFile {
	public static void main(String[] args) throws IOException {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Open which file: ");
		String input = keyboard.next();
		if (input.equals("score.txt")) {
			keyboard = new Scanner(new File("D:/score.txt"));
			while (keyboard.hasNext()) {
				String content1 = keyboard.nextLine();
				System.out.println(content1);
			}
		}
		if (input.equals("letter.txt")) {
			keyboard = new Scanner(new File("D:/letter.txt"));
			while (keyboard.hasNext()) {
				String content1 = keyboard.nextLine();
				System.out.println(content1);
			}
		}
	}
}
