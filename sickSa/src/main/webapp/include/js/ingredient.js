/**
 * jQuery ajax java script
 */

/*****전역 초기화함수 로그인 체크******/
function init_ui() {
	
};

/*****전역 로드시 실행******/
$(window).load(function(igct_id) {
	init_ui();
	igct_list_load();
});

function igct_list_load() {
	$.ajax({
		url : 'igctList',
		type : 'POST',
		success : function(response) {
			$("#contentHolder").html(response);
		},
		dataType: "html"//set to JSON
	});	
}

// 재료 리스트를 불러온다.
function ing_list_load(igct_id){
	$.post('ingList', {igct_id : igct_id}, function(data) {
			$('#ingredientList'+igct_id).html(data).toggle();
			$('#ingredientList').hide();
	});
}

// 재료의 디테일 정보를 불러온다.
$('.panel-heading h3').on('click',function(){
	$(this).parent().parent().next().toggle();
});

$(document).on('click', '#addIgctAction', function(e) {
	$.ajax({
		url : 'igctInsertAction',
		type : 'POST',
		data : $('#igctForm').serialize(),
		success : function(data) {
			$(".modal").modal("hide");
		},
		error : function(data) {
			alert('4');
		}
	}); 
});

$(document).on('click', '#addIngAction', function(e) {
	$.ajax({
		url : 'ingInsertAction',
		type : 'POST',
		data : $('#ingForm').serialize(),
		success : function(data) {
			$(".modal").modal("hide");
		},
		error : function(data) {
			alert('4');
		}
	}); 
});


//$(window).load(function(e) {
//	
//	$('#addIgctAction').on('submit', function(e) {
//		alert('2');
//		e.preventDefaulut();
//		$.ajax({
//			url : '/igctInsertAction',
//			type : 'POST',
//			data : $('#igctForm').serialize(),
//			success : function(data) {
//				alert('3');
//			},
//			error : function(data) {
//				alert('4');
//			}
//		}); 
//		//$.post('/igctInsertAction', $('#igctForm').serialize());
//	});
//});

/*
function igct_insert_form(){
	window.open(
			'igctInsertForm','재료 항목 추가',
			'width=700, height=500, left=0, top=0, toolbar=no, location=no, directories=no, status=no, menubar=no, resizable=no, scrollbars=no, copyhistory=no');
}

function igct_insert_action(){
	document.getElementById("igctAddForm").action = 'igctInsertAction';
	document.getElementById("igctAddForm").method = 'POST';
	document.getElementById("igctAddForm").submit();
}

function ing_insert_form(){
	window.open(
			'ingInsertForm','재료 추가',
	'width=700, height=500, left=0, top=0, toolbar=no, location=no, directories=no, status=no, menubar=no, resizable=no, scrollbars=no, copyhistory=no');
}

function ing_insert_action(){
	document.getElementById("ingAddForm").action = 'ingInsertAction';
	document.getElementById("ingAddForm").method = 'POST';
	document.getElementById("ingAddForm").submit();
}
*/



