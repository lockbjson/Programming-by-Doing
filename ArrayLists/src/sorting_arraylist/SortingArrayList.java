package sorting_arraylist;

import java.util.ArrayList;

public class SortingArrayList {

	public static void swap(ArrayList<Integer> arr, int i, int j) {
		int largest = arr.get(i);
		arr.set(i, arr.get(j));
		arr.set(j, largest);

	}

	public static void sort_arrayList(ArrayList<Integer> arr) {
		for (int i = 0; i < 20; i++) {
			for (int j = i + 1; j < 20; j++) {
				if (arr.get(i) < arr.get(j)) {
					swap(arr, i, j);
				}
			}
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < 20; i++) {
			int num = 10 + (int) (Math.random() * 90);
			arr.add(num);
		}
		System.out.println("ArrayList before: " + arr);

		// sort
		sort_arrayList(arr);
		System.out.println("ArrayList after: " + arr);
	}
}
