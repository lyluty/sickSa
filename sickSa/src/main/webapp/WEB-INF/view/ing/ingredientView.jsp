<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html lang="kr">
<head>
<!-- head start -->
<jsp:include page="../common/include-head.jsp" flush="false" />
<!-- head end -->
</head>
<body>
	<div class="animsition">
		<!-- nav start -->
		<jsp:include page="../common/include-navigator.jsp" flush="false" />
		<!-- nav end -->
		<!-- header start -->
		<jsp:include page="../common/include-header.jsp" flush="false" />
		<script src="include/js/jquery-2.2.2.min.js"></script>
		<script src='include/js/ingredient.js'></script>
		<script type="text/javascript" src='include/js/admin.js'></script>
		
		<!-- header end -->
		<!-- main-container start -->
		<div class="main-container-outer">
			<div class="container">
				<div class="top-bar-container">
					<div class="container">
						<div class="top-bar">
							<ul class="breadcrumb">
								<li><a href="index.html">Home</a></li>
								<li><span>Ingredients</span></li>
							</ul>
						</div>
							<div class="top-bar" style="width:60px;float:right;">
						<ul class="breadcrumb">
						<li id="adminB"><a href="login">Admin</a></li>
						<li id="logoutB"><a href="logout">Logout</a></li>
					</ul>
				</div>
					</div>
				</div>
				<div class="main-container">
					<div class="inner-banner parallax" data-parallax-speed="5">
						<h2>식사의 신선한 재료들~</h2>
					</div>
					<!-- Content Holder Start -->
					<div id="contentHolder" class="content-holder"></div>
					<!-- Content Holder End -->
				</div>
			</div>
		</div>
		<!-- main-container end -->
		<!-- footer start -->
		<jsp:include page="../common/include-footer.jsp" flush="false" />
		<!-- footer end -->
	</div>
	<!-- tail start -->
	<jsp:include page="../common/include-tail.jsp" flush="false" />
	<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
	

	<!-- tail end -->
</body>
</html>