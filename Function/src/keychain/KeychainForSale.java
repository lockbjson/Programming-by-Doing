package keychain;

import java.util.Scanner;

public class KeychainForSale {

	public static String add_keychains() {
		return "ADD KEYCHAINS";
	}

	public static String remove_keychains() {
		return "REMOVE KEYCHAINS";
	}

	public static String view_order() {
		return "VIEW ORDER";
	}

	public static String checkout() {
		return "CHECKOUT";
	}

	public static void main(String[] args) {
		int choose = 1;
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Ye Olde Keychain Shoppe\n");

		while (choose != 0) {
			System.out.println();
			System.out.println("1. Add Keychains to Order");
			System.out.println("2. Remove Keychains from Order");
			System.out.println("3. View Current Order");
			System.out.println("4. Checkout\n");

			System.out.print("Please enter your choice: ");
			int menu = keyboard.nextInt();
			System.out.println();
			if (menu == 1) {
				System.out.println(add_keychains());
			} else if (menu == 2) {
				System.out.println(remove_keychains());
			} else if (menu == 3) {
				System.out.println(view_order());
			} else if (menu == 4) {
				System.out.println(checkout());
				choose = 0;
			} else {
				System.out.println("ERROR!");
			}
		}
	}
}
