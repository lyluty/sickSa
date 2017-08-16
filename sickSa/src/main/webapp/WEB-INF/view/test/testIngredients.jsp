<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
	<head>
		<meta charset="utf-8">
		<title>IngredientsMapper test</title>
	</head>
	<body>
		<h1>IngredientsMapper test</h1>
		<hr style="border: solid 2px black;"/>
		<div>
			<h4>IngredientsMapper.ingredientList()</h4>
			<table border="1">
				<tr align="center">
					<th>ING_ID</th>
					<th>ING_NAME</th>
					<th>ING_STOCK</th>
					<th>ING_MEASURE</th>
				</tr>
				<c:forEach var="ingredient" items="${ingredientList}">
					<tr align="center">
						<td>${ingredient.ing_id}</td>
						<td>${ingredient.ing_name}</td>
						<td>${ingredient.ing_stock}</td>
						<td>${ingredient.ing_measure}</td>
					</tr>
				</c:forEach>
			</table>
		</div>
		<hr/>
		<div>
			<h4>ingredientsMapper.selectIngredientById(ing_id)</h4>
			<table border="1">
				<tr align="center">
					<th>ING_ID</th>
					<th>ING_NAME</th>
					<th>ING_STOCK</th>
					<th>ING_MEASURE</th>
				</tr>
				<tr align="center">
					<td>${ingredient.ing_id}</td>
					<td>${ingredient.ing_name}</td>
					<td>${ingredient.ing_stock}</td>
					<td>${ingredient.ing_measure}</td>
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
