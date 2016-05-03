/**
 * 
 */
package com.leo.entity;

import javax.xml.bind.annotation.XmlRootElement;


/**
 * @author abatta
 *
 */
@XmlRootElement(name = "UpdateEmail_OUT")
public class UpdateEmail_OUT {

	private int showDOI;
	private String responseCode;
	private String responseMessage;
	private String securityToken;
	private Errors errors;
	
	/**
	 * 
	 */
	public UpdateEmail_OUT() {
	}

	/**
	 * @param showDOI
	 * @param responseCode
	 * @param responseMessage
	 * @param securityToken
	 * @param errors
	 */
	public UpdateEmail_OUT(int showDOI, String responseCode,
			String responseMessage, String securityToken, Errors errors) {
		super();
		this.showDOI = showDOI;
		this.responseCode = responseCode;
		this.responseMessage = responseMessage;
		this.securityToken = securityToken;
		this.errors = errors;
	}

	/**
	 * @return the showDOI
	 */
	public int getShowDOI() {
		return showDOI;
	}

	/**
	 * @param showDOI the showDOI to set
	 */
	public void setShowDOI(int showDOI) {
		this.showDOI = showDOI;
	}

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
