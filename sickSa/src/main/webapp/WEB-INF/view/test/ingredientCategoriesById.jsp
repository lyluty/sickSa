<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta charset="utf-8">
<title>IngredientCategoriesByIdMapper test</title>
</head>
<body>
	<h1>IngredientCategoriesByIdMapper test</h1>
	<hr style="border: solid 2px black;" />

	<div>
		<h4>ingredientCategoriesMapper.selectIngredientCategoriesById(igct_id))</h4>
		<table border="1">

			<tr align="center">
				<th>IGCT_ID</th>
				<th>IGCT_NAME</th>
			</tr>

			<tr align="center">
				<td>${selectIngredientCategoriesById.igct_id}</td>
				<td>${selectIngredientCategoriesById.igct_name}</td>
			</tr>


		</table>
	</div>
	<hr />

</body>
</html>
