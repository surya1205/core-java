import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Assignment-3 : Create a HashMap for books & no.of pages.
 Display contents of Map using iterator. (Where Book is a class)?
 (Override equals() & hashCode() in book class. .note:equals/ hashcode 
 contract should not be violated)
 * Date: 19/7/12
 */
public class DispHashmap {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		HashMap bookmap = new HashMap();
		bookmap.put("Forest Gump", 268);
		bookmap.put("The Monk who sold his ferrari", 154);
		bookmap.put("It's not only about Bike", 310);
		bookmap.put("My Experiments with Truth", 245);
		bookmap.put("The Bhagwad Geeta", 660);
		bookmap.put("The Murder on Orient Express", 345);
		bookmap.put("Mysterious Island", 348);
		bookmap.put("Blood, Sweat and Tears", 586);
		bookmap.put("The Alchemist", 300);
		bookmap.put("Mousetrap", new Integer(554));
		bookmap.put("The Alchemist", 300);
		

		Set setmap = bookmap.entrySet();
		Iterator i = setmap.iterator();

		while (i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();
			System.out.println(me.getKey() + " :" + me.getValue());
		}

	}

}

class Book {
	String bookname;
	int nopage;

	Book(String bname, int npage) {
		this.bookname = bname;
		this.nopage = npage;
	}

}
