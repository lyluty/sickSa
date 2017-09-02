$(document).ready(function() {
  cookingList();
  servingList();
});

$(function() {
  $('#cooking-list tbody').on('click', 'tr', function() {
    var $tr = $(this);
    var oId = $tr.attr('data-oId');
    var pId = $tr.attr('data-pId');
    var sData = {
        'ord_id' : oId,
        'pdt_id' : pId,
        'ordt_state' : 'C'
      };
    $.post('setServingState.ajax', sData, function(data) {
      servingList();
      $tr.remove();
    });
  });
  
  $('#serving-list tbody').on('click', 'tr', function() {
    var $tr = $(this);
    var oId = $tr.attr('data-oId');
    var pId = $tr.attr('data-pId');
    var sData = {
        'ord_id' : oId,
        'pdt_id' : pId,
        'ordt_state' : 'S'
      };
    $.post('setServingState.ajax', sData, function(data) {
      $tr.remove();
    });
  });
});

function cookingList() {
  $.post('cookList.ajax', {'state' : 'B'}, function(data) {
    $tbody = $('#cooking-list tbody');
    $tbody.empty();
    
    $.each(data, function(i, o) {
      $.each(o.orderDetailList, function(i, od) {
        var p = od.product;
        $tbody.append(
          '<tr data-oId="' + o.ord_id + '" data-pId="' + p.pdt_id + '">'
          + '<th>' + o.ord_id + '</th>'
          + '<td>' + p.pdt_name + '</td>'
          + '<td>' + od.ordt_amount + '</td>'
          + '</tr>');
      });
    });
  });
}

function servingList() {
  $.post('cookList.ajax', {'state' : 'C'}, function(data) {
    $tbody = $('#serving-list tbody');
    $tbody.empty();
    
    $.each(data, function(i, o) {
      $.each(o.orderDetailList, function(i, od) {
        var p = od.product;
        $tbody.append(
          '<tr data-oId="' + o.ord_id + '" data-pId="' + p.pdt_id + '">'
          + '<th>' + o.ord_id + '</th>'
          + '<td>' + p.pdt_name + '</td>'
          + '<td>' + od.ordt_amount + '</td>'
          + '<td>' + o.tbl_id + '</td>'
          + '</tr>');
      });
    });
  });
}
