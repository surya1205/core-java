package com.leo.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

public class Metatag 
{
	private String id;
	private String name;
	private String value;
	
	/**
	 * 
	 */
	public Metatag() {
		super();
	}

	/**
	 * @param id
	 * @param name
	 * @param value
	 */
	public Metatag(String id, String name, String value) {
		super();
		this.id = id;
		this.name = name;
		this.value = value;
	}

	/**
	 * @return the id
	 */
	@XmlAttribute
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
	 * @return the name
	 */
	@XmlAttribute
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the value
	 */
	@XmlAttribute
	public String getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}	

}
