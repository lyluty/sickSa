$(document).ready(function() {
	$("#toOrder").click(function() {

	
	});
});

$('#mainModal').on('show.bs.modal', function (e) {
    var loadurl = $(e.relatedTarget).data('checkModal.do');
    $(this).find('.modal-header').load(loadurl);
    $(this).find('.modal-body').load(loadurl);

    $(this).find('.modal-footer').load(loadurl);
});

/*
$(document).ready(function() {
	$("#toOrder").click(function() {

		 $("#restModal").modal({
			 
			 
			 
		 })
		 
	});
});







function showModal() {
	  $.ajax({
	    type : 'POST',
	    url : 'checkModal.do',
	    dataType : 'html',
	    success : function(data) {
	      $("#modal").html(data);
	      initModal();
	    }
	  })
}
*/

