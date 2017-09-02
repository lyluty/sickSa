$(document).ready(function() {
  // 날짜 선택 달력 초기화
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
      center : 'title',
      right : 'today'
    }, // hearder 노출 메뉴

    footer : {
      left : 'prev',
      center : '',
      right : 'next'
    }, // footer 노출 메뉴

    height : "auto",

    selectable : true,
    select : function(start, end, jsEvent, view) {

      var dt_start = moment(start).format('YYYY-MM-DD');
      var dt_end = moment(end).format('YYYY-MM-DD');
      cf.startDate.value = moment(start).format('YYYY-MM-DD');
      cf.endDate.value = moment(end).format('YYYY-MM-DD');
    }
  })
});

$(function() {
  // 달력의 조회 버튼
  $('#content-sales-list button').click(function() {
    $('#content-sales-list').hide();
    $('#content-calendar').show();
  });

  // 매출 목록의 조회기간 선택 버튼
  $('#calendar-foot button').click(function() {
    var $tbody = $('#sales-list-table tbody');
    $tbody.html('<tr><th colspan="6">Please wait...</th></tr>');
    
    $('#content-calendar').hide();
    $('#content-sales-list').show();
    
    $.post('salesListByTimePeriod.ajax', $('#cf').serialize(), function(data) {
      if (data == '') {
        $tbody.html('<tr><th colspan="6">조회된 내역이 없습니다</th></tr>');
        return;
      }
      
      $tbody.empty();
      
      $.each(data, function(i, o) {
        $.each(o.orderDetailList, function(i, od) {
          var p = od.product;
          $tbody.append(
            '<tr>'
            + '<th>' + o.ord_id + '</th>'
            + '<td>' + p.pdt_name + '</td>'
            + '<td>' + od.ordt_amount + '</td>'
            + '<td>' + o.ord_total + '</td>'
            + '<td>' + o.ord_payment_method + '</td>'
            + '<td>' + formatDate(o.ord_date) + '</td>'
            + '</tr>');
        });
      });
    });
  });
});
