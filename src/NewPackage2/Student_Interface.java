package NewPackage2;

public interface Student_Interface {
	default Student getStudentDetails(Student student)
	{
		System.out.println("Name: " + student.getName());
		System.out.println("Roll: " + student.getRoll());
		System.out.println("Marks: " + student.getMarks());
		return student;
	}
}
