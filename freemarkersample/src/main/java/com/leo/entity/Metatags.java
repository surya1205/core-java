/**
 * 
 */
package com.leo.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * @author abatta
 *
 */
public class Metatags 
{
	private Metatag [] metatag;
	
	/**
	 * 
	 */
	public Metatags() 
	{
	}

	/**
	 * @param metatag
	 */
	public Metatags(Metatag[] metatag) {
		super();
		this.metatag = metatag;
	}

	/**
	 * @return the metatag
	 */
	public Metatag[] getMetatag() {
		return metatag;
	}

	/**
	 * @param metatag the metatag to set
	 */
	public void setMetatag(Metatag[] metatag) {
		this.metatag = metatag;
	}
	
}
