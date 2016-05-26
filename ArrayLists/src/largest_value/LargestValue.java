package largest_value;

import java.util.ArrayList;

public class LargestValue {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int largest_num = 0;
		int slot = 0;
		for (int i = 0; i < 10; i++) {
			int num = 1 + (int) (Math.random() * 100);
			arr.add(num);
			if (arr.get(i) > largest_num) {
				largest_num = arr.get(i);
				slot = i;
			}
		}
		System.out.println("ArrayList: " + arr);
		System.out.println("The largest value is " + largest_num + ", which is in slot " + slot);
	}
}
