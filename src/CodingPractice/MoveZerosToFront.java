package CodingPractice;

public class MoveZerosToFront {

	public static int[] moveZerosToFirst(int[] arr) {

		int i, j;
		for (i = arr.length - 1, j = arr.length - 1; i >= 0; i--) { // 1, 5, 0, 4, 0, 4, 0, 9==>
			if (arr[j] == 0 && arr[i] != 0) {
				arr[i] = arr[i] ^ arr[j];
				arr[j] = arr[i] ^ arr[j];
				arr[i] = arr[i] ^ arr[j];
				j--;
			}
			if (arr[j] != 0)
				j--;
		}

		return arr;
	}

	public static void main(String[] args) {
		int[] num = { 1, 5, 0, 4, 0, 4, 0, 9 };

		int[] first = moveZerosToFirst(num);

		System.out.println("Moved to first....");
		for (int j : first)
			System.out.print(j + " ");

	}
}
