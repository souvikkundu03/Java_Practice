package NewPackage2;

interface A {
	default void add() {
		System.out.println("Method in A");
	}
}

interface B {
	default void sub() {
		System.out.println("Method in B");
	}
}

public class MultipleInheritance implements A, B {


	public static void main(String[] args) {
		MultipleInheritance obj = new MultipleInheritance();

		obj.add();
		obj.sub();

	}

}
