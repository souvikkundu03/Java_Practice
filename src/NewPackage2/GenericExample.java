package NewPackage2;

import java.util.ArrayList;
//import java.util.HashMap;
import java.util.List;

abstract class Person{
	abstract void printDeatails();
	
}
class Student11 extends Person{
//	String name;
	int roll;
//	HashMap<E, E> smap = new HashMap<>();
	Student11(int roll){
//		this.name = name;
		this.roll = roll;
	}
		
	@Override
	public void printDeatails() {
		System.out.println(this.roll);
	}
	
}
class Employee extends Person{
//	String name;
	int id;
//	HashMap<E, E> emap = new HashMap<>();
	Employee(int id){
//		this.name = name;
		this.id = id;
	}
	@Override
	public void printDeatails() {
		System.out.println(this.id);
	}
}
public class GenericExample {
	public static void show(List<? extends Person> list) {
		for (Person p: list) {
			p.printDeatails();;
		}
		
	}

	public static void main(String[] args) {
		List<Student11> list1=new ArrayList<Student11>();  
		list1.add(new Student11(150));  
		  
		List<Employee> list2=new ArrayList<Employee>();  
		list2.add(new Employee(121));  
		list2.add(new Employee(123));  
		  
		show(list1);
		show(list2);
	}

}
