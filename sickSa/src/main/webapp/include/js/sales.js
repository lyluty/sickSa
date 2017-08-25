var calendarInitFn = function() {
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
    
    footer:{
    	left : 'prev',
    	center:'',
    	right : 'next'
    }, //footer 노출 메뉴
    
    height : "auto",
    
    selectable : true,
    select : function(start, end, jsEvent, view) {
      
      var dt_start = moment(start).format('YYYY-MM-DD');
      var dt_end = moment(end).format('YYYY-MM-DD');
      cf.startDate.value = dt_start;
      cf.endDate.value = dt_end;
    }
})};

$(document).ready(function() {
  showTimePeriod();
  calendarInitFn();
});

function salesList() {
  var queryString = $("#cf").serialize();

  $.ajax({
    type : 'post',
    url : 'salesListByTimePeriod.ajax',
    data : queryString,
    dataType : 'html',
    success : function(data) {
      $("#content").html(data);
    },
  });
}

function showTimePeriod() {
  $.ajax({
    type : 'POST',
    url : 'showTimePeriod.ajax',
    dataType : 'html',
    success : function(data) {
      $("#content").html(data);
      calendarInitFunction();
    }
  })
}