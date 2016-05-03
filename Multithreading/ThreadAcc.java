import java.io.IOException;
import java.util.Date;

/*
 * Assignment-1: Two members of a joint Account are trying to withdraw Rs.3000 
 *               from the account simultaneously & balance is Rs.5000.
 *               Create a multithreaded program to handle this situation
 *Date: 25/7/12
 */
public class ThreadAcc {

	public static void main(String[] args) throws IOException {
		Account accHolder1 = new Account(1020, "Bruce Willis", 5000F);
		accHolder1.thread1.start();
		accHolder1.thread2.start();
	}

}

class Account extends Thread {
	int accId;
	String custName;
	float accBal;
	float withdrawAmt = 3000F;
	float depositAmt = 0F;

	Account(int accNo, String name, float bal) {
		accId = accNo;
		custName = name;
		accBal = bal;
	}

	Thread thread1 = new Thread(this, "thread1");
	Thread thread2 = new Thread(this, "thread2");

	@Override
	public void run() {
		try {
			withdraw();
			displayStatment();
		} catch (InterruptedException e) {
			System.out.println("Thread inrrupted..!!");
		}

	}

	public synchronized void withdraw() throws InterruptedException {

		System.out.println("\n" + currentThread().getName() + " is running..");
		if (accBal > withdrawAmt) {
			accBal = accBal - withdrawAmt;
			currentThread();
			Thread.sleep(2000);
			System.out.println(currentThread().getName()
					+ ": You have withdraw " + withdrawAmt + "$");
			System.out.println(currentThread().getName()
					+ ": your current balance is: " + accBal + "$");
			System.out.println(currentThread().getName()
					+ ": Transaction complete");

		} else {
			System.out.println(currentThread().getName()
					+ ": You fool .. No Balance in your account");
			withdrawAmt = 0F;
		}

	}

	public synchronized void displayStatment() {
		Date currDate = new Date();
		if (accBal > withdrawAmt) {
			System.out.println(currentThread().getName());
			System.out
					.println("---------------------------------------------------");
			System.out.println("WELCOME " + custName);
			System.out.println(currDate + " WITHDRAW AMOUNT " + withdrawAmt
					+ "$");
			System.out
					.println(currDate + " DEPOSIT AMOUNT " + depositAmt + "$");
			System.out.println(currDate + " AVAILABLE BALANCE IS " + accBal
					+ "$");
			System.out
					.println("---------------------------------------------------");
		}
	}

}
