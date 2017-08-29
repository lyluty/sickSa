
$(document).ready(function() {
	$("#toOrder").click(function() {

		 $('#confirmModal').modal('show');
	});
});



/*

function checkType(){
	$.ajax({
	type:'post',
	url:'checkTypeBtn.jsp',

	contentType : "application/x-www-form-urlencoded; charset=utf-8",

	success : function(data) {
	    var e = $(data).find('찾으려는요소');
	    $("content").html(e);
	},	
	
	})
	
*/

