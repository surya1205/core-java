package map;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/**
*
* @author chintanpa
* 
*/
public class ConcReferrerCounter implements ReferrerCounter
{

	private ConcurrentHashMap<String, AtomicLong> referrerCounterMap = new ConcurrentHashMap<String, AtomicLong>(30);

	public void add(String referrer)
	{
		referrerCounterMap.putIfAbsent(referrer, new AtomicLong(0));
		referrerCounterMap.get(referrer).incrementAndGet();
	}

	public Long get(String referrer)
	{
		return referrerCounterMap.get(referrer).get();
	}
	
}
