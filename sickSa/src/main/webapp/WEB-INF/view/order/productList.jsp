<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<style>
@import url(http://fonts.googleapis.com/earlyaccess/hanna.css);
	h4 {
		font-size: 20px;
        font-weight: bold;
        font-family: hanna;
    }
    h4 span {
    	margin: 0px 0px 0px 0px;
    	font-weight:lighter;
    	font-family:hanna;
    }
    span {
    	font-size: 15px;
    } 
</style>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script src='include/js/order.js'></script>

<div class="content-holder">
	<h3 class="content-title">MENU</h3>
	<div class="portfolio-container">
		<c:forEach var="product" items="${productList}">
		<div id="masonry" class="grid project-gallery">
			<div class="grid-sizer"></div>
			<div class="gutter-sizer"></div>
			
			<div data-filter="Website" class="grid-item">
				<div class="box-item">
					<img src="${product.pdt_imgsrc_s}" width="250px" height="250px"/>
				</div>
				<div class="project-heading">
					<h4>${product.pdt_name}<span>  ${product.pdt_price}원</span></h4> 
					<a role="button" data-backdrop="static">
					 <span id="${product.pdt_id}" class="btn btn-xs btn-success">상세보기</span>
					</a>
					<span class="btn btn-xs btn-success" onclick="addToCart(${product.pdt_id})">장바구니</span>
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