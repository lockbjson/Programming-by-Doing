package sorting_arraylist_string;

import java.util.ArrayList;

public class SortingString {

	public static void swap(ArrayList<String> arr, int i, int j) {
		String temp = arr.get(i);
		arr.set(i, arr.get(j));
		arr.set(j, temp);
	}

	public static void sort_string(ArrayList<String> arr) {
		for (int i = 0; i < arr.size(); i++) {
			for (int j = 0; j < arr.size(); j++) {
				if (arr.get(i).compareTo(arr.get(j)) < 0) {
					swap(arr, i, j);
				}
			}
		}
	}

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		String[] words = { "ask", "not", "what", "your", "country", "can", "do", "for", "you", "but" };
		for (int i = 0; i < words.length; i++) {
			arr.add(words[i]);
		}
		System.out.println("ArrayList before: " + arr);

		// sort string
		sort_string(arr);
		System.out.println("ArrayList after: " + arr);
	}
}
