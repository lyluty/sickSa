<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link href="include/css/ingredientStyle.css" rel="stylesheet" type="text/css">
<div id="igctListForm" class="panel">
	<h1 class="content-title" id="ingHeader">재료 종류</h1>
	<!-- service list start -->
	<ul class="service-list">
		<c:forEach var="ingredientCategory" items="${ingredientCategoriesList}">
			<li id="categoryName">
				<div class="panel">
					<div class="panel-heading">
						<div id="ingCateList">
							<a href="javascript:ing_list_load(${ingredientCategory.igct_id})">${ingredientCategory.igct_name}</a>
							<div id="ingredientList${ingredientCategory.igct_id }" hidden="true"></div>
						</div>
					</div>
				</div>
			</li>
		</c:forEach>
		<!-- button add start -->
		<li><span id="addIgctForm" class="btn btn-xs btn-success">Add</span></li>
		<!-- button add end -->
	</ul>
	<!-- igctModal -->
	<div class="modal fade" id="addIgctModal" tabindex="-1" role="dialog" aria-labelledby="addModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<!--  -->
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">재료 항목 추가</h5>
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<form id="igctForm">
						<div class="form-group">
							<label for="igct_name" class="form-control-label">항목 명:</label> 
							<input type="text" class="form-control" name="igct_name"/>
						</div>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
					<button id="addIgctAction" type="button" class="btn btn-primary">Add</button>
					<div class="loading" style="display: none;">
						<img src="include/images/ajax-loader.gif" alt="" />
					</div>
				</div>
				<!--  -->
			</div>
		</div>
	</div>
	
	<!-- ingModal -->
	<div class="modal fade" id="addIngModal" tabindex="-1" role="dialog" aria-labelledby="addModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<!--  -->
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">재료 추가</h5>
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<form id="ingForm">
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
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
					<button id="addIngAction" type="button" class="btn btn-primary">Add</button>
					<div class="loading" style="display: none;">
						<img src="include/images/ajax-loader.gif" alt="" />
					</div>
				</div>
				<!--  -->
			</div>
		</div>
	</div>
</div>
