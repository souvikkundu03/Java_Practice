package NewPackage2;

import java.util.HashMap;
import java.util.Map;

class MapEntry{
	
	static Map<String, Integer> cart = new HashMap<>();

	/**
	 * @return the cart
	 */
	public Map<String, Integer> getCart() {
		return cart;
	}

	/**
	 * @param cart the cart to set
	 */
	public void setCart(Map<String, Integer> cart) {
		this.cart = cart;
	}
	public static Map<String, Integer> getInstance(){
		
		return cart;
		
	}
}

class Customer extends Thread {

	private String name;
	private Integer quantity;
	

	/**
	 * @return the priority
	 */
	public String getCustomerName() {
		return name;
	}

	/**
	 * @param priority the priority to set
	 */
	public void setCustomerName(String name) {
		this.name = name;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public static String runner(Map<String, Integer> cart) {

		String maxKey = cart.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse(null);

		return maxKey;

	}
	
	Map<String, Integer> cartOfCustomers = MapEntry.getInstance();
	
	public void run() {
	

		cartOfCustomers.put(Thread.currentThread().getName(), this.quantity);

//		System.out.println(cart);
		
		String maxkey = Customer.runner(cartOfCustomers);
		
		if(this.quantity.equals(cartOfCustomers.get(maxkey))) {
			Thread.yield();
			
			System.out.println(Thread.currentThread().getName() + "\tStop");
		}
		
//		System.out.println(Thread.currentThread().getName());
	}
}

public class YieldExample {

	public static void main(String[] args) throws InterruptedException {

		Customer soumya = new Customer();
		Customer souvik = new Customer();
		Customer akash = new Customer();

		soumya.setName("Soumyajit");
		souvik.setName("Souvik");
		akash.setName("Akash");

		soumya.start();
		soumya.setCustomerName("Soumyajit");
//		soumya.setPriority(10);
		soumya.setQuantity(10);
//		soumya.join();

		souvik.start();
		souvik.setCustomerName("Souvik");
		souvik.setQuantity(2);
//		souvik.join();

		akash.start();
		akash.setCustomerName("Akash");

		akash.setQuantity(10);
//		akash.join();

//		Customer greatest =	Customer.runner(soumya, souvik, akash);

	}

}
