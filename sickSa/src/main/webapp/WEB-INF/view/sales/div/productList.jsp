<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<ul>
  <c:forEach var="product" items="${productList}">
    <c:set var="productId" value="${product.pdt_id}" />
    <c:set var="productName" value="${product.pdt_name}" />
    <li><a href="javascript:salesListByProductId(${productId})">${productName}</a></li>
    <div class="salesList" hidden="true" data-productId="${productId}"></div>
  </c:forEach>
</ul>
