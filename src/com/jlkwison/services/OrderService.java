package com.jlkwison.services;

import java.util.List;

import com.jlkwison.dao.OrderDao;
import com.jlkwison.dao.impl.OrderDaoImpl;
import com.jlkwison.entity.Order;

public class OrderService {
	
	public List<Order> getTop10Orders() {
		OrderDao dao = new OrderDaoImpl();
		return dao.findOrders(10);
	}
	
}
