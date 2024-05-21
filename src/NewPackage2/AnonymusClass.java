package NewPackage2;

interface Drawable {
	public static final Drawable d = null;

	default void abc() {
		draw(d);
	}

	private void draw(Drawable d) {
		System.out.println("fhf");
	}
}

public class AnonymusClass implements Drawable {

	public static void main(String[] args) {
		Drawable d = new Drawable() {
			@SuppressWarnings("unused")
			public void draw(Drawable d) {
				System.out.println("Drawing: " + d.getClass().getName());
			}
		};
		d.abc();
		

	}

}
