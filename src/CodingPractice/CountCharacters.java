package CodingPractice;

public class CountCharacters {

	public static String countChars(String str) {

		char[] chararray = str.toCharArray();
		int count = 1;
		String s = "";
		for (int i = 0; i < str.length() - 1; i++) { // aaaaeeeerrrtty
			if (chararray[i] == chararray[i + 1]) {
				count++;
			} else {
				s = s + chararray[i] + String.valueOf(count);
//				System.out.println(s);
				count = 1;
			}
		}
		s = s + chararray[str.length() - 1] + String.valueOf(count);

		return s;
	}

	public static void main(String[] args) {

		String s = "aaaaeeeerrrtty"; // output => a4e4r3t2y1e2

//		CountCharacters2 cc = new CountCharacters2();
		String output = countChars(s);
		System.out.println(output);

	}

}

class CountCharacters2 { // Chatgpt

	public static String countChars(String str) {
		char[] charArray = str.toCharArray();
		int count = 1;
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < str.length() - 1; i++) {
			if (charArray[i] == charArray[i + 1]) {
				count++;
			} else {
				result.append(charArray[i]).append(count);
				count = 1;
			}
		}

		// Append the last character and its count
		result.append(charArray[str.length() - 1]).append(count);

		return result.toString();
	}

}
