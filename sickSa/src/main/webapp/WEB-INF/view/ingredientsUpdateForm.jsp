<!DOCTYPE html>

<%@page import="sickSa.domain.Ingredients"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
	<head>
		<meta charset="utf-8">
		<title>IngredientsMapper test</title>
		<script type="text/javascript">
			function ingredientCreate() {
				document.f.action = 'insertActionIngredients';
				document.f.submit();
			}
		</script>
	</head>
	<body>
		<h1>IngredientsMapper test</h1>
		
		<div>
			<h4></h4>
			<form name="f">
				<table border="1">
					<tr align="center">
						<th>ING_ID</th>
						<th>ING_NAME</th>
						<th>ING_STOCK</th>
						<th>ING_MEASURE</th>
					</tr>
					<tr align="center">
						<td><input type="text" name="ing_id"></td>
						<td><input type="text" name="ing_name"></td>
						<td><input type="text" name="ing_stock"></td>
						<td><input type="text" name="ing_measure"></td>
					</tr>
				</table>
			</form>
		<table border=0 cellpadding=0 cellspacing=1>
			<tr>
				<td align=center>
					<input type="button" value="입고" onclick="ingredientCreate();"> &nbsp; 
				</td>
			</tr>
		</table>
	</div> 
	</body>
</html>
