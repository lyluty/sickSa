<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<head>
<!-- head start -->
<jsp:include page="include-head.jsp" flush="false" />
<!-- head end -->
</head>
<body>
  <div class="animsition">
    <!-- nav start -->
    <jsp:include page="include-navigator.jsp" flush="false" />
    <!-- nav end -->

    <!-- header start -->
    <jsp:include page="include-header.jsp" flush="false" />
    <!-- header end -->

    <!-- 컨텐츠 영역 start -->
    <div class="container" style="height: 80%">
      <!-- top start -->
      <jsp:include page="include-vm_top.jsp" />
      <!-- top end -->
      <div style="height: 80%; display: block; margin: 0 auto">
       뭔가 사진이나 광고가 들어갔으면 좋겠는 영역이네요</div>
      <div>
        <button class="btn btn-default" style="display: block; margin: 0 auto">주문하시죠</button>
      </div>
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