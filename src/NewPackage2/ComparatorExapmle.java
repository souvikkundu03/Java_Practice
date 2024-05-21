package NewPackage2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student24{
	String name;
	int age;
	int marks;
	public Student24(String name, int age, int marks){
		this.name = name;
		this.age = age;
		this.marks = marks;		
	}
	@Override
	public String toString() {
		return this.name + " " + this.age + " " + this.marks;
		
	}
}

public class ComparatorExapmle {

	public static void main(String[] args) {
		List<Student24> l = new ArrayList<Student24>();
		l.add(new Student24("A", 20, 78));
		l.add(new Student24("B", 22, 98));
		l.add(new Student24("D", 24, 98));
		l.add(new Student24("E", 30, 70));
		l.add(new Student24("U", 32, 58));
		l.add(new Student24("Y", 10, 76));
		l.add(new Student24("O", 21, 74));
		l.add(new Student24("P", 19, 32));
//		Collections.sort(l, new Comparator<Student24>(){		//Anonymous Class
//			public int compare(Student24 o1, Student24 o2) {
//				if(o1.marks > o2.marks)
//					return 1;
//				else if(o1.marks < o2.marks)
//					return -1;
//				else
//					return 0;
//			}
//		});
		Collections.sort(l, (e1, e2) -> (e1.marks > e2.marks) ? 1 : (e1.marks < e2.marks) ? -1 : 0);
				
		l.forEach(e -> System.out.println(e));
	}

}
