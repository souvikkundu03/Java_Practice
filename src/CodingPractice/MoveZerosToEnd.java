package CodingPractice;

public class MoveZerosToEnd {
	public static int[] moveZerosToEnd(int[] arr) {

		int i, j;
		for (i = 0, j = 0; i < arr.length; i++) { // 1, 5, 0, 4, 0, 4, 0, 9==>
			if (arr[j] == 0 && arr[i] != 0) {
				arr[i] = arr[i] ^ arr[j];
				arr[j] = arr[i] ^ arr[j];
				arr[i] = arr[i] ^ arr[j];
				j++;
			}
			if (arr[j] != 0)
				j++;
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] num = { 0, 1, 5, 0, 4, 0, 4, 0, 9 };

		int[] end = moveZerosToEnd(num);

		System.out.println("Moved to end....");
		for (int i : end)
			System.out.print(i + " ");

	}

}
