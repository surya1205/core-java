package immutable;

/**
*
* @author chintanpa
* 
*/
public class ImmutableStudent
{
	final private long id;
	final private String name;

	public ImmutableStudent(long id, String name)
	{
		this.id = id;
		this.name = name;
	}

	public long getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

}
