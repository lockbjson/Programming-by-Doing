package arraybunch;

public class ArrayBunch {
	public static void main(String[] args) {
		String[] s = { "alpha", "bravo", "charlie", "delta", "echo" };
		int[] a = new int[5];

		System.out.println("The first array is filled with the following values: ");
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + " ");
		}
		System.out.println();
		System.out.println("The second array is filled with the following values: ");
		for (int i = 0; i < a.length; i++) {
			a[i] = 1 + (int)(Math.random() * 100);
			System.out.print(a[i] + " ");
		}
	}

}
