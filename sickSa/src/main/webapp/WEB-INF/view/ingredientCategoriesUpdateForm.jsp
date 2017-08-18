<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta charset="utf-8">
<title>updateIngredientCategoriesMapper test</title>
<script type="text/javascript">
	function ingredientUpdate() {
		alert('1');
		document.f.action = 'IGCTUPDATEACTION';
		document.f.submit();
	}
</script>

</head>
<body>
	<h1>updateIngredientCategoriesMapper test</h1>
	<hr style="border: solid 2px black;" />

	<div>
		<h4>ingredientCategoriesMapper.updateIngredientCategories(igct_id))</h4>

		<form name="f">
			<table border="1">
				<tr align="center">
					<th>수정할 ID</th>
					<th>수정할 카테고리명</th>
				</tr>

				<tr align="center">
					<td><input type="text" name="igct_id"></td>
					<td><input type="text" name="igct_name"></td>

					<td><input type="submit" onClick="ingredientUpdate()"></td>
				</tr>

			</table>
		</form>

	</div>
	<hr />

</body>
</html>


