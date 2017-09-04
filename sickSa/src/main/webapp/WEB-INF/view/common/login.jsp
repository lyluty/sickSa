<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="modal-header">
	<h3 align="center">Login</h3>
</div>
<div class="modal-body">
	<div class="row">
		<div class="col-sm-7">
			<form method="post" action="matchPw" id="pwForm">
				<div class="form-group" style="margin: 50px auto; width: 60%">
					<input type="text" name="pw_pin" value="" class="form-control" placeholder="Password" required />
				</div>
			</form>
		</div>
	</div>
</div>
<div class="modal-footer">
	<span class="btn btn-xs btn-success" onclick="login_action();">Login</span>
	<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
</div>
