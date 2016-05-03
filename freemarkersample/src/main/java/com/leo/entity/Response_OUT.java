/**
 * Generic Response object used as return type for Rest service call. 
 */
package com.leo.entity;



/**
 * @author iCrossing
 *
 */
public class Response_OUT {
	
	String responseCode;
	String responseMessage;
	String securityToken;
	Errors errors;
	
	/**
	 * @return the responseCode
	 */
	public String getResponseCode() {
		return responseCode;
	}
	/**
	 * @param responseCode the responseCode to set
	 */
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	/**
	 * @return the responseMessage
	 */
	public String getResponseMessage() {
		return responseMessage;
	}
	/**
	 * @param responseMessage the responseMessage to set
	 */
	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}
	/**
	 * @return the securityToken
	 */
	public String getSecurityToken() {
		return securityToken;
	}
	/**
	 * @param securityToken the securityToken to set
	 */
	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
	}
	/**
	 * @return the errors
	 */
	public Errors getErrors() {
		return errors;
	}
	/**
	 * @param errors the errors to set
	 */
	public void setErrors(Errors errors) {
		this.errors = errors;
	}
	
}
