package com.jlkwison.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.jlkwison.dao.OrderDao;
import com.jlkwison.entity.Order;

public class OrderDaoImpl implements OrderDao {
	
	@PersistenceContext(unitName="ccCommerce")
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Order> findOrders(int max) {
		EntityManagerFactory emf  = Persistence.createEntityManagerFactory("ccCommerce");
	    em = emf.createEntityManager();
		
		Query qry = em.createNamedQuery("order.findAll");
		qry.setMaxResults(max);
		return qry.getResultList();
	}

}
