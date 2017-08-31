/**
 * jQuery ajax java script
 */

/*****전역 초기화함수 로그인 체크******/
function init_ui() {
	alert('관리자에오?');
};

/*****전역 로드시 실행******/
$(window).load(function() {
	init_ui();
	igct_list_load();
});

/*$('ul#igctList li').click(function(i){
	alert("dd");
	ing_list_load(i);
});*/

function igct_list_load() {
	/*
	 * $.get(); Load data from the server using a HTTP GET request.
	 */
	
	$.ajax({
		url : 'igctList',
		type : 'POST',
		success : function(response) {
			/*var json_obj = $.parseJSON(response);
			var output="<ul>";
			for(var i = 0;i<json_obj.length;i++){
				output += 
					"<li>"
						+ json_obj[i].ing_id 
						+ json_obj[i].ing_name 
						+ json_obj[i].ing_stock 
						+ json_obj[i].ing_measure
						+ json_obj[i].ingredientDetails
						+ json_obj[i].ingredientCategories
					+"</li>";	
			}
			var output="</ul>";*/
			$("#contentHolder").html(response);
			
		},
		dataType: "html"//set to JSON
	});	
}

function ing_list_load(i){
	$('.ingP').hide();
	$('#ingList' + i).show();
	$.ajax({
		url : 'ingList/'+i,
		type : 'GET',
		dataType : 'html',
		success : function(data) {
			$("div#ingList"+i).html(data);
		},
	});
}

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
			'ingInsertForm','재료 항목 추가',
	'width=700, height=500, left=0, top=0, toolbar=no, location=no, directories=no, status=no, menubar=no, resizable=no, scrollbars=no, copyhistory=no');
}

function ing_insert_action(){
	document.getElementById("ingAddForm").action = 'ingInsertAction';
	document.getElementById("ingAddForm").method = 'POST';
	document.getElementById("ingAddForm").submit();
}


// 재료카테고리 이벤트처리
$('.panel-heading h3').on('click',function(e){
	$(this).parent().parent().next().fadeToggle();
});







