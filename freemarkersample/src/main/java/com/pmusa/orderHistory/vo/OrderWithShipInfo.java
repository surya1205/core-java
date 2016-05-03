package com.pmusa.orderHistory.vo;

import java.util.List;


public class OrderWithShipInfo {

	private String orderNumber;
	private String orderCreatedDate;
	private String orderStatus;
	private Address shipToAddress;
	private List<LineItemWithShipInfo> lineItems; 
	
	/**
	 * @return the orderNumber
	 */
	public String getOrderNumber() {
		return orderNumber;
	}
	/**
	 * @param orderNumber the orderNumber to set
	 */
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	/**
	 * @return the orderCreatedDate
	 */
	public String getOrderCreatedDate() {
		return orderCreatedDate;
	}
	/**
	 * @param orderCreatedDate the orderCreatedDate to set
	 */
	public void setOrderCreatedDate(String orderCreatedDate) {
		this.orderCreatedDate = orderCreatedDate;
	}
	/**
	 * @return the lineItems
	 */
	public List<LineItemWithShipInfo> getLineItems() {
		return lineItems;
	}
	/**
	 * @param lineItems the lineItems to set
	 */
	public void setLineItems(List<LineItemWithShipInfo> lineItems) {
		this.lineItems = lineItems;
	}
	/**
	 * @return the orderStatus
	 */
	public String getOrderStatus() {
		return orderStatus;
	}
	/**
	 * @param orderStatus the orderStatus to set
	 */
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	/**
	 * @return the shipToAddress
	 */
	public Address getShipToAddress() {
		return shipToAddress;
	}
	/**
	 * @param shipToAddress the shipToAddress to set
	 */
	public void setShipToAddress(Address shipToAddress) {
		this.shipToAddress = shipToAddress;
	}
	
}
