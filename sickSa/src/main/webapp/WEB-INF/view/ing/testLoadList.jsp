<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<style>
@import url(http://fonts.googleapis.com/earlyaccess/hanna.css);
#addImg{
	margin-top:0px;
	margin-right:0px;
	margin-bottom:25px;
	margin-left:0px;
}

</style>
<script src='include/js/ingredient.js'></script>

<br />
<ul style="font-family: hanna; font-size: 30px; line-height: 200%;">
	<c:forEach var="ingredient" items="${ingredientList}">
		<li><a href="javascript:ing_list_load(${ingredient.ing_id})">${ingredient.ing_name}</a></li>
		<div id="ingList">
			<p id="ingList${ingredient.ing_id}" class="ingP" style="font-size: 30px; color: green;" hidden="true">
				${ingredient.ing_stock} 개의 재고가 남았으며<br />
				단가는 ${ingredient.ingredientDetails.igdt_price} 원 입니다.<br />
				거래연락처 : ${ingredient.ingredientDetails.igdt_contact}
			</p>
		</div>
	</c:forEach>
	<!-- 재료 '카테고리'추가 버튼이었음;; -->
	<li><img id="addImg" alt="plus" src="include/images/addButton.png" onclick="ing_insert_form();"/></li>
</ul>
