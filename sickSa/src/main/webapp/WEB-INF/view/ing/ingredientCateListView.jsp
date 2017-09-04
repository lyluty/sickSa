<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<link href="include/css/ingredientStyle.css" rel="stylesheet" type="text/css">
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script> 
<script src='include/js/ingredient.js'></script>

<div id="igctListForm" class="panel">
	<h1 class="content-title" id ="ingHeader">재료 종류</h1>
	<!-- service list start -->
	<ul class="service-list">
		<c:forEach var="ingredientCategory" items="${ingredientCategoriesList}">
			<li id ="categoryName"> 
				<div class="panel">
					<div class="panel-heading">
						<!-- <a href="javascript:ing_list_load(${ingredientCategory.igct_id})">${ingredientCategory.igct_name}</a> -->
						<div id="ingCateList">
							<a href="javascript:ing_list_load(${ingredientCategory.igct_id})">${ingredientCategory.igct_name}</a>
						<div id="ingredientList${ingredientCategory.igct_id }" hidden="true"></div>
						</div>
					</div>
				</div>
			</li>
		</c:forEach>
		<!-- button add start -->
		<li>
			<a role="button" data-backdrop="static"> 
				<span id="create-igct" class="btn btn-xs btn-success">추가하기</span>
			</a>
		</li>
		<!-- button add end -->
	</ul> 
	
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
			</div>
		</div>
	</div>
</div>
<!-- service list end -->
