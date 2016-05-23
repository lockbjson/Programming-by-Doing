package highscore;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HighScore {
	public static void main(String[] args) throws IOException {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);

		System.out.println("You got a high score!");

		System.out.print("Please enter your score: ");
		String score = keyboard.next();
		System.out.print("Please enter your name: ");
		String name = keyboard.next();

		BufferedWriter bw = new BufferedWriter(new FileWriter("D:/score.txt"));
		bw.write(String.valueOf(score + " "));
		bw.write(name);
		bw.flush();
		bw.close();

		System.out.println("Data stored into score.txt");
	}

}
