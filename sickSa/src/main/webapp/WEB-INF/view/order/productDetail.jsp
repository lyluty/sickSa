<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<script src='include/js/order.js'></script>

<div id="pddt" class="main-container single-member">
	<div class="inner-banner parallax" data-parallax-speed="5" style="background-image: include/images/project-slide2.jpg;">
		<div class="content-holder">
			<h3 class="content-title">${product.pdt_name}</h3>
			<div class="row">
				<div class="col-sm-8">
					<p class="large-para">${product.pdt_description}</p>
				</div>
				<div class="col-sm-4">
					<input type="hidden" id="A" name="pdt_id" value="${product.pdt_id}" />
					<ul class="det-list">
						<li><span>상품 이름 :</span> ${product.pdt_name}</li>
						<li><span>상품 가격 : </span> ${product.pdt_price}</li>
					</ul>
				</div>
				<ul class="bottom-nav">
					<li><button onclick="addToCart(${product.pdt_id})">장바구니 담기</button></li>
				</ul>
			</div>
			<div class="content-holder">
				<div class="project-slider">
					<div>
						<a href="include/images/project-slide3.jpg" class="pop-image"><img src="../${product.pdt_imgsrc_l}"></a>
					</div>
				</div>
			</div>
		</div>
		<!-- Content Holder End -->
	</div>
</div>