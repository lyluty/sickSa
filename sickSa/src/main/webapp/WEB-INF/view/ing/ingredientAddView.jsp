<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!-- 컨텐츠 영역 start -->
<div class="modal-header">
</div>
<div class="modal-body">
	<div class="row">
		<div class="col-sm-7">
			<form id="ingAddForm">
				<h5>재료 항목 추가</h5>
				<!-- require는 필수로 들어가야하는 필드. -->
				<select class="form-control" name="igct_id" required>
					<option value="">카테고리를 선택하세요.</option>
					<c:forEach var="igct" items="${igctList}">
						<option value="${igct.igct_id }">${igct.igct_name}</option>
					</c:forEach>
				</select>
				<div class="form-group">
					<label for="ing_name" class="form-control-label">재료 명:</label>
            		<input type="text" class="form-control" name="ing_name">
				</div>
				<div class="form-group">
					<label for="ing_stock" class="form-control-label">재고:</label>
            		<input type="text" class="form-control" name="ing_stock">
				</div>
				<div class="form-group">
					<label for="ing_measure" class="form-control-label">재료 단위:</label>
            		<input type="text" class="form-control" name="ing_measure">
				</div>
				<div class="form-group">
					<label for="igdt_price" class="form-control-label">단가:</label>
            		<input type="text" class="form-control" name="igdt_price">
				</div>
				<div class="form-group">
					<label for="igdt_contact" class="form-control-label">거래처 번호:</label>
            		<input type="text" class="form-control" name="igdt_contact">
				</div>
			</form>
		</div>
	</div>
</div>
<div class="modal-footer">
	<button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
	<button id="addIngAction" type="button" class="btn btn-primary">Add</button>
	<div class="loading" style="display: none;">
		<img src="include/images/ajax-loader.gif" alt="" />
	</div>
</div>

