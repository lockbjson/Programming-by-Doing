package gradearray;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ArrayFile {
	public static void main(String[] args) throws IOException {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Name (first last): ");
		String name = keyboard.nextLine();
		System.out.print("Filename: ");
		String file = keyboard.next();

		keyboard = new Scanner(new File(file));
		System.out.println();
		System.out.println("Here are your randomly-selected grades (hope you pass):");

		int a[] = new int[5];
		for (int i = 0; i < a.length; i++) {
			a[i] = 1 + (int) (Math.random() * 100);
			System.out.println("Grade " + (i+1) + ": " + a[i]);
		}
		System.out.println();

		PrintWriter writeFile = new PrintWriter(new FileWriter(file));
		writeFile.println(name);
		for (int i = 0; i < a.length; i++) {
			writeFile.print(a[i] + " ");
		}
		writeFile.close();
		System.out.println("Data saved in \"" + file + "\".");

	}
}
