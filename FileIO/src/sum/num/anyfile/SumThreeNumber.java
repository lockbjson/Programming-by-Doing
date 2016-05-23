package sum.num.anyfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class SumThreeNumber {
	public static void main(String[] args) throws IOException {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Which file would you like to read numbers from: ");
		String input = keyboard.next();
		if (input.equals("3nums1.txt")) {
			System.out.println("Reading numbers from file \"3nums1.txt\"");
			keyboard = new Scanner(new File("D:/3nums1.txt"));
			int num1 = keyboard.nextInt();
			int num2 = keyboard.nextInt();
			int num3 = keyboard.nextInt();
			System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + (num1 + num2 + num3));
		}
		if (input.equals("3nums4.txt")) {
			System.out.println("Reading numbers from file \"3nums4.txt\"");
			keyboard = new Scanner(new File("D:/3nums4.txt"));
			int num1 = keyboard.nextInt();
			int num2 = keyboard.nextInt();
			int num3 = keyboard.nextInt();
			System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + (num1 + num2 + num3));
		}
		if (input.equals("3nums2.txt")) {
			System.out.println("Reading numbers from file \"3nums2.txt\"");
			keyboard = new Scanner(new File("D:/3nums2.txt"));
			int num1 = keyboard.nextInt();
			int num2 = keyboard.nextInt();
			int num3 = keyboard.nextInt();
			System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + (num1 + num2 + num3));
		}
		if (input.equals("3nums3.txt")) {
			System.out.println("Reading numbers from file \"3nums3.txt\"");
			keyboard = new Scanner(new File("D:/3nums3.txt"));
			int num1 = keyboard.nextInt();
			int num2 = keyboard.nextInt();
			int num3 = keyboard.nextInt();
			System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + (num1 + num2 + num3));
		}
	}
}
