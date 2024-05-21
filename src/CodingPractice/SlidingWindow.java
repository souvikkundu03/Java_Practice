package CodingPractice;

public class SlidingWindow {
	public static int slidingWindow(String inputString, String pattern) {
		char[] inp = inputString.toCharArray();
		char[] pat = pattern.toCharArray();
		int pos = -1, j;
		int p = pattern.length();
		for (int i = 0; i < inputString.length() - p; i++) {
			for (j = 0; j < p; j++) {
				if(inp[i+j] != pat[j]) {
					break;
				}
			}
			if(j == p)
				pos = i;
		}
		return pos;
	}

	public static void main(String[] args) {

		String str = "aaaaeeeerrrtty";
		String pattern = "aaeee";
		
		System.out.println("Pattern found at: " + slidingWindow(str, pattern));

	}

}
