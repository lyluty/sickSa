<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<html>
<head>
<style>
#myUl {
  list-style: none; font-style: italic; font-weight: bold;
}

#myUl #myLi {
  float: left; margin: 0px 20px;
}
</style>
<!-- head start -->
<jsp:include page="../common/include-head.jsp" flush="false" />
<!-- head end -->
<script>
  function productList(categoryId) {
    $.post('productList.ajax', {
      'categoryId' : categoryId
    }, function(data) {
      $('#productList').html(data);
    });
  }
  function salesListByProductId(productId) {
    $.post('salesListByProductId.ajax', {
      'productId' : productId
    }, function(data) {
      var $salesListDiv = $('.salesList[data-productId=' + productId + ']');
      $salesListDiv.html(data);
      $('.salesList').hide();
      $salesListDiv.show();
    });
  }
</script>
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
          </div>
        </div>
        <div class="main-container">
          <div class="inner-banner parallax" data-parallax-speed="5" style="background-image: url(include/images/project-slide1.jpg); height: auto; min-height: 5px; max-height: 15px;">
            <h2 style="float: right; position: relative; top: -30px;">Sales</h2>
          </div>
          <!-- Content Holder Start -->
          <div class="content-holder">

            <!-- 컨텐츠 영역 start -->
            <div id="content" class="container" style="margin-bottom: 100px">

              <!-- 베스트 셀러 영역 -->
              <div id="bestSeller" style="width: 100%; padding-bottom: 30%">
                <h4 class="content-title">베스트셀러</h4>
                <c:forEach var="product" items="${bestSellerList}" varStatus="varStatus">
                  <div id="bestSeller-product" style="width: 23%; float: left; margin: 1%">
                    <h5 align="center">${varStatus.count}.&nbsp;${product.pdt_name}</h5>
                    <img src="${product.pdt_imgsrc_s}" />
                  </div>
                </c:forEach>
              </div>
              <!-- 베스트 셀러 영역 -->

              <br />

              <!-- 상품 카테고리 리스트 -->
              <div id="productCategoryList" class="content-holder">
                <h4 class="content-title">상품별 매출 조회</h4>
                <ul id="myUl">
                  <c:forEach var="productCategory" items="${productCategoryList}">
                    <c:set var="categoryId" value="${productCategory.pdct_id}"></c:set>
                    <c:set var="categoryName" value="${productCategory.pdct_name}"></c:set>
                    <li id="myLi"><a href="javascript:productList(${categoryId})">${categoryName}</a></li>
                  </c:forEach>
                </ul>
              </div>
              <hr />
              <br />
              <!-- 상품 카테고리 리스트 -->
              <!-- 상품 리스트 -->
              <div id="productList"></div>
              <!-- 상품 리스트 -->

            </div>
            <!-- 컨텐츠 영역 end -->

          </div>
        </div>
      </div>
    </div>

    <!-- footer start -->
    <jsp:include page="../common/include-footer.jsp" flush="false" />
    <!-- footer end -->
  </div>

  <!-- tail start -->
  <jsp:include page="../common/include-tail.jsp" flush="false" />
  <script src='include/css/calendar/jquery.min.js'></script>
  <script src='include/css/calendar/moment.min.js'></script>
  <script src='include/css/calendar/fullcalendar.js'></script>
  <!-- tail end -->
</body>
</html>
