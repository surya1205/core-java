package synchronization;

/**
*
* @author chintanpa
* 
*/
public class LastRegistrationTrackerSynchronized
{
	private static long id;
	private static String name;
	
	public static synchronized void register(long identifier, String nameStr){
		id = identifier;
		name = nameStr;
	}
	
	public static synchronized void showLastRegistration(){
		System.out.print(id+":"+name);
	}

}
