<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- Content Holder End -->
<div class="content-holder">
	<h3 class="content-title">MENU</h3>
	<div class="portfolio-container">
		<c:forEach var="product" items="${productList}">
		<div id="masonry" class="grid project-gallery">
			<div class="grid-sizer"></div>
			<div class="gutter-sizer"></div>
			
			<div data-filter="Website" class="grid-item">
				<div class="box-item">
					<a href="productDetail/${product.pdt_id}"><img src="${product.pdt_imgsrc_l}" width="70%"/></a>
				</div>
				<div class="project-heading">
					<h6>${product.pdt_name}</h6>
					<p>${product.pdt_price}</p>
					<button id="payBtn" onclick="orderNow(${product.pdt_id})">결제</button>
					<a href="javascript:addToCart(${product.pdt_id})">장바구니</a>
				</div>
			</div>
		</div>
		</c:forEach>
	</div>
</div>
<!-- Content Holder End -->