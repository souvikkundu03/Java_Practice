package CodingPractice;

public class CommonPrefix {
	public static int minLength(String[] str) {
		int minlength = str[0].length();
		for (int i = 0; i < str.length; i++)
			if (minlength > str[i].length())
				minlength = str[i].length();
		return minlength;
	}

	public static String commomPrefix(String[] names, int min_length) {
		String result = "";
		char subString;
		for (int i = 0; i < min_length; i++) {
			subString = names[0].charAt(i);
			for (int j = 0; j < names.length; j++) {
				if (subString != names[j].charAt(i))
					return result;
			}
			result += subString;
		}
		return result;
	}

	public static void main(String[] args) {
		String s[] = { "soumya", "soumyajit", "sourajit", "soham" };
		int min_length = minLength(s);
		String prefix = commomPrefix(s, min_length);
		System.out.println("Longest common substring is: " + prefix);

	}

}
