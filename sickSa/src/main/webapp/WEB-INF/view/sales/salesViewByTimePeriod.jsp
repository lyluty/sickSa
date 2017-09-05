<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<!-- head start -->
<jsp:include page="../common/include-head.jsp" flush="false" />
 <script src='include/js/jquery-2.2.2.min.js'></script>
<link rel='stylesheet' href='include/calendar/fullcalendar.css' />
  <script src='include/calendar/moment.min.js'></script>
  <script src='include/calendar/fullcalendar.js'></script>
    <script src='include/js/salesView.js'></script>
  <script src='include/js/salesViewByTimePeriod.js'></script>
  <script src="include/js/jquery-2.2.2.min.js"></script>

  

<!-- head end -->
</head>
<body>
  <div class="animsition">
    <!-- nav start -->
    <jsp:include page="../common/include-navigator.jsp" flush="false" />
    <!-- nav end -->

    <!-- header start -->
    <jsp:include page="../common/include-header.jsp" flush="false" />
    <!-- header end -->

    <div class="main-container-outer">
      <div class="container">
        <div class="top-bar-container">
          <div class="container">
            <div class="top-bar">
              <ul class="breadcrumb">
                <li><a href="index.html">Home</a></li>
                <li><span>sales </span></li>
              </ul>
            </div>
            
            			<div class="top-bar" style="width:60px;float:right;">
				<ul class="breadcrumb">
				<c:choose>
					<c:when test="${loginStatus }">
						<li id="logoutB" ><a href="logout">Logout</a></li>
					</c:when>
					<c:otherwise>
						<li id="adminB"><a href="loginForm">Admin</a></li>
					</c:otherwise>
				</c:choose>
			</ul>
			</div>
          </div>
        </div>
        <div class="main-container">
          <div class="inner-banner parallax" data-parallax-speed="5" style="background-image: url(include/images/project-slide1.jpg); height: auto; min-height: 5px; max-height: 15px;">
            <h2 style="float: right; position: relative; top: -30px;">Sales</h2>
          </div>
          <!-- Content Holder Start -->
          <div class="content-holder">

            <!-- 컨텐츠 영역 start -->
            <!-- <div id="content" class="container" style="margin-bottom: 100px;" data-os-animation="fadeInUp" data-os-animation-delay="0s"> -->
            <div id="content" style="margin-bottom: 100px;">
              <!-- 달력 -->
              <div id="content-calendar">
                <div id='calendar' style="width: 50%; display: block; margin: 0 auto; vertical-align: middle;"></div>
                <div id='calendar-foot'>
                  <form id="cf" name="cf" method="POST">
                    <input type="hidden" name="startDate" /> <input type="hidden" name="endDate" />
                  </form>
                  <button class="btn btn-default" style="display: block; margin: 0 auto; width: 100px;">조회</button>
                </div>
              </div>
              <!-- 달력 -->

              <!-- 매출 목록 -->
              <div id="content-sales-list" hidden="true">
                <h3 class="content-title">기간별 매출 조회</h3>
                <button class="btn btn-default" style="margin: 2% 0;">&lt;&nbsp;조회기간 선택</button>
                <div id="sales-list-table">
                  <table class="table table-striped" style="margin: 1% 0;">
                    <thead>
                      <tr>
                        <th>주문번호</th>
                        <th>상품명</th>
                        <th>주문상품개수</th>
                        <th>금액</th>
                        <th>결제수단</th>
                        <th>결제일시</th>
                      </tr>
                    </thead>
                    <tbody>
                    </tbody>
                  </table>
                </div>
              </div>
              <!-- 매출 목록 -->

            </div>
          </div>
          <!-- 컨텐츠 영역 end -->

        </div>
      </div>
    </div>
  </div>

  <!-- footer start -->
  <jsp:include page="../common/include-footer.jsp" flush="false" />
  <!-- footer end -->

  <!-- tail start -->
  <jsp:include page="../common/include-tail.jsp" flush="false" />


  <script src='include/calendar/moment.min.js'></script>
  <script src='include/calendar/fullcalendar.js'></script>

   <script src='include/js/salesView.js'></script>
  <script src='include/js/salesViewByTimePeriod.js'></script>
  
  
<!--
  <script src='include/calendar/moment.min.js'></script>
  <script src='include/calendar/fullcalendar.js'></script>

    <script src='include/js/salesView.js'></script>
  <script src='include/js/salesViewByTimePeriod.js'></script>
  
  -->
  <!-- tail end -->
</body>
</html>
