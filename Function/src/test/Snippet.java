package test;

import java.util.Scanner;

public class Snippet {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter value of angle in degrees ");

		double degrees = scanner.nextDouble();

		System.out.println("Lets calculate the sine, cosine and tan of angle ...");

		double sineOfAngle = (Math.sin(degrees));
		double cosOfAngle = Math.cos(Math.toRadians(degrees));
		double tanOfAngle = Math.tan(degrees);

		System.out.println();
		System.out.println("The Sine of " + degrees + " degrees is : " + sineOfAngle);
		System.out.println("The Cosine of " + degrees + " degrees is : " + cosOfAngle);
		System.out.println("The Tangent of " + degrees + " degrees is : " + tanOfAngle);
	}
}
