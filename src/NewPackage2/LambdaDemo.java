package NewPackage2;

interface Lambda {
	int AddOrSubtract(int a, int b);
}

public class LambdaDemo {
	int AddOrSubtract() {
		return 0;
		
	}

	public static void main(String[] args) {
		Lambda e = (a, b) ->  {return (a % 2 == 0) ? a + b : a - b;};
		System.out.println(e.AddOrSubtract(4, 8));
	}

}
//proof that multiple inheritance is possible in java