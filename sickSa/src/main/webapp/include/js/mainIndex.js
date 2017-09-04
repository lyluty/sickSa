$('.store-table').on('click', 'li', function() {
  var state = $(this).attr('data-state');
  
  if (state == 'available') {
    $('.store-table [data-state=selected]').attr('data-state', 'available');
    $(this).attr('data-state', 'selected');
  } else if (state == 'unavailable') {
    alert('이미 사용중입니다. 다른 자리를 선택해주세요');
  } else if (state == 'selected') {
    $(this).attr('data-state', 'available');
  }
});

$('.restModal .modal-footer .btn-primary').on('click', function() {
  var tableNo = $('.store-table [data-state=selected').attr('data-table-no');
  
  if (!tableNo) {
    alert('먼저 자리를 선택해주세요');
    return;
  }
  
  alert(tableNo + '번 자리 선택');
  location.href = 'vmMain';
});