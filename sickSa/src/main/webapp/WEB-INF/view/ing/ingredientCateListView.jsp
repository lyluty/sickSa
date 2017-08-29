<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script src='include/js/ingredient.js'></script>
<div id="igctListForm" class="panel">
	<h3 class="content-title">Ingredient Category</h3>
	<!-- service list start -->
	<ul id="igctList" class="service-list">
		<c:forEach var="igct" items="${ingredientCategoriesList}">
			<li>
				<div class="panel">
					<div class="panel-heading">
						<div class="service-box">
							<!-- /SICKSA/ingList?igct_id=${igct.igct_id} -->
							<a href="javascript:ing_list_load(${igct.igct_id});">${igct.igct_name}</a>
						</div>
					</div>
					<!-- Category List Slide start -->
					<div id="ingList${igct.igct_id}"></div>
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
</div>