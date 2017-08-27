<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<html>
<head>
<!-- head start -->
<jsp:include page="include-head.jsp" flush="false" />
<!-- head end -->
<script type="text/javascript">
  function showProductList(categoryId) {
    $.post('productListByCategoryId.ajax', {categoryId : categoryId}, function(data) {
      $('#content').html(data);
    });
  }
  function addToCart(productId) {
    $.post('addToCart.ajax', {productId : productId}, function(data) {
      $('#content').html(data);
    });
  }
  function orderNow() {
    $.post('orderNow.ajax');
  }
</script>
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
    <jsp:include page="include-header.jsp" flush="false" />
    <!-- header end -->

    <!-- 컨텐츠 영역 start -->
    <div class="container" style="height: 80%">

      <!-- top start -->
      <jsp:include page="include-vm_top.jsp" />
      <!-- top end -->
      <div id="content" style="height: 80%; display: block; margin: 0 auto"></div>
    </div>
    <!-- 컨텐츠 영역 end -->

    <!-- footer start -->
    <jsp:include page="include-footer.jsp" flush="false" />
    <!-- footer end -->
  </div>

  <!-- tail start -->
  <jsp:include page="include-tail.jsp" flush="false" />
  <!-- tail end -->
</body>
</html>