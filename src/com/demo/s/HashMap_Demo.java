package com.demo.s;

import java.util.*;

public class HashMap_Demo {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>(); // unordered
		map.put("India", 120);
		map.put("US", 30);
		map.put("China", 150);
		System.out.println(map);

		map.put("China", 180);
		System.out.println(map);

		if (map.containsKey("China")) {
			System.out.println("present");
		} else {
			System.out.println("not present");
		}
		
		System.out.println(map.get("China"));
		System.out.println(map.get("Peru"));
		
		
		for(Map.Entry<String, Integer> e: map.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
		Set<String> keys = map.keySet();
		for(String key: keys) {
			System.out.println(key + " " + map.get(key));
		}
	}

}
