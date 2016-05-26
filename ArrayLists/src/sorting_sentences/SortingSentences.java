package sorting_sentences;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class SortingSentences {

	public static void swap(ArrayList<String> arr, int i, int j) {
		String temp = arr.get(i);
		arr.set(i, arr.get(j));
		arr.set(j, temp);
	}

	public static void sort_sentences(ArrayList<String> arr) {
		for (int i = 0; i < arr.size(); i++) {
			for (int j = 0; j < arr.size(); j++) {
				if (arr.get(i).compareTo(arr.get(j)) < 0) {
					swap(arr, i, j);
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Sentence: ");
		String input = keyboard.nextLine();

		String[] sentences = input.toLowerCase().split(Pattern.quote(" "));

		ArrayList<String> arr = new ArrayList<String>();
		for (int i = 0; i < sentences.length; i++) {
			arr.add(sentences[i]);
		}

		// sort sentences
		sort_sentences(arr);
		System.out.println("Sorted: " + arr);
	}
}
