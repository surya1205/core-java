package com.leo.marlboro30.sorts;

import java.util.Comparator;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.leo.entity.StringUtil;
import com.pmusa.orderHistory.vo.OrderWithLineItem;

public class OrderHistoryStatusComparator implements Comparator<OrderWithLineItem> {

	private static final Log logger = LogFactory
			.getLog(OrderHistoryStatusComparator.class);
	
	public int compare(OrderWithLineItem orderWithLineItem1, OrderWithLineItem orderWithLineItem2) {
		
		logger.debug("OrderHistoryStatusComparator.compare method begins");
		
		int value = 0;
		String orderStatus1 = null;
		String orderStatus2 = null;
		
		if(orderWithLineItem1!=null && orderWithLineItem2!=null) {
			
			orderStatus1 =	orderWithLineItem1.getLineItemStatus();
			orderStatus2 = orderWithLineItem2.getLineItemStatus();
			
			if(orderStatus1!=null && orderStatus2!=null 
					&& StringUtil.isNotEmpty(orderStatus1) && StringUtil.isNotEmpty(orderStatus2)) {
				
				value = orderStatus1.compareTo(orderStatus2);
				
			} else {
				logger.debug("OrderHistoryStatusComparator: compare : one of the status is null or empty: orderStatus1= --> "+orderStatus1
						+",orderStatus="+orderStatus2);
			}
			
		} else {
			logger.debug("OrderHistoryStatusComparator : compare  :one of the comparing objects is "
					+ " null: orderWithLineItem1=" + orderWithLineItem1 + ",orderWithLineItem2=" + orderWithLineItem2);
		}
		return value;
	}

}
