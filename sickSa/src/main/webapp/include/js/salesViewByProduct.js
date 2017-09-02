$(function() {
  // 카테고리 선택시
  $('#product-category-list select').change(function() {
    var cId = $(this).val();
    
    $('#sales-list').hide();
    
    if (cId == '') {
      $('#product-list').hide();
      return;
    }

    var $select = $('#product-list select');
    $select.html('<option value="">상품 정보를 불러오는 중입니다</option');
    
    $.post('productListByCategoryId2.ajax', {
      'cId' : cId
    }, function(data) {
      $select.html('<option value="">상품 선택</option>');
      $('#product-list').show();
      
      $.each(data, function(index, value) {
        var pId = value.pdt_id;
        var pName = value.pdt_name;
        $select.append('<option value="' + pId + '">' + pName + '</option>');
      });
    });
  });

  // 상품 선택시
  $('#product-list select').change(function() {
    var pId = $(this).val();

    if (pId == '') {
      $('#sales-list').hide();
      return;
    }
    
    var $tbody = $('#sales-list table tbody');
    $tbody.html('<tr><th colspan="6">Please wait...</th></tr>');
    $('#sales-list').show();

    $.post('orderListByProductId.ajax', {'pId' : pId}, function(data) {
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
            + '<th>'+ o.ord_id + '</th>'
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
