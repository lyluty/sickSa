<%@page import="org.springframework.ui.Model"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<style type="text/css">
</style>
<script src='include/js/ingredient.js'></script>

<div id="ingListForm" class="panel">

	<!--  
	<span style = " font-size:1.5em;  color: green;">
	이 글자는 Span에 스타일(style)로 속성을 주었다
	</span>
	-->

	<!-- Ingredient List Slide  start -->
	<ul class="sub-service-list">
		<c:forEach var="ing" items="${ingredientList}">
			<li style="font-family: hanna;">
				<div class="panel">
					<div class="panel-heading">
						<div class="service-box">
							<div class="service-num">${ing.ing_id}</div>
							<div class="service-icon">
								<i class="ion ion-android-color-palette"></i>
							</div>
							<h3
								style="font-family: hanna; font-weight: 100; font-size: 35px; line-height: 150%;">${ing.ing_name}</h3>
						</div>
					</div>
					<div class="panel-body">
						<p style="font-size: 30px; color: green;">
							${ing.ing_stock} 개의 재고가 남았으며<br />
							${ing.ingredientDetails.igdt_price} 원 입니다.
						</p>
					</div>
				</div>
			</li>
		</c:forEach>
	</ul>
	<!-- Ingredient List Slide start -->
</div>
<!-- Category List Slide end -->
