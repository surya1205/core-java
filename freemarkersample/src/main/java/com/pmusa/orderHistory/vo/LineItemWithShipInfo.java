package com.pmusa.orderHistory.vo;

public class LineItemWithShipInfo {

	private String itemName;
	private String shipDate;
	private String shipmentTrackUrl;
	private String shipmentTrackNumber;
	
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
	
}
