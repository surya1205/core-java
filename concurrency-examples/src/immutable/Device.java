package immutable;


/**
*
* @author chintanpa
* 
*/
public final class Device
{
	private long id;
	private long name;
	private Room room;

	public Device(long id, long name, Room room)
	{

	}

	public long getId()
	{
		return id;
	}

	public long getName()
	{
		return name;
	}

	public Room getRoom()
	{
		try
		{
			return (Room) room.clone();
		}
		catch (CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
		return room;
	}
	
}
