<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Order Service Test</title>
</head>
<body>

<h1>Order Service getList</h1>
<hr style="border: solid 2px black;"/>
		<div>
		<table border="1">
				<tr align="center">
					<td>ord_id</td>
					<td>pdt_id</td>
					<td>ord_pdtAmount</td>
					<td>ord_total</td>
					<td>ord_paymentMethod</td>
					<td>ord_date</td>
					<td>ord_state</td>
					<td>tbl_id</td>
				</tr>
				
		<c:forEach var="order"  items="${orderList}">
					<tr align="center">
						<td>${order.ord_id}</td>
						<td>${order.pdt_id}</td>
						<td>${order.ord_pdtAmount}</td>
						<td>${order.ord_total}</td>
						<td>${order.ord_paymentMethod}</td>
						<td>${order.ord_date}</td>
						<td>${order.ord_state}</td>
						<td>${order.tbl_id}</td>
					</tr>
		</c:forEach>
			</table>
		</div>
		<hr/>
				
				
		


</body>
</html>