package car_write;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

class Car {
	String name;
	String model;
	int year;
	String license;
}

public class StoringDataInAFile {
	public static void main(String[] args) throws IOException {
		Car[] car = new Car[5];

		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);

		for (int i = 0; i < car.length; i++) {
			car[i] = new Car();
			System.out.println("Car " + (i + 1));
			System.out.print("\tMake: ");
			car[i].name = keyboard.next();
			System.out.print("\tModel: ");
			car[i].model = keyboard.next();
			System.out.print("\tYear: ");
			car[i].year = keyboard.nextInt();
			System.out.print("\tLicense: ");
			car[i].license = keyboard.next();
		}
		System.out.print("To which file do you want to save this information? ");
		String fileName = keyboard.next();
		PrintWriter pw = new PrintWriter(new FileWriter(fileName));

		for (int i = 0; i < car.length; i++) {
			pw.print(car[i].name + " ");
			pw.print(car[i].model + " ");
			pw.print(car[i].year + " ");
			pw.print(car[i].license + " ");
			pw.println();
		}
		pw.close();

		System.out.println("Data saved!");

	}

}
