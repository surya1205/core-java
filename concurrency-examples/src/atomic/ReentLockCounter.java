package atomic;

import java.util.concurrent.locks.ReentrantReadWriteLock;
/**
*
* @author chintanpa
* 
*/
public class ReentLockCounter
{

	private static long count = 0;
	private static ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

	public static void increment()
	{
		lock.writeLock().lock();
		count++;
		lock.writeLock().unlock();
	}

	public static long getCount() throws InterruptedException
	{
		try
		{
			lock.readLock().lock();
			return count;
		}
		finally
		{
			lock.readLock().unlock();
		}
	}

}
