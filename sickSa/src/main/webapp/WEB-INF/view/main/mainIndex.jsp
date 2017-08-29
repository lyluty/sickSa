<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!-- 메인용 HEAD start -->
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Test Main</title>
<link rel="icon" href="include/images/favicon.png" sizes="32x32" />
<link href="include/css/bootstrap.css" rel="stylesheet" type="text/css">
<script src="include/js/bootstrap.min.js"></script>
<link
	href='https://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700'
	rel='stylesheet' type='text/css'>
<link href='https://fonts.googleapis.com/css?family=Montserrat:400,700'
	rel='stylesheet' type='text/css'>
<link href="include/css/ionicons.min.css" rel="stylesheet"
	type="text/css">
<link href="include/css/slick.css" rel="stylesheet" type="text/css">
<link href="include/css/animate.css" rel="stylesheet" type="text/css">
<link href="include/css/animsition.min.css" rel="stylesheet"
	type="text/css">
<link href="include/css/magnific-popup.css" rel="stylesheet"
	type="text/css">
<link href="include/css/main.css" rel="stylesheet" type="text/css">
<script src="include/js/modernizr-custom.js"></script>
<script src="include/js/jquery-2.2.2.min.js"></script>
<script src="include/js/mainModal.js"></script>

</head>
<body>

	<!-- hero-container start -->
	<div class="hero-container">

		<div class="top-bar-container">
			<div class="container">
				<div class="top-bar">
					<ul class="breadcrumb">
						<li><a href="mainIndex">Home</a></li>
						<li><a href="mainIndex">call clerk </a></li>
					</ul>
				</div>
			</div>
		</div>

		<div class="content-holder">

			<!-- SLIDER 1 start -->
			<div id="mainCarousel" class="carousel slide" data-ride="carousel"
				style="width: 70%; margin: auto;">

				<!--페이지-->
				<ol class="carousel-indicators">
					<li data-target="#mainCarousel" data-slide-to="0" class="active"></li>
					<li data-target="#mainCarousel" data-slide-to="1"></li>
					<li data-target="#mainCarousel" data-slide-to="2"></li>
				</ol>
				<!--페이지-->

				<div class="carousel-inner">
					<!--슬라이드1-->
					<div class="item active">
						<a href="http://www.gyudong.com/4020"> <img
							src="include/images/main_visual_01.png" style="width: 100%"
							data-src="" alt="First slide"></a>
						<div class="container">
							<div class="carousel-caption">
								<p>보고있자면 슬퍼지는 비주얼...</p>
							</div>
						</div>
					</div>
					<!--슬라이드1-->

					<!--슬라이드2-->
					<div class="item">
						<a href="http://www.gyudong.com/4010"> <img
							src="include/images/main_visual_02.png" style="width: 100%"
							data-src="" alt="Second slide"></a>
						<div class="container">
							<div class="carousel-caption">
								<p>디자이너 휴가갔나봄..</p>
							</div>
						</div>
					</div>
					<!--슬라이드2-->

					<!--슬라이드3-->
					<div class="item">
						<a href="http://www.gyudong.com/4040"> <img
							src="include/images/main_visual_03.png" style="width: 100%"
							data-src="" alt="Third slide"></a>
						<div class="container"></div>
					</div>
					<!--슬라이드3-->
				</div>

				<!--이전, 다음 버튼-->
				<a class="left carousel-control" href="#mainCarousel"
					data-slide="prev"><span
					class="glyphicon glyphicon-chevron-left"></span></a> <a
					class="right carousel-control" href="#mainCarousel"
					data-slide="next"><span
					class="glyphicon glyphicon-chevron-right"></span></a>
			</div>
		</div>
		<!-- Content Holder Start -->
		<div class="content-holder">


			<button class="btn btn-default"  data-toggle="modal" data-target="#confirmModal" id="toOrder"
				style="display: block; margin: 0 auto;">to Order</button>


		</div>

	</div>


	<!-- 컨텐츠 영역 end -->



	<!-- tail start -->
	<jsp:include page="../include-tail.jsp" flush="false" />
	<!-- tail end -->


</body>
</html>