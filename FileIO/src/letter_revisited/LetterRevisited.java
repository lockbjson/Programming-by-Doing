package letter_revisited;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class LetterRevisited {
	public static void main(String[] args) throws IOException {
		FileOutputStream fout = new FileOutputStream("D:/letter.txt");
		String s1 = "+---------------------------------------------------------+";
		String s2 = "|						    ######|";
		String s3 = "|						    ######|";
		String s4 = "|						    ######|";
		String s5 = "|							  |";
		String s6 = "|							  |";
		String s7 = "|			Cao Truong Tuan	  		  |";
		String s8 = "|			Binh Thuan		          |";
		String s9 = "|			Ham Liem		          |";
		String s10 = "|							  |";
		String s11 = "+---------------------------------------------------------+";
		String result = (s1 + "\r\n" + s2 + "\r\n" + s3 + "\r\n" + s4 + "\r\n" + s5 + "\r\n" + s6 + "\r\n" + s7 + "\r\n" + s8 + "\r\n"
				+ s9 + "\r\n" + s10 + "\r\n" + s11);

		byte b[] = result.getBytes();
		fout.write(b);
		fout.close();
		System.out.println("success...");
	}
}
