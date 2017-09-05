<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<link href="include/css/cart.css" rel="stylesheet" type="text/css">

<script type="text/javascript">
  //plugin bootstrap minus and plus
  //http://jsfiddle.net/laelitenetwork/puJ6G/
  $('.button-number').click(function(e) {
    e.preventDefault();
    
    fieldName = $(this).attr('data-field');
    type = $(this).attr('data-type');
    var input = $("input[name='" + fieldName + "']");
    var currentVal = parseInt(input.val());
    if (!isNaN(currentVal)) {
      if (type == 'minus') {
        
        if (currentVal > input.attr('min')) {
          input.val(currentVal - 1).change();
        }
        if (parseInt(input.val()) == input.attr('min')) {
          $(this).attr('disabled', true);
        }
        
      } else if (type == 'plus') {
        
        if (currentVal < input.attr('max')) {
          input.val(currentVal + 1).change();
        }
        if (parseInt(input.val()) == input.attr('max')) {
          $(this).attr('disabled', true);
        }
        
      }
    } else {
      input.val(0);
    }
  });
  $('.input-number').focusin(function() {
    $(this).data('oldValue', $(this).val());
  });
  $('.input-number').change(
      function() {
        minValue = parseInt($(this).attr('min'));
        maxValue = parseInt($(this).attr('max'));
        valueCurrent = parseInt($(this).val());
        name = $(this).attr('name');
        // 컨트롤러로 수량 변경 요청
        $.post('setOrdtAmount', {pId : name, amount : valueCurrent});
        // 가격 변경
        price = $('#price' + name).text();
        subtotal = price * valueCurrent;
        $('#subtotal' + name).text(subtotal);
        if (valueCurrent >= minValue) {
          $(".button-number[data-type='minus'][data-field='" + name + "']")
              .removeAttr('disabled')
        } else {
          alert('Sorry, the minimum value was reached');
          $(this).val($(this).data('oldValue'));
        }
        if (valueCurrent <= maxValue) {
          $(".button-number[data-type='plus'][data-field='" + name + "']")
              .removeAttr('disabled')
        } else {
          alert('Sorry, the maximum value was reached');
          $(this).val($(this).data('oldValue'));
        }
      });
  function deleteProduct(obj, pId) {
    $.post('deleteProductFromCart', {pId : pId}, function(data) {
      if (!data) {
        location.href = 'vmMain';
        return;
      }
      var tr = $(obj).parent().parent();
      tr.remove();
    })
  }
  function choicePaymentMethod(paymentMethod) {
    if (paymentMethod == 'card') {
      $('#cardBtn').attr('value', 'selected');
      $('#cashBtn').attr('value', 'unselected');
      $('#paymentMethod').val('카드');
    } else {
      $('#cardBtn').attr('value', 'unselected');
      $('#cashBtn').attr('value', 'selected');
      $('#paymentMethod').val('현금');
    }
  }
</script>
<div style="margin-bottom: 10%; margin-top: 5%">

  <table id="cartTable" class="table table-striped" style="margin: auto; text-align: center">
    <thead>
      <tr id="cart">
        <th width="10%">이미지</th>
        <th width="35%">상품명</th>
        <th width="15%">단가</th>
        <th width="15%">수량</th>
        <th width="15%">금액</th>
      </tr>
    </thead>
    <tbody id="tbody">
      <c:forEach var="orderDetail" items="${cart}">
        <c:set var="product" value="${orderDetail.product}"></c:set>
        <c:set var="pId" value="${product.pdt_id}"></c:set>
        <tr>
          <th><img src="${product.pdt_imgsrc_s}" /></th>
          <th>${product.pdt_name}</th>
          <th id="price${pId}">${product.pdt_price}</th>
          <th><div class="input-group">
              <span class="input-group-btn">
                <button type="button" class="button button-danger button-number" data-type="minus" data-field="${pId}">
                  <span class="glyphicon glyphicon-minus"></span>
                </button>
              </span> <input type="text" name="${pId}" class="form-control input input-number" value="${orderDetail.ordt_amount}" min="1" max="100" disabled="disabled"> <span class="input-group-btn">
                <button type="button" class="button button-success button-number" data-type="plus" data-field="${pId}">
                  <span class="glyphicon glyphicon-plus"></span>
                </button>
              </span>
            </div></th>
          <th id="subtotal${pId}" width="15%">${product.pdt_price * orderDetail.ordt_amount}</th>
          <td><button class="myBtn" onclick="deleteProduct(this, ${pId})">삭제</button></td>
        </tr>
      </c:forEach>
    </tbody>
  </table>
</div>

<div id="footer">
  <button id="cashBtn" class="button" onclick="choicePaymentMethod('cash')" value="unselected">현금</button>
  <button id="cardBtn" class="button" onclick="choicePaymentMethod('card')" value="unselected">카드</button>
  <button id="payBtn" class="myBtn" onclick="payNow()" style="float: right; height: 100%;">결제하기</button>
  <form id="payF" method="POST" action="payNow">
    <input id="paymentMethod" name="paymentMethod" type="hidden" />
  </form>
</div>
