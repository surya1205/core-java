package com.pmusa.orderHistory.vo;


public class OrderWithLineItem {
	
	private String orderNumber;
	private String orderCreatedDate;
	private String lineItemStatus;
	private String itemName;
	private String shipDate;
	private String shipmentTrackUrl;
	private String shipmentTrackNumber;
	private Address shipToAddress;
	
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
	 * @return the lineItemStatus
	 */
	public String getLineItemStatus() {
		return lineItemStatus;
	}
	/**
	 * @param lineItemStatus the lineItemStatus to set
	 */
	public void setLineItemStatus(String lineItemStatus) {
		this.lineItemStatus = lineItemStatus;
	}
	/**
	 * @return the itemName
	 */
	public String getItemName() {
		return itemName;
	}
	/**
	 * @param itemName the itemName to set
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	/**
	 * @return the shipDate
	 */
	public String getShipDate() {
		return shipDate;
	}
	/**
	 * @param shipDate the shipDate to set
	 */
	public void setShipDate(String shipDate) {
		this.shipDate = shipDate;
	}
	/**
	 * @return the shipmentTrackUrl
	 */
	public String getShipmentTrackUrl() {
		return shipmentTrackUrl;
	}
	/**
	 * @param shipmentTrackUrl the shipmentTrackUrl to set
	 */
	public void setShipmentTrackUrl(String shipmentTrackUrl) {
		this.shipmentTrackUrl = shipmentTrackUrl;
	}
	/**
	 * @return the shipmentTrackNumber
	 */
	public String getShipmentTrackNumber() {
		return shipmentTrackNumber;
	}
	/**
	 * @param shipmentTrackNumber the shipmentTrackNumber to set
	 */
	public void setShipmentTrackNumber(String shipmentTrackNumber) {
		this.shipmentTrackNumber = shipmentTrackNumber;
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
