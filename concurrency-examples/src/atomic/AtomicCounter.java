package atomic;

import java.util.concurrent.atomic.AtomicLong;

/**
*
* @author chintanpa
* 
*/
public class AtomicCounter
{
	
	private static AtomicLong count=new AtomicLong(0);
	
	public static void increment(){
		count.incrementAndGet();
	}
	
	public static long getCount(){
		return count.get();
	}
	
}
