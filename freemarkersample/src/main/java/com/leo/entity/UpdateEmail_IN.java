/**
 * 
 */
package com.leo.entity;

import javax.xml.bind.annotation.XmlRootElement;


/**
 * @author abatta
 *
 */
@XmlRootElement(name = "UpdateEmail_IN")
public class UpdateEmail_IN {

	private String ccn;
	private String emailAddress;
	private Subscription subscription;
	private String securityToken;
	
	/**
	 * 
	 */
	public UpdateEmail_IN() {
	}

	/**
	 * @param ccn
	 * @param emailAddress
	 * @param subscription
	 * @param securityToken
	 */
	public UpdateEmail_IN(String ccn, String emailAddress,
			Subscription subscription, String securityToken) {
		super();
		this.ccn = ccn;
		this.emailAddress = emailAddress;
		this.subscription = subscription;
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
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * @param emailAddress the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
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
	 * @return the subscription
	 */
	public Subscription getSubscription() {
		return subscription;
	}

	/**
	 * @param subscription the subscription to set
	 */
	public void setSubscription(Subscription subscription) {
		this.subscription = subscription;
	}

}
