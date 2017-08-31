<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<style type="text/css">
</style>
<!-- <script src="http://code.jquery.com/jquery-1.11.1.min.js"></script> -->
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script> 
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
	<li><a role="button" data-backdrop="static"> 
			<span id="create-ing" class="btn btn-xs btn-success">추가하기</span>
	</a></li>
</ul>

<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content"></div>
	</div>
</div>
