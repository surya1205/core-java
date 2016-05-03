/**
 * LikeVO used for Rest service call related to like action.
 */
package com.leo.freemarkersample;

/**
 * 
 * @author iCrossing
 *
 */
public class LikeVO {

	private String id;
	private String ccn;
	private String securityToken;
	
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
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
