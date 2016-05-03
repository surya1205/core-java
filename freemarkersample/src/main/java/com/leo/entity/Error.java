/**
 * 
 */
package com.leo.entity;

import javax.xml.bind.annotation.XmlAttribute;

/**
 * @author abatta
 *
 */
public class Error 
{
	private String field;
	private String code;
	private String message;
	
	/**
	 * 
	 */
	public Error() 
	{
	}

	/**
	 * @param field
	 * @param code
	 * @param message
	 */
	public Error(String field, String code, String message) {
		super();
		this.field = field;
		this.code = code;
		this.message = message;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the field
	 */
	@XmlAttribute
	public String getField() {
		return field;
	}

	/**
	 * @param field the field to set
	 */
	public void setField(String field) {
		this.field = field;
	}

}
