/**
 * 
 */
package com.leo.entity;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author abatta
 *
 */
@XmlRootElement(name = "UpdateSecurityInfo_IN")
public class UpdateSecurityInfo_IN {

	private String ccn;
	private String oldPassword;
	private String newPassword;
	private String securityQuestionID;
	private String securityQuestionAnswer;
	private String securityToken;
	
	/**
	 * 
	 */
	public UpdateSecurityInfo_IN() {
	}

	/**
	 * @param ccn
	 * @param oldPassword
	 * @param newPassword
	 * @param securityQuestionID
	 * @param securityQuestionAnswer
	 * @param securityToken
	 */
	public UpdateSecurityInfo_IN(String ccn, String oldPassword,
			String newPassword, String securityQuestionID,
			String securityQuestionAnswer, String securityToken) {
		super();
		this.ccn = ccn;
		this.oldPassword = oldPassword;
		this.newPassword = newPassword;
		this.securityQuestionID = securityQuestionID;
		this.securityQuestionAnswer = securityQuestionAnswer;
		this.securityToken = securityToken;
	}

	/**
	 * @return the ccn
	 */
	public String getCcn() {
		return ccn;
	}

	/**
	 * @param ccn the ccn to set
	 */
	public void setCcn(String ccn) {
		this.ccn = ccn;
	}

	/**
	 * @return the oldPassword
	 */
	public String getOldPassword() {
		return oldPassword;
	}

	/**
	 * @param oldPassword the oldPassword to set
	 */
	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}

	/**
	 * @return the newPassword
	 */
	public String getNewPassword() {
		return newPassword;
	}

	/**
	 * @param newPassword the newPassword to set
	 */
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	/**
	 * @return the securityQuestionID
	 */
	public String getSecurityQuestionID() {
		return securityQuestionID;
	}

	/**
	 * @param securityQuestionID the securityQuestionID to set
	 */
	public void setSecurityQuestionID(String securityQuestionID) {
		this.securityQuestionID = securityQuestionID;
	}

	/**
	 * @return the securityQuestionAnswer
	 */
	public String getSecurityQuestionAnswer() {
		return securityQuestionAnswer;
	}

	/**
	 * @param securityQuestionAnswer the securityQuestionAnswer to set
	 */
	public void setSecurityQuestionAnswer(String securityQuestionAnswer) {
		this.securityQuestionAnswer = securityQuestionAnswer;
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

}
