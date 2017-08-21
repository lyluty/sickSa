<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>OrderMapperTest</title>
</head>
<body>
<h1>OrderMapperTest</h1>
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
			</table>
		</div>

</body>
</html>