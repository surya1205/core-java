/**
 * 
 */
package com.leo.entity;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * @author abatta
 *
 */
@XmlRootElement(name = "UpdateContactInfo_IN")
//@JsonIgnoreProperties(ignoreUnknown=true)
public class UpdateContactInfo_IN {

	private String ccn;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String zipcode;
	private String phoneNumber;
	private String securityToken;
	
	/**
	 * 
	 */
	public UpdateContactInfo_IN() {
	}

	/**
	 * @param ccn
	 * @param address1
	 * @param address2
	 * @param city
	 * @param state
	 * @param zipcode
	 * @param phoneNumber
	 * @param securityToken
	 */
	public UpdateContactInfo_IN(String ccn, String address1, String address2,
			String city, String state, String zipcode, String phoneNumber,
			String securityToken) {
		super();
		this.ccn = ccn;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.phoneNumber = phoneNumber;
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
	 * @return the address1
	 */
	public String getAddress1() {
		return address1;
	}

	/**
	 * @param address1 the address1 to set
	 */
	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	/**
	 * @return the address2
	 */
	public String getAddress2() {
		return address2;
	}

	/**
	 * @param address2 the address2 to set
	 */
	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the zipcode
	 */
	public String getZipcode() {
		return zipcode;
	}

	/**
	 * @param zipcode the zipcode to set
	 */
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
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
