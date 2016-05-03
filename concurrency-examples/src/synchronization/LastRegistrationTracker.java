package synchronization;

/**
*
* @author chintanpa
* 
*/
public class LastRegistrationTracker
{
	private static long id;
	private static String name;
	
	public static void register(long identifier, String nameStr){
		id = identifier;
		name = nameStr;
		
	}
	
	public static void showLastRegistration(){
		System.out.println(id+":"+name);
		
	}
	

}
