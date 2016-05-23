package puzzles4;

public class NumberPuzzles4 {
	public static void main(String[] args) {
		for (int a = 1; a < 45; a++) {
			for (int b = 0; b < 45; b++) {
				for (int c = 0; c < 45; c++) {
					for (int d = 0; d < 45; d++) {

						// not optimal
						// int e1 = a + 2;
						// int e2 = b - 2;
						// int e3 = c * 2;
						// int e4 = d / 2;
						// if (e1 == e2 && e1 == e3 && e1 == e4 & a + b + c + d
						// == 45) {
						// System.out.print(a + " " + b + " " + c + " " + d + "
						// ");
						// }

						// optimal
						if (a + 2 == b - 2 && b - 2 == c * 2 && c * 2 == d / 2 && a + b + c + d == 45) {
							System.out.print(a + " " + b + " " + c + " " + d + " ");
						}
					}
				}
			}
		}
	}
}
