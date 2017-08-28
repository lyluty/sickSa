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
	alert(i);
	$.ajax({
		url : 'ingList/'+i,
		type : 'GET',
		data : Number,
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

/*function igct_insert_action(){
	document.getElementById("igctF").action = 'igctInsertAction';
	document.getElementById("igctF").submit();
}*/

function ing_insert_form(){
	window.open(
			'ingInsertForm','재료 항목 추가',
	'width=700, height=500, left=0, top=0, toolbar=no, location=no, directories=no, status=no, menubar=no, resizable=no, scrollbars=no, copyhistory=no');
}

<<<<<<< HEAD
/*function ing_insert_action(){
	document.f.action = 'ingInsertAction';
	document.f.submit();
}*/
=======
    // 뒤 검은 마스크를 클릭시에도 모두 제거하도록 처리합니다.
    $('.mask').click(function () {
        $(this).hide();
        $('.window').hide();
    });
    
    
    //  재료카테고리 이벤트처리
   	$('.panel-heading h6').on('click',function(e){
    	$(this).parent().parent().next().fadeToggle();
    });
    	
  
    
});
>>>>>>> branch 'master' of https://github.com/lyluty/sickSa


/**
 * ing java script
 */

function ingredientCreate() {
	document.igctAddForm.serialize();
	document.f.action = '/insertActionIngredients';
	document.f.submit();
}

function ingredientModifyAction() {
	if (f.ing_name.value == "") {
		alert("이름을 입력하십시요.");
		f.ing_name.focus();
		return false;
	}
	if (f.ing_email.value == "") {
		alert("이메일을 입력하십시요.");
		f.ing_email.focus();
		return false;
	}
	if (f.ing_homepage.value == "") {
		alert("홈페이지를 입력하십시요.");
		f.ing_homepage.focus();
		return false;
	}

	if (f.ing_title.value == "") {
		alert("제목을 입력하십시요.");
		f.ing_title.focus();
		return false;
	}
	if (f.ing_content.value == "") {
		alert("내용을 입력하십시요.");
		f.ing_content.focus();
		return false;
	}
	document.f.method="POST";
	document.f.action = "ingredient_modify_action.do";
	document.f.submit();
}

function ingredientList() {
	f.action = "ing_list.do";
	f.submit();
}

function ingredientModify() {
	document.f.action = "ingredient_modify_form.do";
	document.f.method="POST";
	document.f.submit();
}
function ingredientRemove() {
	if (window.confirm("정말 삭제하시겠습니까?")) {
		window.document.f.method="POST";
		window.document.f.action = "ingredient_remove_action.do";
		window.document.f.submit();
	}
}




