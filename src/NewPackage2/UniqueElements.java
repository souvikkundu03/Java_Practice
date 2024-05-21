package NewPackage2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class UniqueElements {

	public static void main(String[] args) {
		int nums[] = { 6, 10, 5, 4, 9, 120, 4, 6, 10 };
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i]) + 1);
			} else {
				map.put(nums[i], 1);
			}
		}
		System.out.println(map);
		Set<Integer> s = new HashSet<>();
		for (Integer elements : map.values()) {
			s.add(elements);
		}
		System.out.println(s);
		int sum = 0;
		for(Integer el: s) {
			sum += el;
		}
		System.out.println(sum);

	}

}
