/**
 * 
 */
package CodingPractice;

public class SecondLargest {

	public static int secondLargest(int[] arr) {
		int largest = Integer.MIN_VALUE, slargest = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				slargest = largest; //
				largest = arr[i];
			}
			if (arr[i] > slargest && arr[i] != largest) //
				slargest = arr[i]; //
		}
//	}
//		for (int i = 0; i < arr.length; i++) {	
//			if (arr[i] > slargest && arr[i] != largest)
//				slargest = arr[i];
//		}
		return slargest;

	}

	public static void main(String[] args) {
		int[] num = { 1, 5, 34, 4, 9, 4, 899, 119 };
		int result = secondLargest(num);
		System.out.println("Second largest element is: " + result);
	}

}
