package selection;

public class Test {
	public static void main(String[] args) {
		int[] arr = { 4, 3, -5, 9, 19, 6, -9, 39, 99 };
		int slowest = 0;

		for (int i = 0; i < arr.length; i++) {
			if (slowest > arr[i]) {
				slowest = arr[i];
			}
		}
		System.out.println(slowest);
	}
}
