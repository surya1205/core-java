package resourcepool;

/**
 * 
 * @author chintanpa
 * 
 */
public interface ExpensiveObjectFactory
{
	public ExpensiveObject acquireExpensiveObject();

	public void releaseExpensiveObject(ExpensiveObject expensiveObject);
}

class ExpensiveObject
{

}
