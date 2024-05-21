package CodingPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class ReverseWord {
	public static String reverseWord(String str) {

		char[] arr = str.toCharArray();
		int j = str.length() - 1;
		for (int i = 0; i < j; i++, j--) {
			char temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}

		return String.valueOf(arr);
	}

	public static void main(String[] args) {
		String inputString = "souvik is my name";
		System.out.println(inputString);

		ArrayList<String> strlist = new ArrayList<>(Arrays.asList(inputString));
		System.out.println("strlist: " + strlist);
		Stack<String> reversedList = new Stack<>();
		
		for (String word : strlist) {
			reversedList.add(reverseWord(word));
		}
		System.out.println("reversedlist: " + reversedList);
		while (!reversedList.empty())
			System.out.println(reversedList.pop());
	}

}
