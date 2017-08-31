<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<!-- head start -->
<jsp:include page="common/include-head.jsp" flush="false" />
<!-- head end -->
<!-- jquery.min.js 경로 수정 필요 -->
<script src='include/css/calendar/jquery.min.js'></script>
<script type="text/javascript">
  function cookList() {
    $.post('cookList', function(data) {
      $('#cookList').html(data);
    });
  }
  function servingList() {
    $.post('servingList', function(data) {
      $('#servingList').html(data);
    });
  }
  
  $(document).ready(function() {
    cookList();
    servingList();
  });
  
  function setState(ord_id, pdt_id, ordt_state) {
    $.post('setServingState', {
      'ord_id' : ord_id,
      'pdt_id' : pdt_id,
      'ordt_state' : ordt_state
    });
    cookList();
    servingList();
  }
</script>
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
          </div>
        </div>
        <div class="main-container">
          <div class="inner-banner parallax" data-parallax-speed="5" style="background-image: url(include/images/project-slide1.jpg); height: auto; min-height: 5px; max-height: 15px;">
            <h2 style="float: right; position: relative; top: -30px;">Order State</h2>
          </div>

          <!-- Content Holder Start -->

          <div class="content-holder">
            <div class="container" style="padding: auto; margin-bottom: 50px;">

              <div id="cookList" style="float: left; width: 48%; margin: auto;"></div>
              <div id="servingList" style="float: right; width: 48%; margin: auto;"></div>
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
  <!-- tail end -->
</body>
</html>