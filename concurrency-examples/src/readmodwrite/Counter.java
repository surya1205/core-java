package readmodwrite;


/**
*
* @author chintanpa
* 
*/
public class Counter
{
	
	private static volatile long count=0;
	
	public static void increment(){
		count++;
	}
	
	public static long getCount(){
		return count;
	}
	
}
