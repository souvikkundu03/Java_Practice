package NewPackage2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamAverage {

	public static void main(String[] args) {
		
		Set<String> set1 = new HashSet<>();
		set1.add("Akash");
		set1.add("Soumyajit");
		set1.add("Souvik");
		set1.add("Sanjib");
		set1.add("Debayan");
		set1.add("Aman");
		set1.add("Aaaa");

		List<String> listOfA = set1.stream().filter(a -> a.startsWith("A")).collect(Collectors.toList());

		listOfA.stream().forEach(System.out::println);
			
		
//		List<Integer> list1 = Arrays.asList(4, 7, 6, 8, 0, 4, 1);
//		
//		Double avg = list1.stream().mapToInt(a -> a).average().getAsDouble();
//		Integer max = list1.stream().max(Comparator.comparingInt(Integer::valueOf)).get();
//		Integer min = list1.stream().min(Comparator.comparingInt(Integer::valueOf)).get();
//
//		System.out.println(max);
//		System.out.println(min);
	}

}
