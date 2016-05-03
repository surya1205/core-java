package com.pmusa.orderHistory.vo;

import java.util.Date;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.leo.entity.CustomDateSerializer;

public class DummyVO {

	String name;
	Date date;
	
	
	/**
	 * @return the name
	 */
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
	 * @return the date
	 */
	@JsonSerialize(using=CustomDateSerializer.class)
	public Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	
}
