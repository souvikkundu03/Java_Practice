package CodingPractice;

public class PalindromeChecking {
	private static boolean checkPalindrome(String str, int n) {

		int left = 0, right = str.length() - 1;
		while (left < right) {
			if (str.charAt(left) != str.charAt(right))
				return false;
			left++;
			right--;
		}
		return true;
	}

	public static void main(String[] args) {

		String str = "aaabaaaa";

		if (checkPalindrome(str, str.length()))
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
	}

}
