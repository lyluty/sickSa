<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- <script src="http://code.jquery.com/jquery-1.11.1.min.js"></script> -->
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>

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
					<input type="text" name="ing_name" class="form-control" placeholder="재료 명" required />
				</div>
				<div class="form-group">
					<input type="text" name="ing_stock" class="form-control" placeholder="재고" required />
				</div>
				<div class="form-group">
					<input type="text" name="ing_measure" class="form-control" placeholder="재료 단위" required />
				</div>
				<div class="form-group">
					<input type="text" name="igdt_price" class="form-control" placeholder="단가" required />
				</div>
				<div class="form-group">
					<input type="text" name="igdt_contact" class="form-control" placeholder="거래처 번호" required />
				</div>
				<div class="form-group">
					<button onclick="ing_insert_action();" class="btn btn-default">추가하기</button>
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
<!-- 컨텐츠 영역 end -->
<!-- tail start -->

<!-- tail end -->
