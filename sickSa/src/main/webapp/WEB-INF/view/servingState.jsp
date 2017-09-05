<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<html>
<head>
<!-- head start -->
<jsp:include page="common/include-head.jsp" flush="false" />

<!-- head end -->
</head>
<body>
  <div class="animsition">
    <!-- nav start -->
    <jsp:include page="common/include-navigator.jsp" flush="false" />
    <!-- nav end -->

    <!-- header start -->
    <jsp:include page="common/include-header.jsp" flush="false" />
    <!-- header end -->

    <!-- 컨텐츠 영역 start -->

    <div class="main-container-outer">
      <div class="container">
        <div class="top-bar-container">
          <div class="container">
            <div class="top-bar">
              <ul class="breadcrumb">
                <li><a href="index.html">Home</a></li>
                <li><span>Order State </span></li>
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
            <h2 style="float: right; position: relative; top: -30px;">Order State</h2>
          </div>

          <!-- Content Holder Start -->

          <div class="content-holder">
            <div class="container" style="padding: auto; margin-bottom: 50px;">

              <div id="cooking-list" style="float: left; width: 48%; margin: auto;">
                <table class="table table-striped">
                  <thead>
                    <tr>
                      <th>주문번호</th>
                      <th>상품명</th>
                      <th>수량</th>
                    </tr>
                  </thead>
                  <tbody>
                  </tbody>
                </table>
              </div>
              <div id="serving-list" style="float: right; width: 48%; margin: auto;">
                <table class="table table-striped">
                  <thead>
                    <tr>
                      <th>주문번호</th>
                      <th>상품명</th>
                      <th>수량</th>
                      <th>테이블번호</th>
                    </tr>
                  </thead>
                  <tbody>
                  </tbody>
                </table>
              </div>
            </div>
          </div>

        </div>
      </div>
    </div>


    <!-- 컨텐츠 영역 end -->

    <!-- footer start -->
    <jsp:include page="common/include-footer.jsp" flush="false" />
    <!-- footer end -->
  </div>


  <!-- tail start -->
  <jsp:include page="common/include-tail.jsp" flush="false" />
  <script src='include/js/servingState.js'></script>
  <!-- tail end -->
</body>
</html>