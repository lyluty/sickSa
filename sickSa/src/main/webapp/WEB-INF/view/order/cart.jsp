<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<style>
.center {
  text-align: center;
}

.merge-bottom-input {
  width: 67px; border-bottom-left-radius: 0; border-bottom-right-radius: 0;
}

.merge-top-left-button {
  border-top-left-radius: 0;
}

.merge-top-right-button {
  border-top-right-radius: 0;
}

.button {
  display: inline-block; padding: 6px 12px; margin-bottom: 0; font-size: 14px; font-weight: normal; line-height: 1.42857143; text-align: center; white-space: nowrap; vertical-align: middle; -ms-touch-action: manipulation; touch-action: manipulation; cursor: pointer; -webkit-user-select: none; -moz-user-select: none; -ms-user-select: none; user-select: none; background-image: none; border: 1px solid transparent; border-radius: 4px;
}

.button:focus, .button:active:focus, .button.active:focus, .button.focus, .button:active.focus, .button.active.focus {
  outline: thin dotted; outline: 5px auto -webkit-focus-ring-color; outline-offset: -2px;
}

.button:hover, .button:focus, .button.focus {
  color: #333; text-decoration: none;
}

.button:active, .button.active {
  background-image: none; outline: 0; -webkit-box-shadow: inset 0 3px 5px rgba(0, 0, 0, .125); box-shadow: inset 0 3px 5px rgba(0, 0, 0, .125);
}

.button.disabled, .button[disabled], fieldset[disabled] .button {
  pointer-events: none; cursor: not-allowed; filter: alpha(opacity = 65); -webkit-box-shadow: none; box-shadow: none; opacity: .65;
}

.button-success {
  color: #fff; background-color: #5cb85c; border-color: #4cae4c;
}

.button-success:hover, .button-success:focus, .button-success.focus, .button-success:active, .button-success.active, .open>.dropdown-toggle.button-success {
  color: #fff; background-color: #449d44; border-color: #398439;
}

.button-success:active, .button-success.active, .open>.dropdown-toggle.button-success {
  background-image: none;
}

.button-success.disabled, .button-success[disabled], fieldset[disabled] .button-success, .button-success.disabled:hover, .button-success[disabled]:hover, fieldset[disabled] .button-success:hover, .button-success.disabled:focus, .button-success[disabled]:focus, fieldset[disabled] .button-success:focus, .button-success.disabled.focus, .button-success[disabled].focus, fieldset[disabled] .button-success.focus, .button-success.disabled:active, .button-success[disabled]:active, fieldset[disabled] .button-success:active, .button-success.disabled.active, .button-success[disabled].active, fieldset[disabled] .button-success.active {
  background-color: #5cb85c; border-color: #4cae4c;
}

.button-success .badge {
  color: #5cb85c; background-color: #fff;
}

.button-danger {
  color: #fff; background-color: #d9534f; border-color: #d43f3a;
}

.button-danger:hover, .button-danger:focus, .button-danger.focus, .button-danger:active, .button-danger.active, .open>.dropdown-toggle.button-danger {
  color: #fff; background-color: #c9302c; border-color: #ac2925;
}

.button-danger:active, .button-danger.active, .open>.dropdown-toggle.button-danger {
  background-image: none;
}

.button-danger.disabled, .button-danger[disabled], fieldset[disabled] .button-danger, .button-danger.disabled:hover, .button-danger[disabled]:hover, fieldset[disabled] .button-danger:hover, .button-danger.disabled:focus, .button-danger[disabled]:focus, fieldset[disabled] .button-danger:focus, .button-danger.disabled.focus, .button-danger[disabled].focus, fieldset[disabled] .button-danger.focus, .button-danger.disabled:active, .button-danger[disabled]:active, fieldset[disabled] .button-danger:active, .button-danger.disabled.active, .button-danger[disabled].active, fieldset[disabled] .button-danger.active {
  background-color: #d9534f; border-color: #d43f3a;
}

.button-danger .badge {
  color: #d9534f; background-color: #fff;
}

.button-sm, .button-group-sm>.button {
  padding: 5px 10px; font-size: 12px; line-height: 1.5; border-radius: 3px;
}

.button-block {
  display: block; width: 100%;
}

.button-block+.button-block {
  margin-top: 5px;
}
</style>
<script type="text/javascript">
$(document).ready( () => {
  $('.minus-button').click( (e) => {
    
    // change this to whatever minimum you'd like
    const minValue = 1

    const currentInput = $(e.currentTarget).parent().prev()[0];

    let minusInputValue = $(currentInput).html();

    if (minusInputValue > minValue) {
      minusInputValue --;
      $($(e.currentTarget).next()).removeAttr('disabled');
      $(currentInput).html(minusInputValue);

      if (minusInputValue <= minValue) {
        $(e.currentTarget).attr('disabled', 'disabled');
      }
    }
  });

  $('.plus-button').click( (e) => {
      
    const maxValue = 99

    const currentInput = $(e.currentTarget).parent().prev()[0];

    let plusInputValue = $(currentInput).html();

    if (plusInputValue < maxValue) {
      plusInputValue ++;
      $($(e.currentTarget).prev()[0]).removeAttr('disabled');
      $(currentInput).html(plusInputValue);

      if (plusInputValue >= maxValue) {
        $(e.currentTarget).attr('disabled', 'disabled');
      }
    }
  });
});




