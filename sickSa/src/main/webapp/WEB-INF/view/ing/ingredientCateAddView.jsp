<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="modal-header">
	<h5 class="modal-title" id="exampleModalLabel">재료 항목 추가</h5>
	<button type="button" class="close" data-dismiss="modal" aria-label="Close">
		<span aria-hidden="true">&times;</span>
	</button>
</div>
<div class="modal-body">
	<form id="igctForm">
		<!-- require는 필수로 들어가야하는 필드. -->
		<!-- <div class="form-group">
			<input type="hidden" class="form-control" name="igct_id" value="1"/>
		</div> -->
		<div class="form-group">
			<label for="igct_name" class="form-control-label">항목 명:</label> 
			<input type="text" class="form-control" id="igct_name" name="igct_name" value="val"/>
		</div>
		<!-- <div class="form-group">
			<button id="addIgctAction" type="button" class="btn btn-primary">Add</button>
		</div> -->
	</form>
</div>
<div class="modal-footer">
	<button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
	<button id="addIgctAction" type="button" class="btn btn-primary">Add</button>
	<div class="loading" style="display: none;">
		<img src="include/images/ajax-loader.gif" alt="" />
	</div>
</div>

