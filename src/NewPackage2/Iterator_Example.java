package NewPackage2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Iterator_Example {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(9, "b");
		map.put(7, "a");
		map.put(5, "t");
		map.put(2, "i");
		map.put(4, "o");
		map.put(1, "p");

		List<Integer> keyList = new ArrayList<>(map.keySet());
		Collections.sort(keyList);
		Iterator<Entry<Integer, String>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Integer, String> entry = (Map.Entry<Integer, String>) iterator.next();
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}

	}
}
