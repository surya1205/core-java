package immutable;

/**
*
* @author chintanpa
* 
*/
public class Room implements Cloneable
{

	private int roomNo;

	public int getRoomNo()
	{
		return roomNo;
	}

	public void setRoomNo(int roomNo)
	{
		this.roomNo = roomNo;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
}
