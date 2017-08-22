<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<!-- head start -->
<jsp:include page="include-head.jsp" flush="false" />
<link rel='stylesheet' href='include/css/calendar/fullcalendar.css' />
<script src='include/css/calendar/jquery.min.js'></script>
<script src='include/css/calendar/moment.min.js'></script>
<script src='include/css/calendar/fullcalendar.js'></script>
<!-- head end -->
<script>
  $(document).ready(function() {
    $('#calendar').fullCalendar({
      customButtons : {
        EventButton : {
          text : 'Add Event',
          click : function(event, jsEvent, view) {
            $('#modal_calendar').modal('show');
          }
        }
      },
      header : {
        left : '',
        center : 'prev ,title, next',
        right : 'today'
      }, // hearder 노출 메뉴
      
      height : "auto",
      
      selectable : true,
      select : function(start, end, jsEvent, view) {
        
        var dt_start = moment(start).format('YYYY-MM-DD');
        var dt_end = moment(end).format('YYYY-MM-DD');
        cf.startDate.value = dt_start;
        cf.endDate.value = dt_end;
        /*
        $.ajax({
         type:"post",
         url:"viewList",
         dataType:"json",
         data:{"start_date":dt_start,"end_date":dt_end},
         success: reqPostResponse,
         error: errorNoti
         */
      }
    });
  });
  
  function salesView() {
    //cf.action = 'salesView';
    //cf.submit();
    var queryString = $("#cf").serialize();
    
    $.ajax({
      type : 'post',
      url : 'salesViewHtml',
      data : queryString,
      dataType : 'html',
      error: function(xhr, status, error){
          alert(error);
      },
      success : function(data){
        alert(data);
        $("#calendar").html(data);
      },
  });

  }
</script>
</head>
<body>
  <div class="animsition">
    <!-- header start -->
    <jsp:include page="include-header.jsp" flush="false" />
    <!-- header end -->

    <!-- 컨텐츠 영역 start -->
    <div class="hero-container">
      <div id='calendar' style="width: 70%; display: block; margin: auto;"></div>
      <form id="cf" name="cf" method="post">
        <input type="hidden" name="startDate" /> <input type="hidden" name="endDate" />
      </form>
      <button id="submit" class="btn btn-default" style="float: right; margin: 20px" onclick="salesView();">List view</button>
    </div>
    <!-- 컨텐츠 영역 end -->

    <!-- footer start -->
    <jsp:include page="include-footer.jsp" flush="false" />
    <!-- footer end -->
  </div>

  <!-- tail start -->
  <jsp:include page="include-tail.jsp" flush="false" />
  <script src='include/css/calendar/jquery.min.js'></script>
  <script src='include/css/calendar/moment.min.js'></script>
  <script src='include/css/calendar/fullcalendar.js'></script>
  <!-- tail end -->
</body>
</html>
