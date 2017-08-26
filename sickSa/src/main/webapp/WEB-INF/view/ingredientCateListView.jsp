<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="include-tail.jsp" flush="false" />
<script src='include/js/ingredient.js'></script>
	
<div id="igctListForm">
	<h3 class="content-title">Our Services</h3>
	<!-- service list start -->
	<div class="panel-heading">
		<div class="service-box">
			<ul id="igctList" class="service-list">
				<c:forEach var="igct" items="${ingredientCategoriesList}">
				<li>
					<!-- /SICKSA/ingList?igct_id=${igct.igct_id} -->
					${igct.igct_name}
					<button onclick="ing_list_load(${igct.igct_id});">볼꼬양?</button>
					<!-- Category List Slide start -->
					<div id="ingList"></div> 
					<!-- Category List Slide end -->
				</li>
				</c:forEach>
			</ul>
		</div>
	</div>
	<!-- service list end -->
</div>