<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
	<head>
		<meta charset="utf-8">
		<title>IngredientsCategoriesMapper test</title>
	</head>
	<body>
		<h1>IngredientsCategoriesMapper test</h1>
		<hr style="border: solid 2px black;"/>
		<div>
			<h4>ingredientCategoriesMapper.ingredientCategoriesList()</h4>
			<table border="1">
				<tr align="center">
					<th>IGCT_ID</th>
					<th>IGCT_NAME</th>
				</tr>
				<c:forEach var="ingredientCategory1" items="${ingredientCategoryList}">
					<tr align="center">
						<td>${ingredientCategory1.igct_id}</td>
						<td>${ingredientCategory1.igct_name}</td>
					</tr>
				</c:forEach>
			</table>
		</div>
		<hr/>
		
		<div>
			<h4>ingredientCategoriesMapper.selectIngredientById(igct_id)</h4>
			<table border="1">
				<tr align="center">
					<th>IGCT_ID</th>
					<th>IGCT_NAME</th>
				</tr>
				<tr align="center">
					<td>${ingredientCategory.igct_id}</td>
					<td>${ingredientCategory.igct_name}</td>
				</tr>
			</table>
		</div> 
		<%-- <hr/>
		<div>
			<h4>ingredientsDao.selectIngredientById(ing_id)</h4>
			<table border="1">
				<tr align="center">
					<td>QAWT_ID</td>
					<td>QAWT_CONTACT</td>
				</tr>
				<tr align="center">
					<td>${nextAwaiter.qawt_id}</td>
					<td>${nextAwaiter.qawt_contact}</td>
				</tr>
			</table>
		</div> --%>
	</body>
</html>
