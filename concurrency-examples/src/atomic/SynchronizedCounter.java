package atomic;

/**
 *
 * @author chintanpa
 * 
 */
public class SynchronizedCounter
{
	
	private static long count=0;
	
	public static synchronized void increment(){
		count++;
	}
	
	public static synchronized long getCount() throws InterruptedException{
		return count;
	}
	
}
