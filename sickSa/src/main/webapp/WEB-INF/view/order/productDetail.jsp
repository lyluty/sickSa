<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>

<div class="modal-header">
	<h4 class="modal-title" id="myModalLabel">
		${product.pdt_name}
	</h4>
</div>
<div class="modal-body">
	<div class="col-sm-4">
		<ul class="det-list">
			<li><img src="${product.pdt_imgsrc_l}" ></li>
			<li><span>상품 가격 : </span> ${product.pdt_price}</li>
			<li><span>상품 설명 : </span> ${product.pdt_description}</li>
		</ul>
	</div>
</div>
<div class="modal-footer">
	<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
	<button type="button" class="btn btn-primary" onclick="addToCart(${product.pdt_id})">장바구니 담기</button>
</div>

