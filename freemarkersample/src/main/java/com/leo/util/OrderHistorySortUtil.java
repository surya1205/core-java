package com.leo.util;

import java.util.Collections;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.leo.entity.StringUtil;
import com.leo.marlboro30.sorts.OrderHistoryDateComparator;
import com.leo.marlboro30.sorts.OrderHistoryItemNameComparator;
import com.leo.marlboro30.sorts.OrderHistoryStatusComparator;
import com.pmusa.orderHistory.vo.OrderWithLineItem;

public class OrderHistorySortUtil {

	private static final Log logger = LogFactory
			.getLog(OrderHistorySortUtil.class);
	
	public static List<OrderWithLineItem> sortOrderWithShipInfo(List<OrderWithLineItem> orderWithLineItems,String sortBy) {
			
		logger.debug("OrderHistorySortUtil.sortOrderWithShipInfo method begins");
		
		if(orderWithLineItems!=null && orderWithLineItems.size()>0) {
			
			logger.debug("OrderHistorySortUtil.sortOrders photo List size is: --> "+orderWithLineItems.size());	
			
			if(StringUtil.isNotEmpty(sortBy)) {
				
				logger.debug("OrderHistorySortUtil.sortOrders sortBy is: --> "+sortBy);
				
				if(sortBy.equalsIgnoreCase("itemName")) {
					
					Collections.sort(orderWithLineItems,new OrderHistoryItemNameComparator());
					
				} else if(sortBy.equalsIgnoreCase("orderStatus")) {
					
					Collections.sort(orderWithLineItems,new OrderHistoryStatusComparator());
					
				} else {
				
					Collections.sort(orderWithLineItems, new OrderHistoryDateComparator());
					
				}
			}
			
		} 
		
		return orderWithLineItems;
	}
	
}
