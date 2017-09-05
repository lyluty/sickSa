<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<style>
@import url(http://fonts.googleapis.com/earlyaccess/hanna.css);
	.menu__item {
		font-size: 20px;
        font-weight: bold;
		font-family: hanna;
	}
</style>
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
		
		 <div class="main-container-outer">
		<div class="container" style="height: 80%">
			<!-- top start -->
			<jsp:include page="../common/include-vm_top.jsp" />
			<!-- top end -->
			<div class="content-holder">
			
			<div id="content" style="height: 80%; display: block; margin: 0 auto"></div>
			</div>
			
		</div>
		</div>
		<!-- 컨텐츠 영역 end -->
		<!-- footer start -->
		<jsp:include page="../common/include-footer.jsp" flush="false" />
		<!-- footer end -->
	</div>
	<!-- tail start -->
	<jsp:include page="../common/include-tail.jsp" flush="false" />
	<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
	<script src='include/js/order.js'></script>
	<script type="text/javascript">
	$(window).load(function() {
		showProductList(1);
	});
  	</script>
	<!-- tail end -->
</body>
</html>