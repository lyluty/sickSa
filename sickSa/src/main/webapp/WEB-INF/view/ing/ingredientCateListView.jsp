<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- font start -->
<style>
@import url(http://fonts.googleapis.com/earlyaccess/jejugothic.css);
    #body {
        margin: 30px 0px;
    }
    .ul {
        list-style: none;
        font-weight: bold;
        font-family: hanna;
    	text-align:center; 
    }
    .ul .li {
    	font-size: 30px;
    	font-weight:100;
    	font-family:Jeju-Gothic;
    	font-weight: bold;
        float: left;
        margin: 0px 20px;
    } 
    #addIgctImg {
    	position:relative;
    	width: 40px;
    	height: auto;
    	bottom:13px;
    }
    #h1{
    	font-family:Jeju Gothic;
    	font-weight: 100;
    }
</style>
<!-- font end -->
<!-- <script src="http://code.jquery.com/jquery-1.11.1.min.js"></script> -->
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script> 
<script src='include/js/ingredient.js'></script>
<div id="igctListForm" class="panel">
	<h1 class="content-title">재료 종류</h1>
	<!-- service list start -->
	<ul class="ul" id="loadCategoryList">
	<c:forEach var="ingredientCategory" items="${ingredientCategoriesList}">
		<li class="li"><a href="javascript:ing_list_load(${ingredientCategory.igct_id})">${ingredientCategory.igct_name}</a></li>
	</c:forEach>
		<li><a role="button" data-backdrop="static"> 
			<span id="create-igct" class="btn btn-xs btn-success">추가하기</span>
		</a></li>
	</ul> 
	<div id="ingredientList"></div>
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
			</div>
		</div>
	</div>
</div>
<!-- service list end -->
