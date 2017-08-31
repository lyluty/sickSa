<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<script src='include/js/order.js'></script>
 <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
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
					<img src="${product.pdt_imgsrc_l}" width="250px" height="250px"/>
				</div>
				<div class="project-heading">
					<h6>${product.pdt_name}</h6>
					<p>${product.pdt_price}</p>
					<a data-toggle="modal" href="productDetail/+${product.pdt_id}" data-target="#myModal" role="button" data-backdrop="static">
					 <span class="btn btn-xs btn-success">상세보기</span>
					</a>
					<a href="javascript:addToCart(${product.pdt_id})">장바구니</a>
				</div>
			</div>
		</div>
		</c:forEach>
	</div>
	
	
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  	<div class="modal-dialog">
	    <div class="modal-content">
	      
	    </div>
	  </div>
	</div>
</div>


<!-- Content Holder End -->