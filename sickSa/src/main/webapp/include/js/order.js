function back() {
  history.back();
}
function showProductList(categoryId) {
  $.post('productListByCategoryId.ajax', {
    categoryId : categoryId
  }, function(data) {
    $('#content').html(data);
  });
//  $.get('_productList?cateNo=' + categoryId, function(data) {
//    $('#content').html(data);
//  });
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
//function choicePaymentMethod() {
//  $.post('choicePaymentMethod.ajax', function(data) {
//    $('#content').html(data);
//  });
//}

function payNow(paymentMethod) {
  $.post('payNow.ajax', {
    paymentMethod : paymentMethod
  }, function(data) {
  });
}
