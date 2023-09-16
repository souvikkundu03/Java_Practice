package com.demo.s;

import NewPackage2.Student;
import NewPackage2.Student_Interface;

public class StudentController implements Student_Interface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setName("Souvik");
		student.setRoll(150);
		student.setMarks(80);
		Student_Interface student_Interface = new StudentController();
		student_Interface.getStudentDetails(student);
	}

}
