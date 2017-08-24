/**
 * jQuery ajax java script
 */

/*****전역 초기화함수 로그인 체크******/
function init_ui() {
	alert('로그인했삼?');
};

/*****전역 로드시 실행******/
$(window).load(function() {
	init_ui();
	igCt_list_function();
});

function igCt_list_function() {
	/*
	 * $.get(); Load data from the server using a HTTP GET request.
	 */

	$.ajax({
		url : 'ingList',
		type : 'POST',
		dataType : 'html',
		success : function(data) {
			$("#content").html(data);
		},
	});
}

$(function() {
	
	/** *********guest_detail*********** */
	$('#guest_list').on('click', '.guest_title', function(e) {
		guest_detail_function(e);
	});
	/** *************guest_logout_action**************** */
	$('#guest_logout_form a').click(function(e) {
		guest_logout_action_function();
		e.preventDefault();
	});
	/** ******************************** */

	/** *********guest_insert_form*********** */
	$('#menu-d a').click(function(e) {
		guest_insert_form();
	});
	/***************************************************************************
	 * guest_insert_action*********
	 * $(document).on('submit','#guest_write_form',function(e){
	 * guest_insert_action_function(); e.preventDefault(); });
	 */
	/** ***********guest_insert_action[validation]****** */
	$(document).on('DOMNodeInserted', '#guest_write_form', function() {
		/*
		 * DOM Node Insert시에 호출
		 */
		guest_insert_action_validate_function();
	});
	/** *************guest_login_action**************** */
	$('#guest_login_form').submit(function(e) {

		guest_login_action_function();

		e.preventDefault();
	});

});

/**
 * ing java script
 */

function ingredientCreate() {
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

