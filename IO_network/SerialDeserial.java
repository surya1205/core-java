import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * Assignment-2 : Serialize & Deserialize Account object which will have
 a Date type of field : doc (date of creation)
 */

public class SerialDeserial {

	public static void main(String[] args) throws IOException,
			ClassNotFoundException {

		Account a = new Account(1021, "John", 2400F, new Date(12, 07, 2012));
		Account restore = null;
		a.display();
		char choice;
		System.out.println("press 1 for Serialize and 2 for Deserialize.");
		choice = (char) System.in.read();

		switch (choice) {
		case '1': {
			try {
				FileOutputStream fos = new FileOutputStream("E:emp.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(a);
				oos.close();
				fos.close();
				System.out.println("Object persisted...");
			} catch (IOException i) {
				i.printStackTrace();
			}
			break;
		}

		case '2': {
			try {
				FileInputStream fis = new FileInputStream("E:emp.txt");
				ObjectInputStream ois = new ObjectInputStream(fis);
				restore = (Account) ois.readObject();
				ois.close();
				fis.close();
				System.out.println("Object restored... Deserialized");
			} catch (IOException i) {
				i.printStackTrace();
			}
			restore.display();
			break;
		}

		}

	}
}

	@SuppressWarnings("serial")
	class Account implements java.io.Serializable {
		int accNum;
		String userName;
		float availBal;
		Date dateOfcreat;

		Account(int num, String name, float bal, Date doc) {
			this.accNum = num;
			this.userName = name;
			this.availBal = bal;
			this.dateOfcreat = doc;
		}

		public void display() {
			System.out.println("Hello " + userName + " your account number is "
					+ accNum + " and " + " balance is " + availBal + "$");
			dateOfcreat.disp();
		}
	}

	@SuppressWarnings("serial")
	class Date implements java.io.Serializable {
		int day;
		int month;
		int year;

		Date(int dd, int mm, int yy) {
			this.day = dd;
			this.month = mm;
			this.year = yy;
		}

		public void disp() {
			System.out.println("Account creation date is: " + day + "/" + month
					+ "/" + year);
		}
	}

