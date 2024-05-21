package NewPackage2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;



public class StreamExample {	//07-04-24

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(4, 7, 6, 8, 0, 4, 1);
		Integer sum =  Optional.ofNullable(list1)
                .map(list -> list.stream().mapToInt(Integer::intValue).sum())
                .orElseThrow();
		System.out.println(sum);
		
	}

}
