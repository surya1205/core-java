/**
 * 
 */
package com.leo.cache;


/**
 * @author skhatikar
 */
public class AtlasBusinessException extends CoreException
{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -6121852214476827568L;
	
	
	public AtlasBusinessException(String code)
	{
		super(code);
	}
	
	

	/**
	 * @param msg
	 * @param cause
	 */
	public AtlasBusinessException(String code,String msg, Throwable cause)
	{
		super(code,msg, cause);
	}

	/**
	 * @param msg
	 */
	public AtlasBusinessException(String code,String msg)
	{
		super(code,msg);
	}
	
	/**
	 * @param cause
	 */
	public AtlasBusinessException(String code,Throwable cause)
	{
		super(code,cause);
	}

}
