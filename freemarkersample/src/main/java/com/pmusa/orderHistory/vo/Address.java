package com.pmusa.orderHistory.vo;

import java.math.BigDecimal;
import java.util.Arrays;

/**
 * @author skandagatla
 *
 */
public class Address  {
	protected String _systemAddressId;
	protected String _line1;
	protected String _line2;
	protected String _line3;
	protected String _blockCode;
	protected String _countyCode;
	protected String _poBox;
	protected String _cityName;
	protected String _countryCode;
	protected String _countryName;
	protected String _geoCode;
	protected BigDecimal _latitude;
	protected BigDecimal _longitude;
	protected String _postalCode;
	protected String _postalCodePlus4;
	protected boolean _standardized;
	protected String _stateProvinceAbbrev;
	protected String _stateProvinceName;
	protected String _createdBy;
	protected String _updatedBy;
	protected boolean _isPrimary;
	protected String _addressType;
	protected String _privateMailbox;
	protected String _mailStopCode;
	protected long _householdId;
	protected String _urbanization;

	/**
	 * Gets the value of the standardized property.
	 */
	public boolean isStandardized() {
		return this._standardized;
	}

	/**
	 * Gets the value of the isPrimary property.
	 */
	public boolean isIsPrimary() {
		return this._isPrimary;
	}

	public void setSystemAddressId(String aSystemAddressId) {
		this._systemAddressId = aSystemAddressId;
	}

	public String getSystemAddressId() {
		return this._systemAddressId;
	}

	public void setLine1(String aLine1) {
		this._line1 = aLine1;
	}

	public String getLine1() {
		return this._line1;
	}

	public void setLine2(String aLine2) {
		this._line2 = aLine2;
	}

	public String getLine2() {
		return this._line2;
	}

	public void setLine3(String aLine3) {
		this._line3 = aLine3;
	}

	public String getLine3() {
		return this._line3;
	}

	public void setBlockCode(String aBlockCode) {
		this._blockCode = aBlockCode;
	}

	public String getBlockCode() {
		return this._blockCode;
	}

	public void setCountyCode(String aCountyCode) {
		this._countyCode = aCountyCode;
	}

	public String getCountyCode() {
		return this._countyCode;
	}

	public void setPoBox(String aPoBox) {
		this._poBox = aPoBox;
	}

	public String getPoBox() {
		return this._poBox;
	}

	public void setCityName(String aCityName) {
		this._cityName = aCityName;
	}

	public String getCityName() {
		return this._cityName;
	}

	public void setCountryCode(String aCountryCode) {
		this._countryCode = aCountryCode;
	}

	public String getCountryCode() {
		return this._countryCode;
	}

	public void setCountryName(String aCountryName) {
		this._countryName = aCountryName;
	}

	public String getCountryName() {
		return this._countryName;
	}

	public void setGeoCode(String aGeoCode) {
		this._geoCode = aGeoCode;
	}

	public String getGeoCode() {
		return this._geoCode;
	}

	public void setLatitude(BigDecimal aLatitude) {
		this._latitude = aLatitude;
	}

	public BigDecimal getLatitude() {
		return this._latitude;
	}

	public void setLongitude(BigDecimal aLongitude) {
		this._longitude = aLongitude;
	}

	public BigDecimal getLongitude() {
		return this._longitude;
	}

	public void setPostalCode(String aPostalCode) {
		this._postalCode = aPostalCode;
	}

	public String getPostalCode() {
		return this._postalCode;
	}

	public void setPostalCodePlus4(String aPostalCodePlus4) {
		this._postalCodePlus4 = aPostalCodePlus4;
	}

	public String getPostalCodePlus4() {
		return this._postalCodePlus4;
	}

	public void setStandardized(boolean aStandardized) {
		this._standardized = aStandardized;
	}

	public void setStateProvinceAbbrev(String aStateProvinceAbbrev) {
		this._stateProvinceAbbrev = aStateProvinceAbbrev;
	}

	public String getStateProvinceAbbrev() {
		return this._stateProvinceAbbrev;
	}

	public void setStateProvinceName(String aStateProvinceName) {
		this._stateProvinceName = aStateProvinceName;
	}

	public String getStateProvinceName() {
		return this._stateProvinceName;
	}

	public void setCreatedBy(String aCreatedBy) {
		this._createdBy = aCreatedBy;
	}

	public String getCreatedBy() {
		return this._createdBy;
	}

	public void setUpdatedBy(String aUpdatedBy) {
		this._updatedBy = aUpdatedBy;
	}

	public String getUpdatedBy() {
		return this._updatedBy;
	}


	public void setIsPrimary(boolean aIsPrimary) {
		this._isPrimary = aIsPrimary;
	}

	
	/**
	 * @return the _addressType
	 */
	public String get_addressType() {
		return _addressType;
	}

	/**
	 * @param addressType the _addressType to set
	 */
	public void set_addressType(String addressType) {
		_addressType = addressType;
	}

	public void setPrivateMailbox(String aPrivateMailbox) {
		this._privateMailbox = aPrivateMailbox;
	}

	public String getPrivateMailbox() {
		return this._privateMailbox;
	}

	public void setMailStopCode(String aMailStopCode) {
		this._mailStopCode = aMailStopCode;
	}

	public String getMailStopCode() {
		return this._mailStopCode;
	}

	public void setHouseholdId(long aHouseholdId) {
		this._householdId = aHouseholdId;
	}

	public long getHouseholdId() {
		return this._householdId;
	}

	public void setUrbanization(String aUrbanization) {
		this._urbanization = aUrbanization;
	}

	public String getUrbanization() {
		return this._urbanization;
	}
	
	
}