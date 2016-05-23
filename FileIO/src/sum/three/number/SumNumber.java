package sum.three.number;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SumNumber {
	public static void main(String[] args) throws IOException {
		Scanner keyboard = new Scanner(new File("D:/3nums.txt"));
		filereader(keyboard);
	}

	public static void filereader(Scanner keyboard) {
		System.out.println("Reading numbers from file \"3nums.txt\"... done.");
		int num1 = keyboard.nextInt();
		int num2 = keyboard.nextInt();
		int num3 = keyboard.nextInt();
		System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + (num1 + num2 + num3));
	}
}
