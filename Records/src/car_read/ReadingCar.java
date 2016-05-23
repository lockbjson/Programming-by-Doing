package car_read;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Car {
	String make;
	String model;
	int year;
	String license;
}

public class ReadingCar {
	public static void main(String[] args) throws IOException {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("From which file do you want to load this information? ");
		String file = keyboard.next();
		Scanner readFile = new Scanner(new File(file));
		System.out.println("Data loaded.");

		Car[] car = new Car[5];
		int i = 0;

		while (readFile.hasNext()) {
			car[i] = new Car();
			car[i].make = readFile.next();
			car[i].model = readFile.next();
			car[i].year = readFile.nextInt();
			car[i].license = readFile.next();
			i++;
		}

		for (i = 0; i < car.length; i++) {
			System.out.println("Car " + (i + 1));
			System.out.println("\tMake: " + car[i].make);
			System.out.println("\tModel: " + car[i].model);
			System.out.println("\tYear: " + car[i].year);
			System.out.println("\tLicense: " + car[i].license);
			System.out.println();
		}
	}
}
