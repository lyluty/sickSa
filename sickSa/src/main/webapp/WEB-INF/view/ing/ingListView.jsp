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

<ul class="sub-service-list">
	<c:forEach var="ingredient" items="${ingredientList}">
		<li>
			<div class="panel">
				<div class="panel-heading">
					<div class="service-box">
						<div class="service-icon"><i class="ion ion-android-color-palette"></i></div>
						<h3>${ingredient.ing_name}</h3>
					</div>
				</div>
				<div class="panel-body">
					<p>
						재고 : ${ingredient.ing_stock}<br /> 단가 :
						${ingredient.ingredientDetails.igdt_price}<br /> 거래연락처 :
						${ingredient.ingredientDetails.igdt_contact}
					</p>
				</div>
			</div>
		</li>
	</c:forEach>
	<li><a role="button" data-backdrop="static"> <span
			id="create-ing" class="btn btn-xs btn-success">추가하기</span>
	</a></li>
</ul>

<!-- 클래스 입힘. -->