//plugin bootstrap minus and plus
//http://jsfiddle.net/laelitenetwork/puJ6G/
$('.button-number').click(function(e){
  e.preventDefault();
  
  fieldName = $(this).attr('data-field');
  type      = $(this).attr('data-type');
  var input = $("input[name='"+fieldName+"']");
  var currentVal = parseInt(input.val());
  if (!isNaN(currentVal)) {
      if(type == 'minus') {
          
          if(currentVal > input.attr('min')) {
              input.val(currentVal - 1).change();
          } 
          if(parseInt(input.val()) == input.attr('min')) {
              $(this).attr('disabled', true);
          }

      } else if(type == 'plus') {

          if(currentVal < input.attr('max')) {
              input.val(currentVal + 1).change();
          }
          if(parseInt(input.val()) == input.attr('max')) {
              $(this).attr('disabled', true);
          }

      }
  } else {
      input.val(0);
  }
});
$('.input-number').focusin(function(){
 $(this).data('oldValue', $(this).val());
});
$('.input-number').change(function() {
  
  minValue =  parseInt($(this).attr('min'));
  maxValue =  parseInt($(this).attr('max'));
  valueCurrent = parseInt($(this).val());
  
  name = $(this).attr('name');
  if(valueCurrent >= minValue) {
      $(".button-number[data-type='minus'][data-field='"+name+"']").removeAttr('disabled')
  } else {
      alert('Sorry, the minimum value was reached');
      $(this).val($(this).data('oldValue'));
  }
  if(valueCurrent <= maxValue) {
      $(".button-number[data-type='plus'][data-field='"+name+"']").removeAttr('disabled')
  } else {
      alert('Sorry, the maximum value was reached');
      $(this).val($(this).data('oldValue'));
  }
  
  
});
$(".input-number").keydown(function (e) {
      // Allow: backspace, delete, tab, escape, enter and .
      if ($.inArray(e.keyCode, [46, 8, 9, 27, 13, 190]) !== -1 ||
           // Allow: Ctrl+A
          (e.keyCode == 65 && e.ctrlKey === true) || 
           // Allow: home, end, left, right
          (e.keyCode >= 35 && e.keyCode <= 39)) {
               // let it happen, don't do anything
               return;
      }
      // Ensure that it is a number and stop the keypress
      if ((e.shiftKey || (e.keyCode < 48 || e.keyCode > 57)) && (e.keyCode < 96 || e.keyCode > 105)) {
          e.preventDefault();
      }
  });
</script>

<table id="cartTable" class="table table-striped" style="margin: auto 0;">
  <thead>
    <tr>
      <th>이미지</th>
      <th>상품명</th>
      <th>단가</th>
      <th>수량</th>
      <th>금액</th>
    </tr>
  </thead>
  <tbody>
    <c:forEach var="orderDetail" items="${cart}">
      <c:set var="product" value="${orderDetail.product}"></c:set>
      <tr>
        <th><img src="${product.pdt_imgsrc_s}" width="15%" /></th>
        <th><h4>${product.pdt_name}</h4></th>
        <th><h4>${product.pdt_price}</h4></th>
        <th><h4>${orderDetail.ordt_amount}</h4></th>
        <th><h4>${product.pdt_price * orderDetail.ordt_amount}</h4></th>
        <td><button class="btn btn-default">삭제</button></td>
      </tr>
    </c:forEach>
  </tbody>
</table>

<div>
  <button class="btn btn-default" onclick="choicePaymentMethod()">결제하기</button>
</div>

<div class="row">

  <div class="col-sm-3"></div>

  <div class="col-sm-2">
    <label>First</label>
    <!-- purely semantic -->
    <div class="form-control input-sm center merge-bottom-input" name="first">1</div>

    <div class="button-group button-block" role="group" aria-label="plus-minus">
      <button type="button" class="button button-sm button-danger minus-button merge-top-left-button" disabled="disabled">
        <span class="glyphicon glyphicon-minus"></span>
      </button>
      <button type="button" class="button button-sm button-success plus-button merge-top-right-button">
        <span class="glyphicon glyphicon-plus"></span>
      </button>
    </div>
    <!-- end button group -->
  </div>
  <!-- end column -->

</div>
<!-- end row -->

<div class="center">
  <p></p>
  <div class="input-group">
    <span class="input-group-btn">
      <button type="button" class="button button-default button-number" disabled="disabled" data-type="minus" data-field="quant[1]">
        <span class="glyphicon glyphicon-minus"></span>
      </button>
    </span> <input type="text" name="quant[1]" class="form-control input-number" value="1" min="1" max="10"> <span class="input-group-btn">
      <button type="button" class="button button-default button-number" data-type="plus" data-field="quant[1]">
        <span class="glyphicon glyphicon-plus"></span>
      </button>
    </span>
  </div>
  <p></p>
  <p></p>
  <div class="input-group">
    <span class="input-group-btn">
      <button type="button" class="button button-danger button-number" data-type="minus" data-field="quant[2]">
        <span class="glyphicon glyphicon-minus"></span>
      </button>
    </span> <input type="text" name="quant[2]" class="form-control input-number" value="10" min="1" max="100"> <span class="input-group-btn">
      <button type="button" class="button button-success button-number" data-type="plus" data-field="quant[2]">
        <span class="glyphicon glyphicon-plus"></span>
      </button>
    </span>
  </div>
  <p></p>
</div>