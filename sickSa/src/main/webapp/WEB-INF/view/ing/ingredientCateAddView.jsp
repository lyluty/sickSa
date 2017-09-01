<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- <script src="http://code.jquery.com/jquery-1.11.1.min.js"></script> -->
<!-- <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script> -->

<div class="modal-header">
</div>
<div class="modal-body">
	<div class="row">
		<div class="col-sm-7">
			<form id="igctAddForm">
				<h5>재료 항목 추가</h5>
				<!-- require는 필수로 들어가야하는 필드. -->
				<div class="form-group">
					<input type="text" name="igct_name" class="form-control" placeholder="항목 명" required />
				</div>
				<div class="form-group">
					<button onclick="igct_insert_action();" class="btn btn-default">추가하기</button>
					<div class="loading" style="display: none;">
						<img src="include/images/ajax-loader.gif" alt="" />
					</div>
				</div>
			</form>
		</div>
	</div>
</div>
<div class="modal-footer">
	<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
</div>


