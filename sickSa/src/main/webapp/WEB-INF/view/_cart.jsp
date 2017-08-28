<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<table id="cartTable" class="table table-striped" style="margin: auto 0;">
  <thead>
    <tr>
      <th>상품번호</th>
      <!-- <th>이미지</th> -->
      <th>상품명</th>
      <th>가격</th>
    </tr>
  </thead>
  <tbody>
    <c:forEach var="product" items="${cart}">
      <tr>
        <th>${product.pdt_id}</th>
        <!-- <th><img src="${product.pdt_imgsrc_s}" /></th> -->
        <th>${product.pdt_name}</th>
        <th>${product.pdt_price}</th>
      </tr>
    </c:forEach>
  </tbody>
</table>

<div>
  <button class="btn btn-default" onclick="orderNow()">결제하기</button>
</div>