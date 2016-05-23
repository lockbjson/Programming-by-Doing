package array;

public class TestArray {
	public static void main(String[] args) {

		int a[] = new int[10];
		a[0] = -113;
		a[1] = -113;
		a[2] = -113;
		a[3] = -113;
		a[4] = -113;
		a[5] = -113;
		a[6] = -113;
		a[7] = -113;
		a[8] = -113;
		a[9] = -113;

		for (int i = 0; i < a.length; i++) {
			System.out.println("Slot " + i + " contains a " + a[i]);
		}
	}
}
