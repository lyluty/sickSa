<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta charset="utf-8">
<title>IngredientCategoriesByIdMapper test</title>
<script src="<c:url value='/resources/js/ingredient.js'/>"> </script>


</head>
<body>
	<h1>IngredientCategoriesByIdMapper test</h1>
	<hr style="border: solid 2px black;" />

	<div>
		<h4>ingredientCategoriesMapper.selectIngredientCategoriesById(igct_id))</h4>

		<form name="f">
			<table border="1">
				<tr align="center">
					<th>IGCT_ID</th>
					<th>IGCT_NAME</th>
				</tr>

				<tr align="center">
					<td><input type="hidden" name="igct_id"></td>
					<td><input type="text" name="igct_name"></td>
				</tr>
				
				<tr align="center">
					<td><input type="submit" class="ingredientCreate()" ></td>
				</tr>
				
			</table>
		</form>

	</div>
	<hr />

</body>
</html>


