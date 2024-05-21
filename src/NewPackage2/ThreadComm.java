package NewPackage2;

class BankAccount {

	private int balance = 10000;

	synchronized void withdraw(int amount) {

		if (this.balance < 5000) {
			System.out.println("Insufficient Balance...");
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		else {
			this.balance -= amount;
			System.out.println("After withdrawl, your current balance is: " + balance);
		}

	}

	synchronized void deposit(int amount) {
		this.balance += amount;
		System.out.println("Amount of " + amount + " is deposited. Current balance: " + balance);
		if (this.balance > 5000) {
			try {
				this.notify();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void checkBalance() {
		System.out.println("Your current balance is: " + this.balance);
	}

}

public class ThreadComm {

	public static void main(String[] args) {

		BankAccount acc = new BankAccount();
		new Thread();
		acc.checkBalance();
		new Thread() {
			public void run() {
				acc.withdraw(7000);
			}
		}.start();
		new Thread() {
			public void run() {
				acc.deposit(1998);
			}
		}.start();
		new Thread() {
			public void run() {
				acc.withdraw(2000);
			}
		}.start();
		
		new Thread() {
			public void run() {
				acc.deposit(1);
			}
		}.start();
		
		new Thread() {
			public void run() {
				acc.withdraw(1000);
			}
		}.start();
		acc.checkBalance();
	}

}
