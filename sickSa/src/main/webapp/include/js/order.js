function back() {
  history.back();
}
function showProductList(categoryId) {
  $.post('productListByCategoryId.ajax', {
    categoryId : categoryId
  }, function(data) {
    $('#content').html(data);
  });
// $.get('_productList?cateNo=' + categoryId, function(data) {
// $('#content').html(data);
// });
}
function orderNow(productId) {
  $.post('orderNow.ajax', {
    productId : productId
  }, function(data) {
    $('#content').html(data);
  });
}
function addToCart(productId) {
  $.post('addToCart.ajax', {
    productId : productId
  }, function(data) {
    $('#content').html(data);
  });
}
// function choicePaymentMethod() {
// $.post('choicePaymentMethod.ajax', function(data) {
// $('#content').html(data);
// });
// }

function payNow() {
  var paymentMethod = $('#paymentMethod').val();
  alert(paymentMethod);
  if (!paymentMethod) {
    alert('먼저 결제수단을 선택해주세요');
  } else {
    payF.submit();
  }
}


//$(function (i)    {
//	alert(i);
//    $('div.box-item img').dialog({
//        modal: true,
//        open: function (){
//            $(window).load('productDetail/'+i);
//        },         
//        height: 400,
//        width: 400,
//        title: 'Dynamically Loaded Page'
//    });
//});

//$('div.project-heading button').on('click',function(e){
//	alert($(e.target).attr('id'));
//	var i = $(e.target).attr('id');
//	
//	$('div.box-item img#'+i).dialog({
//		modal: true,
//        open: function (){
//        	window.open('productDetail/'+i,'재료 항목 추가',
//        	'width=700, height=500, left=0, top=0, toolbar=no, location=no, directories=no, status=no, menubar=no, resizable=no, scrollbars=no, copyhistory=no');
//            $('div.modal-body').load('productDetail/'+i);
//        },        
//        height: 400,
//        width: 400,
//        title: 'Dynamically Loaded Page'
//    });
//});

//$('div.box-item img').on('click',function(e){
//	alert(e);
//	$('div.box-item img').modal({
//		remote : 'productDetail/'+e
//	});
//});
