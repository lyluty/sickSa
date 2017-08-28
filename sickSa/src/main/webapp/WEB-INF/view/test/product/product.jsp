
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<script
  src="https://code.jquery.com/jquery-1.12.4.min.js"
  integrity="sha256-ZosEbRLbNQzLpnKIkEdrPv7lOy9C27hHQ+Xp8a4MxAQ="
  crossorigin="anonymous"></script>
<script type="text/javascript">
	$(function() {
		$('#donBtn').click(function() {
			location.href = "product?pdct_id=1";
		})
	});
	$(function() {
		$('#myunBtn').click(function() {
			location.href = "product?pdct_id=" + 2;
		})
	});
	$(function() {
		$('#oniBtn').click(function() {
			location.href = "product?pdct_id=" + 3;
		})
	});
	$(function() {
		$('#newBtn').click(function() {
			location.href = "product?pdct_id=" + 4;
		})
	});
	$(function() {
		$('#cupBtn').click(function() {
			location.href = "product?pdct_id=" + 5;
		})
	});
	$(function() {
		$('#setBtn').click(function() {
			location.href = "product?pdct_id=" + 6;
		})
	});
</script>

<style>
.bttn {
	margin-left: 320px;
}

.btn {
	background-color: white;
	width: 100px;
	height: 100px;
}
</style>
<div class="content">

	<input type="button" id="donBtn" class="btn btn-default bttn"
		value="돈부리" style="font-weight: bolder;">

	<button type="button" id="myunBtn" class="btn btn-default"
		style="font-weight: bolder;">면류</button>

	<button type="button" id="oniBtn" class="btn btn-default"
		style="font-weight: bolder;">오니기리</button>

	<button type="button" id="newBtn" class="btn btn-default"
		style="font-weight: bolder;">신메뉴</button>

	<button type="button" id="cupBtn" class="btn btn-default"
		style="font-weight: bolder;">컵밥</button>

	<button type="button" id="setBtn" class="btn btn-default"
		style="font-weight: bolder;">세트메뉴</button>

	<div class="product_top">

		<c:forEach var="product" items="${productList}">
			<div class="p_list">
				<div class="product__images">

					<a href="product_view?pdt_id=${product.pdt_id}"
						class="product-beta__link"> <img width="100px" alt=""
						src="${product.pdt_imgsrc_S}" class="img-responsive" alt="" />
					</a>
				</div>
				<div class="product__info">
					<a href="product_view?pdt_id=${product.pdt_id}"
						class="product__title">${product.pdt_name}</a>

					<p class="product__option">
						<strong>판매가 : ${product.pdt_price}원</strong><br />

					</p>
					<ul class="list_6">


					</ul>
				</div>
				<div class="clearfix"></div>
			</div>
		</c:forEach>


		<div class="clearfix"></div>

	</div>


	<div class="clearfix"></div>
</div>







