package NewPackage2;

class Rabbit extends Thread {

	public void run() {

		for (int i = 0; i < 5; i++) {

			System.out.println("Rabbit racing..." + Thread.currentThread().getName() + "  "
					+ Thread.currentThread().getPriority());

//			try {
//
//				Thread.sleep(1000);
//
//			} catch (InterruptedException e) {
//
//				e.printStackTrace();
//			}
			
		}
	}

}

public class Turtle {

	public static void main(String[] args) {

		Rabbit rabbit = new Rabbit();
		rabbit.start();
		rabbit.setName("Rabbit");
		rabbit.setPriority(1);
		Thread.currentThread().setName("Turtle");
		Thread.currentThread().setPriority(10);
		for (int i = 0; i < 5; i++) {

			System.out.println("Turtle racing..." + Thread.currentThread().getName() + "  "
					+ Thread.currentThread().getPriority());
//			try {
//
//				Thread.sleep(500);
//
//			} catch (InterruptedException e) {
//
//				e.printStackTrace();
//			}

		}

	}

}
