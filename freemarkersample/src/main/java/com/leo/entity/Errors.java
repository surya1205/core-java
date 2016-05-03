/**
 * 
 */
package com.leo.entity;

/**
 * @author abatta
 *
 */
public class Errors
{
	private Error [] error;
	
	/**
	 * 
	 */
	public Errors() 
	{
	}

	/**
	 * @param error
	 */
	public Errors(Error[] error) {
		super();
		this.error = error;
	}

	/**
	 * @return the error
	 */
	public Error[] getError() {
		return error;
	}

	/**
	 * @param error the error to set
	 */
	public void setError(Error[] error) {
		this.error = error;
	}

}
