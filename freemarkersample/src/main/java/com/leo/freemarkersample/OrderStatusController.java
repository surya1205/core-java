package com.leo.freemarkersample;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.leo.util.OrderHistorySortUtil;
import com.pmusa.orderHistory.vo.OrderHistoryResponseWithShipInfo;
import com.pmusa.orderHistory.vo.OrderWithLineItem;

@Controller
@RequestMapping("/orderstatus")
public class OrderStatusController {

	@RequestMapping(value="/")
	public void getSitelOrderHistory(HttpServletRequest request,
			HttpServletResponse response) {

		String ccn = "030628243";

		HttpSession session = request.getSession();

		OrderHistoryResponseWithShipInfo orderHistoryResponseWithShipInfo = null;

		if (session != null) {

			if (session.getAttribute("orderstatuslist") != null) {

				orderHistoryResponseWithShipInfo = (OrderHistoryResponseWithShipInfo) session
						.getAttribute("orderstatuslist");

			} else {

				orderHistoryResponseWithShipInfo = getOrderHistory(ccn);

				if(orderHistoryResponseWithShipInfo!=null && orderHistoryResponseWithShipInfo.getResponseCode()==0
						&& orderHistoryResponseWithShipInfo.getResponseDetail().equalsIgnoreCase("Success"))
				{
					
					List<OrderWithLineItem> orderWithLineItems = orderHistoryResponseWithShipInfo.getOrderWithLineItems();
					
					if(orderWithLineItems!=null && orderWithLineItems.size()>0) {
						
						orderWithLineItems = OrderHistorySortUtil.sortOrderWithShipInfo(orderWithLineItems, "orderStatus");
						
						orderHistoryResponseWithShipInfo.setOrderWithLineItems(orderWithLineItems);
						
						session.setAttribute("orderstatuslist",
								orderHistoryResponseWithShipInfo);
						
					}
					
					/*List<OrderWithShipInfo> orderWithShipInfos = orderHistoryResponseWithShipInfo.getOrderWithShipInfos();
					
					if(orderHistoryResponseWithShipInfo!=null && orderWithShipInfos.size()>0)
					{
						orderWithShipInfos = OrderStatusSortUtil.sortOrderWithShipInfo(orderWithShipInfos, "orderDate");
						
						orderHistoryResponseWithShipInfo.setOrderWithShipInfos(orderWithShipInfos);
						
						session.setAttribute("orderstatuslist",
								orderHistoryResponseWithShipInfo);
					}*/
					
					
				}
				
				
			}

		}

	}

	private OrderHistoryResponseWithShipInfo getOrderHistory(String ccn) {

		OrderHistoryResponseWithShipInfo orderHistoryResponseWithShipInfo = null;

		orderHistoryResponseWithShipInfo = getDummyOrderHistoryWithLineItems();

		return orderHistoryResponseWithShipInfo;
	}

	private OrderHistoryResponseWithShipInfo getDummyOrderHistoryWithLineItems() {

		OrderHistoryResponseWithShipInfo orderHistoryResponseWithShipInfo = new OrderHistoryResponseWithShipInfo();

		orderHistoryResponseWithShipInfo.setResponseCode(0);
		
		orderHistoryResponseWithShipInfo.setResponseDetail("Success");
		
		List<OrderWithLineItem> orderWithLineItems = new ArrayList<OrderWithLineItem>();
		
		OrderWithLineItem orderWithLineItem = new OrderWithLineItem();
		
		orderWithLineItem.setItemName("BOOM BOX");
		
		orderWithLineItem.setLineItemStatus("Shipped");
		
		orderWithLineItem.setOrderCreatedDate("08/24/2012");
		
		orderWithLineItem.setOrderNumber("260536532");
		
		orderWithLineItem.setShipDate("08/24/12");
		
		orderWithLineItem.setShipmentTrackNumber("1Z13X2E54213447191");

		orderWithLineItem.setShipmentTrackUrl("http://www.ups.com/tracking/tracking.html");
		
		orderWithLineItem.setShipToAddress(null);
		
		orderWithLineItems.add(orderWithLineItem);
		
		orderWithLineItem = new OrderWithLineItem();
		
		orderWithLineItem.setItemName("BNOTY INCENTIVE BUCKSLIP");
		
		orderWithLineItem.setLineItemStatus("Processing");
		
		orderWithLineItem.setOrderCreatedDate("07/30/12");
		
		orderWithLineItem.setOrderNumber("260536532");
		
		orderWithLineItem.setShipDate("07/30/12");
		
		orderWithLineItem.setShipmentTrackNumber("1Z13X2E54213447192");

		orderWithLineItem.setShipmentTrackUrl("http://www.ups.com/tracking/tracking.html");
		
		orderWithLineItem.setShipToAddress(null);
		
		orderWithLineItems.add(orderWithLineItem);
		
		
		orderWithLineItem = new OrderWithLineItem();
		
		orderWithLineItem.setItemName("Lighter");
		
		orderWithLineItem.setLineItemStatus("BackOrder");
		
		orderWithLineItem.setOrderCreatedDate("08/10/12");
		
		orderWithLineItem.setOrderNumber("260536532");
		
		orderWithLineItem.setShipDate("08/10/12");
		
		orderWithLineItem.setShipmentTrackNumber("1Z13X2E54213447193");

		orderWithLineItem.setShipmentTrackUrl("http://www.ups.com/tracking/tracking.html");
		
		orderWithLineItem.setShipToAddress(null);
		
		orderWithLineItems.add(orderWithLineItem);
		
		
		orderWithLineItem = new OrderWithLineItem();
		
		orderWithLineItem.setItemName("BOOM BOX 1");
		
		orderWithLineItem.setLineItemStatus("Shipped");
		
		orderWithLineItem.setOrderCreatedDate("08/05/12");
		
		orderWithLineItem.setOrderNumber("260536532");
		
		orderWithLineItem.setShipDate("08/05/12");
		
		orderWithLineItem.setShipmentTrackNumber("1Z13X2E54213447194");

		orderWithLineItem.setShipmentTrackUrl("http://www.ups.com/tracking/tracking.html");
		
		orderWithLineItem.setShipToAddress(null);
		
		orderWithLineItems.add(orderWithLineItem);
		
		orderHistoryResponseWithShipInfo.setOrderWithLineItems(orderWithLineItems);
		
		return orderHistoryResponseWithShipInfo;

	}

}
