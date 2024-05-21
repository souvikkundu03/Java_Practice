package NewPackage2;

class Soumyajit extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {

			System.out.println(
					"Paul..." + Thread.currentThread().getName() + "  " + Thread.currentThread().getPriority());

		}
	}
	
}

class Akash extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {

			System.out.println(
					"Akash..." + Thread.currentThread().getName() + "  " + Thread.currentThread().getPriority());

		}
	}
}

public class Souvik {

	public static void main(String[] args) {

		Soumyajit paul = new Soumyajit();
		Akash akash = new Akash();
//		Souvik souvik = new Souvik();
		
		paul.setName("Paul");
		akash.setName("Akash");
		Thread.currentThread().setName("Kundu");
		
		
		paul.start();
		
		try {
			paul.join();
		} 
		catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		akash.start();
		try {
			akash.join();
		} 
		catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		for (int i = 0; i < 5; i++) {

			System.out.println(
					"Souvik..." + Thread.currentThread().getName() + "  " + Thread.currentThread().getPriority());

		}

	}

}
