package tictactoe;

public class TicTacToe1 {
	public static void main(String[] args) {
		char[][] a = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };
		System.out.println("WELCOME TIC TAC TOE!!!");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("\t" + a[i][j] + " ");
			}
			System.out.println();
		}
	}

}
