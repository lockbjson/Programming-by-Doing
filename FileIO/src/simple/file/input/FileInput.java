package simple.file.input;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileInput {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("D:/name.txt"));
		String file;
		while ((file = br.readLine()) != null) {
			System.out.print(file);
		}
		br.close();
	}
}
