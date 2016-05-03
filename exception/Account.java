/*
 * Topic: Java Exception 
 * Assignment-2: Create an InsufficientBalanceException to be thrown by withdraw() 
 * 				 method in Account class if amount to be withdrawn is greater than balance.
 * Date: 17/7/12
 */

import java.io.IOException;
import java.util.Scanner;

public class Account {
	int idGlobal;
	String nameGlobal;
	int balGlobal;

	Account(int id, String name, int bal) {
		idGlobal = id;
		this.nameGlobal = name;
		this.balGlobal = bal;
	}

	public static void main(String[] args) throws IOException {
		Account accArr[] = new Account[4];
		accArr[0] = new Account(1001, "Jason Stathem", 25000);
		accArr[1] = new Account(1002, "Tom cruise", 35000);
		accArr[2] = new Account(1003, "Jack Sparrow", 52000);
		accArr[3] = new Account(1004, "George Cloony", 25000);
		do {
			Scanner in = new Scanner(System.in);
			System.out.print("Please Enter your account number : ");
			int k = in.nextInt();

			for (int i = 0; i < accArr.length; i++) {
				if (accArr[i].idGlobal == k) {
					accArr[i].displayInfo();
					accArr[i].withdraw();
				}
			}
		} while (false);
	}

	public void withdraw() throws IOException {
		Scanner in = new Scanner(System.in);
		System.out.print("Please Enter withdarw amount : ");
		int withAmt = in.nextInt();
		try {
			if (withAmt < this.balGlobal) {
				this.balGlobal = this.balGlobal - withAmt;
				System.out.println("You withdraw " + withAmt
						+ "$ and balance is " + this.balGlobal + "$");
			} else
				throw new InsufficientBalanceException();
		}

		catch (InsufficientBalanceException e) {
			System.out.println("FIRST DEPOSIT THEN WITHDRAW !!!");
		}
	}

	public void displayInfo() {
		System.out.println(idGlobal + " Welcome Mr." + nameGlobal
				+ " ,your current balance is " + balGlobal + "$");
	}
}

@SuppressWarnings("serial")
class InsufficientBalanceException extends Exception {

	}

