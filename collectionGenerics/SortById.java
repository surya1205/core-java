import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * Date: 19/7/12
 * Assignment-1: Create a sorted set of Employee objects.(Sort on Emp ID)
 */
public class SortById {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) throws IOException {
		Util u = new Util();

		List listEmp = u.getEmployee();
		char choice;
		do {
			System.out.println("1 for sort by ID");
			System.out.println("2 for Sort by NAME.");
			System.out.println("3 for exit.");
			choice = (char) System.in.read();
			switch (choice) {
			case '1': {
				Collections.sort(listEmp);
				printList(listEmp);
				break;
			}
			case '2': {
				Collections.sort(listEmp, new SortByEmpName());
				printList(listEmp);
				break;
			}
			case '3': {
				System.out.println("Thank you.....");
				break;
			}
			}
		} while (choice < '1' || choice > '3');

	}

	public static void printList(List<SortEmp> list) {
		System.out.println("Id\tEmp name");
		for (SortEmp e : list) {
			System.out.println(e.getEmpId() + "\t" + e.getEmpName());
		}
	}
}

class Util {

	public List<SortEmp> getEmployee() {
		List<SortEmp> listEmp = new ArrayList<SortEmp>();
		listEmp.add(new SortEmp(29, "Micheal"));
		listEmp.add(new SortEmp(15, "T-Bag"));
		listEmp.add(new SortEmp(18, "Lincon"));
		listEmp.add(new SortEmp(91, "Brad"));
		listEmp.add(new SortEmp(5, "Sucre"));
		listEmp.add(new SortEmp(65, "D.B.Cooper"));
		listEmp.add(new SortEmp(58, "C.J"));

		return listEmp;
	}
}

class SortEmp implements Comparable<SortEmp>, Comparator<SortEmp> {
	int empid;
	String empname;

	SortEmp(int id, String name) {
		this.empid = id;
		this.empname = name;
	}

	public int getEmpId() {
		return empid;
	}

	public String getEmpName() {
		return empname;
	}

	public int compareTo(SortEmp emp) {
		return this.empid - emp.empid;
	}

	public int compare(SortEmp emp1, SortEmp emp2) {
		return empid;

	}

}

// overrides compare method
class SortByEmpName implements Comparator<SortEmp> {

	public int compare(SortEmp o1, SortEmp o2) {
		return o1.getEmpName().compareTo(o2.getEmpName());
	}
}
