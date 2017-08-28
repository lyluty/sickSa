/**
 * jQuery ajax java script
 */

/*****전역 초기화함수 로그인 체크******/
function init_ui() {
	alert('ㅇ?');
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

function wrapWindowByMask(){
    // 화면의 높이와 너비를 변수로 만듭니다.
    var maskHeight = $(document).height();
    var maskWidth = $(window).width();

    // 마스크의 높이와 너비를 화면의 높이와 너비 변수로 설정합니다.
    $('.mask').css({'width':maskWidth,'height':maskHeight});

    // fade 애니메이션 : 1초 동안 검게 됐다가 80%의 불투명으로 변합니다.
    $('.mask').fadeIn(1000);
    $('.mask').fadeTo("slow",0.8);

    // 레이어 팝업을 가운데로 띄우기 위해 화면의 높이와 너비의 가운데 값과 스크롤 값을 더하여 변수로 만듭니다.
    var left = ( $(window).scrollLeft() + ( $(window).width() - $('.window').width()) / 2 );
    var top = ( $(window).scrollTop() + ( $(window).height() - $('.window').height()) / 2 );

    // css 스타일을 변경합니다.
    $('.window').css({'left':left,'top':top, 'position':'absolute'});

    // 레이어 팝업을 띄웁니다.
    $('.window').show();
}

$(document).ready(function(){
    // showMask를 클릭시 작동하며 검은 마스크 배경과 레이어 팝업을 띄웁니다.
    $('img#addImg').click(function(e){
        // preventDefault는 href의 링크 기본 행동을 막는 기능입니다.
        e.preventDefault();
        wrapWindowByMask();
    });

    // 닫기(close)를 눌렀을 때 작동합니다.
    $('.window .close').click(function (e) {
        e.preventDefault();
        $('.mask, .window').hide();
    });

    // 뒤 검은 마스크를 클릭시에도 모두 제거하도록 처리합니다.
    $('.mask').click(function () {
        $(this).hide();
        $('.window').hide();
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

