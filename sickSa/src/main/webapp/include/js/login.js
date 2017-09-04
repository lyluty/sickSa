/**
 * 
 */

function login_form() {
	$('div.modal').modal({
		remote : 'loginForm'
	});
}

function login_action(){
	form = dialog.find("form").on("submit", function(event) {
		event.preventDefault();
		addUser();
	});
}