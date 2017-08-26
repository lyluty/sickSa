<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div id="igctListForm">
	<h3 class="content-title">Our Services</h3>
	<!-- service list start -->
	<div class="panel-heading">
		<div class="service-box">
			<ul class="service-list">
				<c:forEach var="igct" items="${ingredientCategoriesList}">
				<li id="igctView">
					<!-- /SICKSA/ingList?igct_id=${igct.igct_id} -->
					<a href="#">${igct.igct_name}</a>
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