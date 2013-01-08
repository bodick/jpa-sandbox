package com.jlkwison.dao;

import java.util.List;

import com.jlkwison.entity.Order;

public interface OrderDao {

	List<Order> findOrders(int max);
	
}
