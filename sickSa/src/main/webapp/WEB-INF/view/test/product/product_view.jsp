<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">

<script type="text/javascript">
	function ProductList(){
		document.f.action="productL";
		document.f.method="post";
		document.f.submit();
	}
	
	function Jumun(){
		document.f.action="";
		document.f.method="post";
		document.f.submit();
	}
 	function Cart(){
 		document.f.action="product_cart";
		document.f.method="post";
		document.f.submit();
 	}
 	
</script>

<title>Insert title here</title>
</head>
<body>
<form name ="f" method="post">
	<input type="hidden" id="A" name="pdt_id" value ="${spdt_Id.pdt_id}"/>
	 
	상품 이미지:<img src='${spdt_Id.pdt_imgsrc_L}' ><br/>
	상품 이름 : ${spdt_Id.pdt_name}<br/>
	상품 가격 : ${spdt_Id.pdt_price}<br/>
	상품 설명 : ${spdt_Id.pdt_description}<br/>
<tr>
	<input type="button" onClick="Jumun();" value="주문 하기"/>
	
<%-- 	<c:if test="${cartOne.pdt_id } eq ${spdt_id.pdt_id }" >
	</c:if>
 --%>		
	<%-- <c:if test="${cartOne.pdt_id } ne ${spdt_id.pdt_id }" >
	</c:if> --%>
    <input type="button" onClick="Cart();"	value="장바구니 담기" style="visibility: hidden;"/> 
		<input type="button" onClick="Cart();" value="장바구니 담기"/> 
	<input type="button" onClick="ProductList();" value="목록"/>
</tr>
</body>
</form>

</html>