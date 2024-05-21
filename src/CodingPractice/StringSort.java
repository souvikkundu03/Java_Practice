package CodingPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class StringSort {

	public static void main(String[] args) {
		String str = "souvikkundu";

		int i, j;
		char temp;
		int n = str.length();
		boolean swapped;
		char[] arr = str.toCharArray();

		for (i = 0; i < n - 1; i++) {		//implemented Bubble sort to sort the character array
			swapped = false;
			for (j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {

					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
			if (swapped == false)
				break;
		}
		
		//used stream to sort the string

		ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));
		list.stream().sorted().forEach(System.out::print);

		System.out.println();
		System.out.print(arr);
//		System.out.println(list);

	}

}
