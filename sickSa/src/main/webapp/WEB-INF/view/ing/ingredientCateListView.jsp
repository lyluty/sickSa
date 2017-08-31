<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



<!-- font start -->
<style>
@import url(http://fonts.googleapis.com/earlyaccess/hanna.css);
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
    	font-size: 45px;
    	font-weight:100;
    	font-family:hanna;
        float: left;
        margin: 0px 20px;
    } 
    
    #addIgctImg {
    	position:relative;
    	width: 40px;
    	height: auto;
    	bottom:13px;
    }
</style>
<!-- font end -->


<script src='include/js/ingredient.js'></script>
<script type="text/javascript">
function loadList(igct_id) {
	$.post('testLoadList', {igct_id : igct_id}, function(data) {
		$('#ingredientList').html(data);
	});
}
</script>
<div id="igctListForm" class="panel">
	<h1 class="content-title" style ="font-family:hanna; font-weight: 100;">재료 종류</h1>
	<!-- service list start -->
	<ul class="ul">
	<c:forEach var="ingredientCategory" items="${ingredientCategoriesList}">
		<li class="li"><a href="javascript:loadList(${ingredientCategory.igct_id})">${ingredientCategory.igct_name}</a></li>
	</c:forEach>
		<li class="li"><img id="addIgctImg" alt="plus" src="include/images/addButton.png" onclick="igct_insert_form();" /></li>
	</ul> 
	<div id="ingredientList"></div>

</div>
<!-- service list end -->
