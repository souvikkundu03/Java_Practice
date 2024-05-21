package NewPackage2;

public interface ABCD {
	
	static void main(String[] args) {
		System.out.println("Inside Interface");
		for (String s : args) {
			System.out.println(s);
		}
	}
}

class demo3 implements ABCD{
	public static void main(String[] args) {
		System.out.println("Souvik Kundu....");
		String arr[] = {"Souvik", "Akash", "Soumyajit"};
		ABCD.main(arr);
	}
}