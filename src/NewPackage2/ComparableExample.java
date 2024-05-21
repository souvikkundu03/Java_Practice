package NewPackage2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student22 implements Comparable<Student22>{
	String name;
	int age;
	int marks;
	public Student22(String name, int age, int marks){
		this.name = name;
		this.age = age;
		this.marks = marks;		
	}
	@Override
	public int compareTo(Student22 o) {
		// TODO Auto-generated method stub
		return -this.name.compareTo(o.name);
	}
	public String toString() {
		return this.name + " " + this.age + " " + this.marks;
		
	}
	
}


public class ComparableExample {

	public static void main(String[] args) {
		
		List<Student22> list = new ArrayList<Student22>();
		list.add(new Student22("A", 20, 78));
		list.add(new Student22("B", 22, 98));
		list.add(new Student22("D", 24, 78));
		list.add(new Student22("E", 30, 78));
		list.add(new Student22("U", 32, 78));
		list.add(new Student22("Y", 10, 78));
		list.add(new Student22("O", 21, 78));
		list.add(new Student22("P", 19, 78));
		
//		Collections.sort(list, (e1, e2) -> (e1.age > e2.age) ? 1 : (e1.age < e2.age) ? -1 : 0); 
		Collections.sort(list, (e1, e2) -> e1.name.compareTo(e2.name));
		list.forEach(e -> System.out.println(e));
		
	}

}
