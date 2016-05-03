package atomic;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/**
*
* @author chintanpa
* 
*/
public class TestSynchronizedCounter
{

	public static void main(String[] args) throws InterruptedException
	{
		
		ThreadPoolExecutor service = (ThreadPoolExecutor) Executors.newCachedThreadPool();
		service.setCorePoolSize(30);
		service.prestartCoreThread();
		for(int i = 0 ;i<10000;i++){
			service.submit(new Runnable(){
				public void run(){
					SynchronizedCounter.increment();
				}
			});
		}
		service.awaitTermination(2, TimeUnit.SECONDS);
		System.out.println("count is : "+SynchronizedCounter.getCount());
	}
}
