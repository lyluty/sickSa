<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

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
    <div class="hero-container"></div>
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