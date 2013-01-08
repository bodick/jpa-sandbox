<%@page import="com.jlkwison.services.OrderService"%>
<%@page import="java.util.List"%>
<%@page import="com.jlkwison.entity.Order"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<p>List of Orders</p>

<%
	// TODO Loop orders here
OrderService orderSvc = new OrderService();

List<Order> orders = orderSvc.getTop10Orders();

if (orders.isEmpty()) {
%><p>No orders...</p><% 
} else {
    for (Order order: orders) {
        %><p>Order id = <%=order.getId()%>, total = <%=order.getTotal()%></p><%
    }
}

%>


</body>
</html>