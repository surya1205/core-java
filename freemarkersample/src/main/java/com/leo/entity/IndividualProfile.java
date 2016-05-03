/**
 * IndividualProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.leo.entity;

public class IndividualProfile  implements java.io.Serializable {
    private int PMUSASubscribed;

    private java.lang.String address1;

    private java.lang.String address2;

    private java.lang.String city;

    private java.lang.String dateOfBirth;

    private int doubleOptedIn;

    private java.lang.String emailAddress;

    private java.lang.String firstName;

    private java.lang.String lastName;

    private int marlboroSubscribed;

    private java.lang.String middleInitial;

    private java.lang.String phoneNumber;

    private int securityQuestion;

    private java.lang.String state;

    private java.lang.String suffix;

    private java.lang.String title;

    private java.lang.String zipCode;
    
    private java.lang.String currentBrandCode;
    
    private java.lang.String lpaSegment;
    
    private int isContactable;
    
    private int isDeliverable;
    
    private int notContactableGlobalOptOff;
    
    private int historicalUnsubscribe;
    
    private int historicalInvalid;
    
    private String brandCreated ="0";
    
    private int isSweeps;
    
    private java.lang.String ccn;
    
    //responsdeCode and responeMessage added for superauthentication
    private String responseCode;

    private String responseMessage;
    
    private String loginID;
    
    private String winningCcn;
    
    private String [] retiredCcns;
    
	private String brandCCN;
    
	public IndividualProfile() {
    }

    public IndividualProfile(
           int PMUSASubscribed,
           java.lang.String address1,
           java.lang.String address2,
           java.lang.String city,
           java.lang.String dateOfBirth,
           int doubleOptedIn,
           java.lang.String emailAddress,
           java.lang.String firstName,
           java.lang.String lastName,
           int marlboroSubscribed,
           java.lang.String middleInitial,
           java.lang.String phoneNumber,
           int securityQuestion,
           java.lang.String state,
           java.lang.String suffix,
           java.lang.String title,
           java.lang.String zipCode,
           java.lang.String currentBrandCode,
           java.lang.String lpaSegment,
           int isContactable,
           int isDeliverable, 
           int notContactableGlobalOptOff,
           int historicalUnsubscribe,
           int historicalInvalid, int isSweeps,
           java.lang.String ccn,
           java.lang.String loginID,
           String winningCcn,
           String [] retiredCcns,
           String brandCCN) {
           this.PMUSASubscribed = PMUSASubscribed;
           this.address1 = address1;
           this.address2 = address2;
           this.city = city;
           this.dateOfBirth = dateOfBirth;
           this.doubleOptedIn = doubleOptedIn;
           this.emailAddress = emailAddress;
           this.firstName = firstName;
           this.lastName = lastName;
           this.marlboroSubscribed = marlboroSubscribed;
           this.middleInitial = middleInitial;
           this.phoneNumber = phoneNumber;
           this.securityQuestion = securityQuestion;
           this.state = state;
           this.suffix = suffix;
           this.title = title;
           this.zipCode = zipCode;
           this.currentBrandCode = currentBrandCode;
           this.lpaSegment = lpaSegment;
           this.isContactable=isContactable;
           this.isDeliverable=isDeliverable;
           this.notContactableGlobalOptOff = notContactableGlobalOptOff;
           this.historicalInvalid = historicalInvalid;
           this.historicalUnsubscribe = historicalUnsubscribe;
           this.isSweeps = isSweeps;
           this.ccn = ccn;
           this.loginID = loginID;
           this.winningCcn = winningCcn;
           this.retiredCcns = retiredCcns;
           this.brandCCN = brandCCN;
    }


    /**
     * Gets the PMUSASubscribed value for this IndividualProfile.
     * 
     * @return PMUSASubscribed
     */
    public int getPMUSASubscribed() {
        return PMUSASubscribed;
    }


    /**
     * Sets the PMUSASubscribed value for this IndividualProfile.
     * 
     * @param PMUSASubscribed
     */
    public void setPMUSASubscribed(int PMUSASubscribed) {
        this.PMUSASubscribed = PMUSASubscribed;
    }


    /**
     * Gets the address1 value for this IndividualProfile.
     * 
     * @return address1
     */
    public java.lang.String getAddress1() {
        return address1;
    }


    /**
     * Sets the address1 value for this IndividualProfile.
     * 
     * @param address1
     */
    public void setAddress1(java.lang.String address1) {
        this.address1 = address1;
    }


    /**
     * Gets the address2 value for this IndividualProfile.
     * 
     * @return address2
     */
    public java.lang.String getAddress2() {
        return address2;
    }


    /**
     * Sets the address2 value for this IndividualProfile.
     * 
     * @param address2
     */
    public void setAddress2(java.lang.String address2) {
        this.address2 = address2;
    }


    /**
     * Gets the city value for this IndividualProfile.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this IndividualProfile.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the dateOfBirth value for this IndividualProfile.
     * 
     * @return dateOfBirth
     */
    public java.lang.String getDateOfBirth() {
        return dateOfBirth;
    }


    /**
     * Sets the dateOfBirth value for this IndividualProfile.
     * 
     * @param dateOfBirth
     */
    public void setDateOfBirth(java.lang.String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    /**
     * Gets the doubleOptedIn value for this IndividualProfile.
     * 
     * @return doubleOptedIn
     */
    public int getDoubleOptedIn() {
        return doubleOptedIn;
    }


    /**
     * Sets the doubleOptedIn value for this IndividualProfile.
     * 
     * @param doubleOptedIn
     */
    public void setDoubleOptedIn(int doubleOptedIn) {
        this.doubleOptedIn = doubleOptedIn;
    }


    /**
     * Gets the emailAddress value for this IndividualProfile.
     * 
     * @return emailAddress
     */
    public java.lang.String getEmailAddress() {
        return emailAddress;
    }


    /**
     * Sets the emailAddress value for this IndividualProfile.
     * 
     * @param emailAddress
     */
    public void setEmailAddress(java.lang.String emailAddress) {
        this.emailAddress = emailAddress;
    }


    /**
     * Gets the firstName value for this IndividualProfile.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this IndividualProfile.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the lastName value for this IndividualProfile.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this IndividualProfile.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the marlboroSubscribed value for this IndividualProfile.
     * 
     * @return marlboroSubscribed
     */
    public int getMarlboroSubscribed() {
        return marlboroSubscribed;
    }


    /**
     * Sets the marlboroSubscribed value for this IndividualProfile.
     * 
     * @param marlboroSubscribed
     */
    public void setMarlboroSubscribed(int marlboroSubscribed) {
        this.marlboroSubscribed = marlboroSubscribed;
    }


    /**
     * Gets the middleInitial value for this IndividualProfile.
     * 
     * @return middleInitial
     */
    public java.lang.String getMiddleInitial() {
        return middleInitial;
    }


    /**
     * Sets the middleInitial value for this IndividualProfile.
     * 
     * @param middleInitial
     */
    public void setMiddleInitial(java.lang.String middleInitial) {
        this.middleInitial = middleInitial;
    }


    /**
     * Gets the phoneNumber value for this IndividualProfile.
     * 
     * @return phoneNumber
     */
    public java.lang.String getPhoneNumber() {
        return phoneNumber;
    }


    /**
     * Sets the phoneNumber value for this IndividualProfile.
     * 
     * @param phoneNumber
     */
    public void setPhoneNumber(java.lang.String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    /**
     * Gets the securityQuestion value for this IndividualProfile.
     * 
     * @return securityQuestion
     */
    public int getSecurityQuestion() {
        return securityQuestion;
    }


    /**
     * Sets the securityQuestion value for this IndividualProfile.
     * 
     * @param securityQuestion
     */
    public void setSecurityQuestion(int securityQuestion) {
        this.securityQuestion = securityQuestion;
    }


    /**
     * Gets the state value for this IndividualProfile.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this IndividualProfile.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the suffix value for this IndividualProfile.
     * 
     * @return suffix
     */
    public java.lang.String getSuffix() {
        return suffix;
    }


    /**
     * Sets the suffix value for this IndividualProfile.
     * 
     * @param suffix
     */
    public void setSuffix(java.lang.String suffix) {
        this.suffix = suffix;
    }

    /**
     * Gets the title value for this IndividualProfile.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this IndividualProfile.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the zipCode value for this IndividualProfile.
     * 
     * @return zipCode
     */
    public java.lang.String getZipCode() {
        return zipCode;
    }


    /**
     * Sets the zipCode value for this IndividualProfile.
     * 
     * @param zipCode
     */
    public void setZipCode(java.lang.String zipCode) {
        this.zipCode = zipCode;
    }

	/**
	 * Gets the currentBrandCode value for this IndividualProfile.
	 * 
	 * @return currentBrandCode
	 */
	public java.lang.String getCurrentBrandCode() {
		return currentBrandCode;
	}

	/**
	 * Sets the currentBrandCode value for this IndividualProfile.
	 * 
	 * @param currentBrandCode
	 */
	public void setCurrentBrandCode(java.lang.String currentBrandCode) {
		this.currentBrandCode = currentBrandCode;
	}

	/**
	 * Gets the lpaSegment value for this IndividualProfile.
	 * 
	 * @return lpaSegment
	 */
	public java.lang.String getLpaSegment() {
		return lpaSegment;
	}

	/**
	 * Sets the lpaSegment value for this IndividualProfile.
	 * 
	 * @param lpaSegment
	 */
	public void setLpaSegment(java.lang.String lpaSegment) {
		this.lpaSegment = lpaSegment;
	}

	/**
	 * Gets whether the email address is contactable for this IndividualProfile.
	 * 
	 * @return the isContactable
	 */
	public int getIsContactable() {
		return isContactable;
	}

	/**
	 * Sets whether the email address is contactable for this IndividualProfile.
	 * 
	 * @param isContactable
	 */
	public void setIsContactable(int isContactable) {
		this.isContactable = isContactable;
	}

	/**
	 * Gets whether the email address is deliverable for this IndividualProfile.
	 * 
	 * @return the isDeliverable
	 */
	public int getIsDeliverable() {
		return isDeliverable;
	}

	/**
	 * Sets whether the email address is deliverable for this IndividualProfile.
	 * 
	 * @param isDeliverable the isDeliverable to set
	 */
	public void setIsDeliverable(int isDeliverable) {
		this.isDeliverable = isDeliverable;
	}

	/**
	 * @return
	 */
	public int getNotContactableGlobalOptOff() {
		return notContactableGlobalOptOff;
	}

	/**
	 * @param notContactableGlobalOptOff
	 */
	public void setNotContactableGlobalOptOff(int notContactableGlobalOptOff) {
		this.notContactableGlobalOptOff = notContactableGlobalOptOff;
	}

	/**
	 * @return
	 */
	public int getHistoricalUnsubscribe() {
		return historicalUnsubscribe;
	}

	/**
	 * @param historicalUnsubscribe
	 */
	public void setHistoricalUnsubscribe(int historicalUnsubscribe) {
		this.historicalUnsubscribe = historicalUnsubscribe;
	}

	/**
	 * @return
	 */
	public int getHistoricalInvalid() {
		return historicalInvalid;
	}

	/**
	 * @param historicalInvalid
	 */
	public void setHistoricalInvalid(int historicalInvalid) {
		this.historicalInvalid = historicalInvalid;
	}
	
    /**
	 * @return the brandCreated
	 */
	public String getBrandCreated() {
		return brandCreated;
	}

	/**
	 * @param brandCreated the brandCreated to set
	 */
	public void setBrandCreated(String brandCreated) {
		this.brandCreated = brandCreated;
	}

	/**
	 * @return the isSweeps
	 */
	public int getIsSweeps() {
		return isSweeps;
	}

	/**
	 * @param isSweeps the isSweeps to set
	 */
	public void setIsSweeps(int isSweeps) {
		this.isSweeps = isSweeps;
	}

	/**
	 * @return the ccn
	 */
	public java.lang.String getCcn() {
		return ccn;
	}

	/**
	 * @param ccn the ccn to set
	 */
	public void setCcn(java.lang.String ccn) {
		this.ccn = ccn;
	}

	/**
	 * @return
	 */
	public String getResponseCode() {
		return responseCode;
	}

	/**
	 * @param responseCode
	 */
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	/**
	 * @return
	 */
	public String getResponseMessage() {
		return responseMessage;
	}

	/**
	 * @param responseMessage
	 */
	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

	/**
	 * @return the loginID
	 */
	public String getLoginID() {
		return loginID;
	}

	/**
	 * @param loginID the loginID to set
	 */
	public void setLoginID(String loginID) {
		this.loginID = loginID;
	}

	/**
	 * @return the winningCcn
	 */
	public String getWinningCcn() {
		return winningCcn;
	}

	/**
	 * @param winningCcn the winningCcn to set
	 */
	public void setWinningCcn(String winningCcn) {
		this.winningCcn = winningCcn;
	}

	/**
	 * @return the retiredCcns
	 */
	public String[] getRetiredCcns() {
		return retiredCcns;
	}

	/**
	 * @param retiredCcns the retiredCcns to set
	 */
	public void setRetiredCcns(String[] retiredCcns) {
		this.retiredCcns = retiredCcns;
	}
	
	public String getBrandCCN() {
		return brandCCN;
	}

	public void setBrandCCN(String brandCCN) {
		this.brandCCN = brandCCN;
	}

}
