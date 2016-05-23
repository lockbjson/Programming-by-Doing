package flipagain;

import java.util.Random;
import java.util.Scanner;

public class FlipAgain {
	// While Loop

	// public static void main(String[] args) {
	// Scanner keyboard = new Scanner(System.in);
	// Random rng = new Random();
	//
	// String again;
	//
	// int flip = rng.nextInt(2);
	// String coin = "TAILS";
	// System.out.println("You flip a coin and it is... " + coin);
	// System.out.print("Would you like to flip again (y/n)? ");
	// again = keyboard.next();
	//
	// while (again.equals("y")) {
	// if (flip == 1)
	// coin = "HEADS";
	// else
	// coin = "TAILS";
	// System.out.println("You flip a coin and it is... " + coin);
	// System.out.print("Would you like to flip again (y/n)? ");
	// again = keyboard.next();
	// }
	// }

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random rng = new Random();

		String coin = "TAILS";
		int flip = rng.nextInt(2);
		String again;
		// System.out.println("You flip a coin and it is... " + coin);
		// System.out.print("Would you like to flip again (y/n)? ");
		// again = keyboard.next();
		do {
			System.out.println("You flip a coin and it is... " + coin);
			System.out.print("Would you like to flip again (y/n)? ");
			again = keyboard.next();
			if (flip == 1) {
				coin = "HEADS";
			} else {
				coin = "TAILS";
			}
		} while (again.equals("y"));
	}
	// Neu xoa dong 'String again' thi sẽ không chạy được, chương trình sẽ báo
	// lỗi vì chưa có biến again, cần phải khởi tạo.
	// Nếu có dòng 'String again' thì chương trình sẽ chạy được bình thường, vì
	// biến again đã được khởi tạo.
}
