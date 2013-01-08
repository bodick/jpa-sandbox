package com.jlkwison.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="Orders")
@NamedQueries({@NamedQuery(name="order.findAll", query="SELECT o FROM Order o")})
public class Order {
	
	@Id
	private long orderId;
	
	private BigDecimal total;
	
	public long getId() {
		return orderId;
	}
	
	public BigDecimal getTotal() {
		return total;
	}
	
}
