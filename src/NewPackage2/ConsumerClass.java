package NewPackage2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class ConsumerClass {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(); 
		list.add(10);
		list.add(3);
		list.add(4);
		list.add(8);
		list.add(9);
		//1
		list.stream().filter(a-> a%2==0).forEach(b->System.out.println(b));
		//2
		list.stream().filter(a-> a%2==0).forEach(System.out::println);
		//3
		List<Integer> list1 = list.stream().filter(a-> a%2==0).collect(Collectors.toList());
		System.out.println(list1);
	}

}
