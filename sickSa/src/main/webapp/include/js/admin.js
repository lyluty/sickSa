


/*****로그인 체크******/

$(document).ready(function() {
	$('#adminM1').hide();
	$('#adminM2').hide();
	 $('#logoutB').hide();		//버튼 만들기
	$('#adminB').show();
	alert("loginStatus"+loginStatus);

	if('loginStatus'==true){

				$('#adminB').hide();
				$('#adminM1').show();
				$('#adminM2').show();
				$('#logoutB').show();
				alert("loginStatus"+loginStatus);
				}

	});
	

	