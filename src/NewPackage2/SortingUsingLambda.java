package NewPackage2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author Souvik
 * class Student
{
	int age;   // comparable and compator 
	char className;
	String name; // comparable and compator 
}
interface inerf
{
	public abstract int test(int a, int b);
}

public class WrapperClassDemo 
{
	public static void main(String[] args) 
	{
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(2);
		list.add(4);
		Collections.sort(list, (i1,i2) -> i1>i2? 1 : i1<i2 ? -1 : 0);
		
		System.out.println(list);
		
		
	}

}
 *
 */

public class SortingUsingLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(6);
		list.add(3);
		list.add(0);
		list.add(2);
		list.add(1);
		Collections.sort(list, (i1, i2) -> (i1<i2)? 1 : (i1>i2) ? -1 : 0);
		System.out.println(list);
	}

}
