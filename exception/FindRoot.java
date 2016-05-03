/*
 * Topic: Java Exception handling.
 * Assignment-1: Create a NegativeNumberException to be thrown by the method
                 findSqrRoot() if user enters a negative number.
 * Date: 17/7/12
 */

import java.util.Scanner;

public class FindRoot {
	static int number;
	public static void main(String[] args) throws NegativeNumberException {
		Scanner in = new Scanner(System.in);
		do{
		System.out.println("Enter any positive number for finding squar-root: ");
		System.out.println("press '0' stop.");
		number = in.nextInt();
		FindRoot num = new FindRoot();
		num.findSqrRoot(number);
		}while(number=='#');
	}

	public void findSqrRoot(int number) throws NegativeNumberException {
		try {
			if (number > 0)
				System.out.println("Squre root is: "+Math.sqrt(number));
			else
				throw new NegativeNumberException();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

@SuppressWarnings("serial")
class NegativeNumberException extends Exception {
	public String toString() {
		return "NEGATIVE NUMBER... PLEASE ENTER POSITIVE";
	}
}
