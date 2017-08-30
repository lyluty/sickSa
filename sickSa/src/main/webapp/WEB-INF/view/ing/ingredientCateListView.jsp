<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- font start -->
<style>
@import url(http://fonts.googleapis.com/earlyaccess/hanna.css);
</style>
<!-- font end -->


<script src='include/js/ingredient.js'></script>
<div id="igctListForm" class="panel">
	<h1 class="content-title" style ="font-family:hanna; font-weight: 100;">재료 종류</h1>
	<!-- service list start -->
	<ul id="igctList" class="service-list">
		<c:forEach var="igct" items="${ingredientCategoriesList}">
			<li>
				<div class="panel">
					<div class="panel-heading">
						<div style ="font-size:4em; font-family:hanna;"class="service-box" onclick="ing_list_load(${igct.igct_id})">
							<!-- /SICKSA/ingList?igct_id=${igct.igct_id} -->
							${igct.igct_name}
						</div>
					</div>
					<!-- Category List Slide start -->
					<div id="ingList${igct.igct_id}" hidden="true"></div>
					<!-- Category List Slide end -->
				</div>
			</li>
		</c:forEach>
		<li>
			<img id="addImg" alt="plus" src="include/images/addButton.png" onclick="igct_insert_form();"/>
		</li>
	</ul>
</div>
<!-- service list end -->
