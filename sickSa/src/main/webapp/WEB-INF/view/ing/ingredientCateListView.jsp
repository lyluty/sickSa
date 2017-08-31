<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



<!-- font start -->
<style>
@import url(http://fonts.googleapis.com/earlyaccess/hanna.css);
    #body {
        margin: 30px 0px;
    }
    /* #ul {
        list-style: none;
        font-weight: bold;
        font-family: hanna;
    }
    #ul #li {
    	font-size: 45px;
    	font-weight:100;
    	font-family:hanna;
        float: left;
        margin: 0px 20px;
    } */
    
    #tr {
        font-weight: bold;
        font-family: hanna;
    }
    #tr #td {
    	font-size: 45px;
    	font-weight:100;
    	font-family:hanna;
        float: left;
        margin: 0px 20px;
    }
    
    #addIgctImg {
    	absolute:absolute;
    	bottom:50px;
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
	<%-- 
	<ul id="ul">
	<c:forEach var="ingredientCategory" items="${ingredientCategoriesList}">
		<li id="li"><a href="javascript:loadList(${ingredientCategory.igct_id})">${ingredientCategory.igct_name}</a></li>
	</c:forEach>
	</ul> 
	--%>
	<table>
		<tr id="tr">
			<c:forEach var="ingredientCategory" items="${ingredientCategoriesList}">
			<td id="td"><a href="javascript:loadList(${ingredientCategory.igct_id})">${ingredientCategory.igct_name}</a></td>
			</c:forEach>
			<td id="td"><img id="addIgctImg" alt="plus" src="include/images/addButton.png" onclick="igct_insert_form();" /></td>
		</tr>
	</table>
	<!-- 
	<img id="addIgctImg" alt="plus" src="include/images/addButton.png" onclick="igct_insert_form();" /> 
	-->
	<div id="ingredientList"></div>

</div>
<!-- service list end -->
