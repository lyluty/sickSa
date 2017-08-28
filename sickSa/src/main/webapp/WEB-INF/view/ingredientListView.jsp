<%@page import="org.springframework.ui.Model"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script src='include/js/ingredient.js'></script>
<div id="ingListForm" class="panel">
	<h3 class="content-title">Ingredient</h3>
	<!-- Ingredient List Slide  start -->
	<ul class="sub-service-list">
		<c:forEach var="ing" items="${ingredientList}">
			<li>
				<div class="panel">
					<div class="panel-heading">
						<div class="service-box">
							<div class="service-num">${ing.ing_id}</div>
							<div class="service-icon">
								<i class="ion ion-android-color-palette"></i>
							</div>
							<h6>${ing.ing_name}</h6>
						</div>
					</div>
					<div class="panel-body">
						<p>${ing.ing_stock}</p>
						<p>${ing.ingredientDetails.igdt_price}</p>
					</div>
				</div>
			</li>
		</c:forEach>
	</ul>
	<!-- Ingredient List Slide start -->
</div>
<!-- Category List Slide end -->
