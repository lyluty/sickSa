$(document).ready(function() {
	$("#toOrder").click(function() {
		$('.orderModal').dialog({
			modal: true,
			open: function (){
//				window.open('productDetail/'+i,'재료 항목 추가',
//				'width=700, height=500, left=0, top=0, toolbar=no, location=no, directories=no, status=no, menubar=no, resizable=no, scrollbars=no, copyhistory=no');
          $('div.modal-body').load("checkModal");
			},        
			height: 400,
			width: 400,
			title: 'Dynamically Loaded Page'
		});

	});
});




/*
$('#mModal').on('show.bs.modal', function (e) {
    var loadurl = $(e.relatedTarget).data('checkModal.do');
    $(this).find('.modal-header').load(loadurl);
    $(this).find('.modal-body').load(loadurl);

    $(this).find('.modal-footer').load(loadurl);
});
*/

