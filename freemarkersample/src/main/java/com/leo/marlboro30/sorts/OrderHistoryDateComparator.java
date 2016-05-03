package com.leo.marlboro30.sorts;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.leo.entity.StringUtil;
import com.pmusa.orderHistory.vo.OrderWithLineItem;

public class OrderHistoryDateComparator implements Comparator<OrderWithLineItem> {

	private static final Log logger = LogFactory
			.getLog(OrderHistoryDateComparator.class);

	public int compare(OrderWithLineItem orderWithLineItem1, OrderWithLineItem orderWithLineItem2) {
		
		logger.debug("OrderHistoryDateComparator.compare method begins");
		
		int value = 0;
		String strDate1 = null;
		String strDate2 = null;
		Date date1 = null;
		Date date2 = null;
		
		if (orderWithLineItem1 != null && orderWithLineItem2 != null) {
			strDate1 = orderWithLineItem1.getOrderCreatedDate();
			strDate2 = orderWithLineItem2.getOrderCreatedDate();

			try {
				if (StringUtil.isNotEmpty(strDate1)
						&& StringUtil.isNotEmpty(strDate2)) {
					date1 = new SimpleDateFormat("MM/dd/yy").parse(strDate1);

					date2 = new SimpleDateFormat("MM/dd/yy").parse(strDate2);
					// comparator default is Ascending order. Here reverse
					// comparison is used to get the descending order of the
					// date posted.
					value = date2.compareTo(date1);
				}
			} catch (ParseException e) {
				logger.error("OrderHistoryDateComparator : compare : exception occured for"
						+ " strDate1=" + strDate1 + ",strDate2=" + strDate2);
			}
		} else {
			logger.debug("OrderHistoryDateComparator : compare  :one of the comparing objects"
					+ " null: orderWithLineItem1=" + orderWithLineItem1 + ",orderWithLineItem2=" + orderWithLineItem2);
		}
		
		return value;
	}
	
}
