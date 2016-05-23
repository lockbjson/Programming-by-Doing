package objects;

public class TicTacToeClass {
	// Instance Variables
	private char[][] board;
	private int turns;

	// Constructors
	public TicTacToeClass() {
		board = new char[3][3];
		turns = 0;

		for (int r = 0; r < 3; r++)
			for (int c = 0; c < 3; c++)
				board[r][c] = ' ';
	}

	// Accessor Methods

	public boolean isWinner(char p) {
		for (int i = 0; i < 3; i++) {
			if ((board[i][0] == p) && (board[i][1] == p) && (board[i][2] == p)) {
				return true;
			}
		}
		return false;
	}

	public boolean isFull() {
		if (turns == 9) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isCat() {
		boolean isFill = true;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[i][j] == ' ' || isWinner('X') || isWinner('O')) {
					isFill = false;
				}
			}
		}
		return isFill;
	}

	public boolean isValid(int r, int c) {
		if (0 <= r && r <= 2 && 0 <= c && c <= 2) {
			if (board[r][c] == ' ')
				return true;
		}
		return false;
	}

	public int numTurns() {
		return turns;
	}

	public char playerAt(int r, int c) {
		if (isValid(r, c))
			return board[r][c];
		else
			return ' ';
	}

	public void displayBoard() {
		System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
		System.out.println("    --+-+--");
		System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
		System.out.println("    --+-+--");
		System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
		System.out.println("     0 1 2 ");
	}

	// Modifiers
	public void playMove(char p, int r, int c) {
		board[r][c] = p;
		turns++;
		numTurns();
	}

}