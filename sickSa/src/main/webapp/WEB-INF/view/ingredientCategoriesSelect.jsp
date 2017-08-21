<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
	<head>
		<meta charset="utf-8">
		<title>IngredientsCategoriesSelectMapper test</title>
	</head>
	<body>
		<h1>IngredientsCategoriesSelectMapper test</h1>
		<hr style="border: solid 2px black;"/>
		
		<div>
			<h4>ingredientCategoriesMapper.ingredientCategoriesList()</h4>
			<table border="1">
				
				<tr align="center">
					<th>IGCT_ID</th>
					<th>IGCT_NAME</th>
				</tr>
				 
				<c:forEach var="ingredientCategory1" items="${ingredientCategoriesList}">
					<tr align="center">
						<td>${ingredientCategory1.IGCT_ID}</td>
						<td>${ingredientCategory1.IGCT_NAME}</td>
					</tr>
				</c:forEach>
			</table>
		</div>
		<hr/>
		
	</body>
</html>
