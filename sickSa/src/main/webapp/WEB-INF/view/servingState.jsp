<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<!-- head start -->
<jsp:include page="include-head.jsp" flush="false" />
<!-- head end -->
<!-- jquery.min.js 경로 수정 필요 -->
<script src='include/css/calendar/jquery.min.js'></script>
<script type="text/javascript">
  $(document).ready(function() {
    $.post('cookList', function(data) {
      $('#cookList').html(data);
    });
    $.post('servingList', function(data) {
      $('#servingList').html(data);
    });
  })
  
  function setState(ord_id, pdt_id, ord_state) {
    alert(pdt_id);
    alert(ord_state);
    $.post('setServingState', {
      'ord_id' : ord_id,
      'pdt_id' : pdt_id,
      'ord_state' : ord_state
    }, function(data) {
      $('#hero-container').html(data);
    })
  }
</script>
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
    <div class="hero-container">
      <div id="cookList" style="float: left; width: 48%; margin: auto"></div>
      <div id="servingList" style="float: right; width: 48%; margin: auto"></div>
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