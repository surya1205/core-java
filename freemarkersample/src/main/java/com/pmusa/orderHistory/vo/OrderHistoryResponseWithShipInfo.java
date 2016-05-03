package com.pmusa.orderHistory.vo;

import java.util.List;


/**
 * 
 * @author iCrossing
 *
 */
public class OrderHistoryResponseWithShipInfo {

	private int responseCode;
	private String responseDetail;
	private List<OrderWithLineItem> orderWithLineItems;
	
	/**
	 * @return the responseDetail
	 */
	public String getResponseDetail() {
		return responseDetail;
	}
	/**
	 * @param responseDetail the responseDetail to set
	 */
	public void setResponseDetail(String responseDetail) {
		this.responseDetail = responseDetail;
	}
	/**
	 * @return the responseCode
	 */
	public int getResponseCode() {
		return responseCode;
	}
	/**
	 * @param responseCode the responseCode to set
	 */
	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}
	/**
	 * @return the orderWithLineItems
	 */
	public List<OrderWithLineItem> getOrderWithLineItems() {
		return orderWithLineItems;
	}
	/**
	 * @param orderWithLineItems the orderWithLineItems to set
	 */
	public void setOrderWithLineItems(List<OrderWithLineItem> orderWithLineItems) {
		this.orderWithLineItems = orderWithLineItems;
	}
	
	
	
	
	
}
