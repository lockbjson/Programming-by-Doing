package tictactoe;

import java.util.Scanner;

public class TicTacToe {

	private static char[][] board = new char[3][3];

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);

		initBoard();
		displayBoard();
		int count = 0;
		int player = 1;
		while (player != 0) {
			if (player == 1) {
				System.out.print("'O', choose your location (row, column): ");
				int r_input = keyboard.nextInt();
				int c_input = keyboard.nextInt();
				for (int r = 0; r < 3; r++) {
					for (int c = 0; c < 3; c++) {
						if (board[r_input][c_input] == board[r][c]) {
							board[r_input][c_input] = 'O';
						}
					}
				}
				count += 1;
				System.out.println(count);
				displayBoard();
				player = 2;
				if (count == 9) {
					System.out.println("The game is a tie.");
					player = 0;
				}
			}
			if (player == 2) {
				System.out.print("'X', choose your location (row, column): ");
				int r_input = keyboard.nextInt();
				int c_input = keyboard.nextInt();
				for (int r = 0; r < 3; r++) {
					for (int c = 0; c < 3; c++) {
						if (board[r_input][c_input] == board[r][c]) {
							board[r_input][c_input] = 'X';
						}
					}
				}
				count += 1;
				System.out.println(count);
				displayBoard();
				player = 1;
				if (count == 9) {
					System.out.println("The game is a tie.");
					player = 0;
				}
			}
		}
	}

	public static void initBoard() {
		// fills up the board with blanks
		for (int r = 0; r < 3; r++) {
			for (int c = 0; c < 3; c++) {
				board[r][c] = ' ';
			}
		}
	}

	public static void displayBoard() {
		System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
		System.out.println("    --+-+--");
		System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
		System.out.println("    --+-+--");
		System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
		System.out.println("     0 1 2 ");
	}

	public static void displayBoard2() {
		for (int r = 0; r < 3; r++) {
			System.out.print("\t" + r + " ");
			for (int c = 0; c < 3; c++) {
				System.out.print(board[r][c] + " ");
			}
			System.out.println();
		}
		System.out.println("\t  0 1 2 ");
	}
}