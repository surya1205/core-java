package com.leo.cache;

import com.pmusa.core.constants.BaseCodes;
import com.pmusa.core.constants.BaseConstants;



/**
 * @author skandagatla
 *
 */
public class CoreException extends Exception
{
	public CoreException(){
		super();
	}
	
	/**
	 * code
	 */
	private String code = BaseCodes.CODE_WEBSERVICE_ERROR;
	/**
	 * codeMessage
	 */

	private String codeMessage = BaseConstants.MESSAGE_WEBSERVICE_ERROR;

	/**
	 * 
	 */
	private static final long serialVersionUID = 6749371352020069717L;

	public CoreException(String code)
	{
		this.code = code;
	}

	/**
	 * Create and initialize with cause.
	 * 
	 * @param cause
	 *            nested cause.
	 */
	public CoreException(String code,String msg, Throwable cause)
	{
		super(msg, cause);
		this.code = code;
	}

	/**
	 * @param code
	 * @param codeMessage
	 */
	public CoreException(String code, String codeMessage)
	{
		super(codeMessage);
		this.code = code;
		this.codeMessage = codeMessage;
	}
	
	
	
	/**
	 * @param cause
	 */
	public CoreException(String code,Throwable cause)
	{
		super(cause);
		this.code = code;
	}

	/**
	 * Return the detail message, including the message from the nested exception if there is one.
	 */
	public String getChainedMessage()
	{
		return "";
	}

	/**
	 * @return the code
	 */
	public String getCode()
	{
		return code;
	}

	/**
	 * @param code
	 *            the code to set
	 */
	public void setCode(String code)
	{
		this.code = code;
	}

	/**
	 * @return the codeMessage
	 */
	public String getCodeMessage()
	{
		return codeMessage;
	}

	/**
	 * @param codeMessage
	 *            the codeMessage to set
	 */
	public void setCodeMessage(String codeMessage)
	{
		this.codeMessage = codeMessage;
	}

}
