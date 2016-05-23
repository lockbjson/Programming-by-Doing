package table;

public class MultiplicationTable {
	public static void main(String[] args) {
		int result;
		System.out.println("x | 1\t2\t3\t4\t5\t6\t7\t8\t9\t");
		System.out.println("==+====================================================================");
		for (int a = 1; a < 13; a++) {
			System.out.print(a + " | ");
			for (int b = 1; b < 10; b++) {
				result = a * b;
				System.out.print(result + "\t");
			}
			System.out.println();
		}
	}
}
