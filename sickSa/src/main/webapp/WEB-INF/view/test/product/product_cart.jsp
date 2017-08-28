<!DOCTYPE html>

<%@page import="sickSa.domain.Product"%>
<%@page import="java.util.List"%>
<%@page import="org.springframework.ui.Model"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>\


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">

<script type="text/javascript">
	function Plus_Jumun() {
		document.f.action = "productL";
		document.f.method = "post";
		document.f.submit();
	}

	function Buy() {
		document.f.action = "";
		document.f.method = "post";
		document.f.submit();
	}
	
	
	function Productdelete(){
		alert("삭제")
		document.f.action = "delete_cart";
		
		alert("삭제")
		document.f.method = "post";
		alert("삭제")
		
		document.f.submit();
		alert("삭제")
		
	}
</script>

<title>Insert title here</title>
</head>
<body>
	<form name="f" method="post">
		
		
		<table border=1>
			<tr>
				<th>상품 이미지</th>
				<th>상품 이름</th>
				<th>상품 수량</th>
				<th>상품 가격</th>
				<th>삭제</th>
			</tr>
			<c:forEach var="cartList" items="${cartList}">
			
			<tr>
			<%-- <input type="hidden" name="pdt_id" value="${cartList.pdt_id}"> --%>
			<input type="hidden" name="ct_id" value="${cartList.ct_id}">
				<td><img width="60px" src='${cartList.ct_img}'></td>
				<td>${cartList.ct_id}</td>
				<td>${cartList.ct_name}</td>
				<td></td>
				<td>${cartList.ct_price}</td>
			</tr>
			</c:forEach>
		</table>
		<tr>
			<input type="button" onClick="Plus_Jumun();" value="메뉴 추가" />
			<input type="button" onClick="Productdelete();" value="삭제" />
			<input type="button" onClick="Buy();" value="결제하기" />
		</tr>

</body>
</form>

</html>