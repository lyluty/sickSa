<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<html>
<head>
<!-- head start -->
<jsp:include page="../common/include-head.jsp" flush="false" />
<script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
<!-- head end -->
</head>
<body>
	<div class="animsition">
		<!-- nav start -->
			<jsp:include page="../common/include-vm_navigator.jsp" flush="false" />
		<!-- nav end -->

		<!-- header start -->
		<jsp:include page="../common/include-header.jsp" flush="false" />
		<!-- header end -->

		<!-- 컨텐츠 영역 start -->
		<div class="main-container-outer" style="width:85%; margin-left:20px;">
		<div class="main-container">

			<div class="container" >

				<!-- top start -->
				<jsp:include page="../common/include-vm_top.jsp" />
				<!-- top end -->
		
					<div class="content-holder" style="padding: auto 13%;">

						<h3 class="content-title" align="left"
							style="margin: 50px auto;">Order Result</h3>

						<div id="content"
							style="height: 100%; display: block; margin: 0 auto">
							<h6 align="right"> Order No . ${order.ord_id}</h6>
							<h6 align="right"> Date . <fmt:formatDate value="${order.ord_date}" pattern="yyyy.MM.dd" /></h6>
							<table class="table table-striped"
								style="margin: 50px auto; padding: 30px;">
								<thead>
									<tr>
										<th><h5>product</h5></th>
										<th><h5>amount</h5></th>
										<th><h5>price</h5></th>
									</tr>
								</thead>
								<tbody>

									<c:forEach var="orderDetail" items="${orderDetailList}">
										<c:set var="product" value="${orderDetail.product}">
										</c:set>
										<tr>
											<td><h6 >${product.pdt_name}</h6></td>
											<td><h6 >${orderDetail.ordt_amount}</h6></td>
											<td><h6 >${product.pdt_price * orderDetail.ordt_amount}</h6></td>
										</tr>
									</c:forEach>

								</tbody>
							</table>
						</div>

						<h6 align="right">Total Price:</h6>
						<h3 align="right">${order.ord_total}</h3>
						
						<button type="button"class="btn btn-default"  onclick="location.href='vmMain' " style="display: block; margin: 70px auto;">확인</button>
					</div>
				</div>
		</div>

		<!-- 컨텐츠 영역 end -->

		<!-- footer start -->
		<jsp:include page="../common/include-footer.jsp" flush="false" />
		<!-- footer end -->
		</div>
	</div>


	<!-- tail start -->
	<jsp:include page="../common/include-tail.jsp" flush="false" />
	<script src='include/js/order.js'></script>
	<!-- tail end -->
</body>
</html>