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

// modal jquery

// $(function (i) {
//	
// $('div.box-item img').dialog({
// modal: true,
// open: function ()
// {
// alert(i);
// $(this).load('productDetail/'+i);
// },
// height: 400,
// width: 400,
// title: 'Dynamically Loaded Page'
// });
// });

// $('div.box-item img').on('click',function(e){
// alert(e);
// $('div.grid-item').dialog({
// modal: true,
// open: function (e)
// {
// window.open(
// 'ingInsertForm','재료 항목 추가',
// 'width=700, height=500, left=0, top=0, toolbar=no, location=no,
// directories=no, status=no, menubar=no, resizable=no, scrollbars=no,
// copyhistory=no');
// /*$('#pdtImg'+e).load('productDetail/'+e);*/
// },
// height: 400,
// width: 400,
// title: 'Dynamically Loaded Page'
// });
// });

$('div.box-item img').on('click',function(e){
	alert(e);
	$('div.box-item img').modal({
		remote : 'productDetail/'+e
	});
});