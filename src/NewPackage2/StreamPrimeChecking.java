package NewPackage2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPrimeChecking {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 4, 3, 6, 5, 9, 7, 13, 17, 19, 78);
		list.stream().forEach(i -> {
			boolean flag = false;
			if (i <= 1)
				flag = true;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				System.out.println(i);
			}

		});

		List<Integer> list1 = list.stream().filter(n -> {
			if (n <= 1)
				return false;
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0)
					return false;
			}
			return true;
		}).filter(k -> k != 2).collect(Collectors.toList());

		System.out.print(list1);

	}

}
