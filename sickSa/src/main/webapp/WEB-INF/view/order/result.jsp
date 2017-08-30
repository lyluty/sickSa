<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


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
    <button class="action action--open" aria-label="Open Menu">
      <span class="icon icon--menu"></span>
    </button>
    <nav id="ml-menu" class="menu">
      <button class="action action--close" aria-label="Close Menu">
        <span class="icon icon--cross"></span>
      </button>
      <div class="menu__wrap">
        <ul data-menu="main" class="menu__level">
          <li class="menu__item"><a class="menu__link menu__link--current" data-submenu="submenu-1" href="#">Home</a></li>
          <c:forEach var="productCategory" items="${productCategoryList}">
            <li class="menu__item"><a class="menu__link" href="javascript:showProductList(${productCategory.pdct_id})">${productCategory.pdct_name}</a></li>
          </c:forEach>
        </ul>
      </div>
    </nav>
    <!-- nav end -->

    <!-- header start -->
    <jsp:include page="../common/include-header.jsp" flush="false" />
    <!-- header end -->

    <!-- 컨텐츠 영역 start -->
    <div class="container" style="height: 80%">

      <!-- top start -->
      <jsp:include page="../common/include-vm_top.jsp" />
      <!-- top end -->
      <div id="content" style="height: 80%; display: block; margin: 0 auto">
      <h3>주문이 성공해서 나오는 페이지인데 디자인 좀 해주실분?</h3>
      <h6>주문번호:${order.ord_id}</h6>
      <h6>주문일시:${order.ord_date}</h6>
      <h6>주문금액:${order.ord_total}</h6>
      </div>
    </div>
    <!-- 컨텐츠 영역 end -->

    <!-- footer start -->
    <jsp:include page="../common/include-footer.jsp" flush="false" />
    <!-- footer end -->
  </div>

  <!-- tail start -->
  <jsp:include page="../common/include-tail.jsp" flush="false" />
  <script src='include/js/order.js'></script>
  <!-- tail end -->
</body>
</html>