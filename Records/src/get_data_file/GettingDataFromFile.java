package get_data_file;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Dog {
	String breed;
	int age;
	double weight;
}

public class GettingDataFromFile {
	public static void main(String[] args) throws IOException {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Which file to open: ");
		String file = keyboard.next();
		Scanner readFile = new Scanner(new File(file));
		System.out.println("Reading data from dogs.txt\n");

		Dog first = new Dog();
		first.breed = readFile.nextLine();
		first.age = Integer.parseInt(readFile.nextLine());
		first.weight = Double.parseDouble(readFile.nextLine());
		System.out.print("First dog: " + first.breed + ", " + first.age + ", " + first.weight);
		
		System.out.println();

		Dog second = new Dog();
		second.breed = readFile.nextLine();
		second.age = Integer.parseInt(readFile.nextLine());
		second.weight = Double.parseDouble(readFile.nextLine());
		System.out.print("Second dog: " + second.breed + ", " + second.age + ", " + second.weight);

	}

}
