package CodingPractice;

interface Testing {
	
	static int sum(int a, int b) {
		return a+b;
	}
	
	static void main(String[] args) {
		System.out.println("Souvik");
		System.out.println(sum(2, 6));
	}

}
class A implements Testing{
	public static void main(String[] args) {
		System.out.println("Souvik....");
		System.out.println(Testing.sum(2, 10));
	}
}
