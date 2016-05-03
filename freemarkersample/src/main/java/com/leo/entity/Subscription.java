/**
 * 
 */
package com.leo.entity;

/**
 * @author abatta
 *
 */
public class Subscription {

	private String subscriptionID;
	private int subscriptionStatus;
	private String templateType;
	
	/**
	 * 
	 */
	public Subscription() {
	}

	/**
	 * @param subscriptionID
	 * @param subscriptionStatus
	 * @param templateType
	 */
	public Subscription(String subscriptionID, int subscriptionStatus,
			String templateType) {
		super();
		this.subscriptionID = subscriptionID;
		this.subscriptionStatus = subscriptionStatus;
		this.templateType = templateType;
	}

	/**
	 * @return the subscriptionID
	 */
	public String getSubscriptionID() {
		return subscriptionID;
	}

	/**
	 * @param subscriptionID the subscriptionID to set
	 */
	public void setSubscriptionID(String subscriptionID) {
		this.subscriptionID = subscriptionID;
	}

	/**
	 * @return the subscriptionStatus
	 */
	public int getSubscriptionStatus() {
		return subscriptionStatus;
	}

	/**
	 * @param subscriptionStatus the subscriptionStatus to set
	 */
	public void setSubscriptionStatus(int subscriptionStatus) {
		this.subscriptionStatus = subscriptionStatus;
	}

	/**
	 * @return the templateType
	 */
	public String getTemplateType() {
		return templateType;
	}

	/**
	 * @param templateType the templateType to set
	 */
	public void setTemplateType(String templateType) {
		this.templateType = templateType;
	}

}
