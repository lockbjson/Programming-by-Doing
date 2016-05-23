package largestvalue;

public class LocatingLargestValue {
	public static void main(String[] args) {

		int a[] = new int[10];

		System.out.print("Array: ");
		int result = 0;
		int slot = 0;
		for (int i = 0; i < a.length; i++) {
			a[i] = 1 + (int) (Math.random() * 100);
			System.out.print(a[i] + " ");
			if (a[i] > result) {
				result = a[i];
				slot = i;
			}
		}
		System.out.println();
		System.out.println("\nThe largest value is " + result);
		System.out.println("It is in slot " + slot);
	}

}
