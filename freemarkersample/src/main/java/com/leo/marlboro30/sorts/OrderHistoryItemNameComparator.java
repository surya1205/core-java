package com.leo.marlboro30.sorts;

import java.util.Comparator;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.leo.entity.StringUtil;
import com.pmusa.orderHistory.vo.OrderWithLineItem;

public class OrderHistoryItemNameComparator implements Comparator<OrderWithLineItem> {

	private static final Log logger = LogFactory
			.getLog(OrderHistoryItemNameComparator.class);

	public int compare(OrderWithLineItem orderWithLineItem1, OrderWithLineItem orderWithLineItem2) {
		
		logger.debug("OrderHistoryItemNameComparator.compare method begins");
		
		int value = 0;
		String itemName1 = null;
		String itemName2 = null;
		
		if(orderWithLineItem1!=null && orderWithLineItem2!=null)  {
			
			itemName1 =	orderWithLineItem1.getItemName();
			itemName2 = orderWithLineItem2.getItemName();
			
			if(itemName1!=null && itemName2!=null 
					&& StringUtil.isNotEmpty(itemName1) && StringUtil.isNotEmpty(itemName2)) {
				
				value = itemName1.compareTo(itemName2);
				
			} else {
				logger.debug("OrderHistoryItemNameComparator : compare  :one of the item names is "
						+ " null: ItemName1=" + itemName1 + ", ItemName2=" + itemName2);
			}
			
		} else {
			logger.debug("OrderHistoryItemNameComparator : compare  :one of the comparing objects is "
					+ " null: orderWithLineItem1=" + orderWithLineItem1 + ",orderWithLineItem2=" + orderWithLineItem2);
		}
		
		return value;
	}

}
