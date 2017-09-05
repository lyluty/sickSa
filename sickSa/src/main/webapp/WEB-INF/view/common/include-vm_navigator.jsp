<!DOCTYPE html>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link href="include/css/vm_navigator.css" rel="stylesheet" type="text/css">

	<button class="action action--open" aria-label="Open Menu">
			<span class="icon icon--menu"></span>
		</button>
		<nav id="ml-menu" class="menu">
			<button class="action action--close" aria-label="Close Menu">
				<span class="icon icon--cross"></span>
			</button>
			<div class="menu__wrap">
				<ul data-menu="main" class="menu__level">
					<li class="menu__item"><a class="menu__link menu__link--current" data-submenu="submenu-1" href="#">Home</a></li>
					<c:forEach var="productCategory" items="${productCategoryList}">
						<li class="menu__item"><a class="menu__link" href="javascript:showProductList(${productCategory.pdct_id})">${productCategory.pdct_name}</a></li>
					</c:forEach>
				</ul>
			</div>
		</nav>
