<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<table id="cartTable" class="table table-striped" style="margin: auto 0;">
  <thead>
    <tr>
      <th>상품번호</th>
      <!-- <th>이미지</th> -->
      <th>상품명</th>
      <th>단가</th>
      <th>수량</th>
      <th>금액</th>
    </tr>
  </thead>
  <tbody>
    <c:forEach var="orderDetail" items="${cart}">
      <c:set var="product" value="${orderDetail.product}"></c:set>
      <tr>
        <th>${product.pdt_id}</th>
        <!-- <th><img src="${product.pdt_imgsrc_s}" /></th> -->
        <th>${product.pdt_name}</th>
        <th>${product.pdt_price}</th>
        <th>${orderDetail.ordt_amount}</th>
        <th>${product.pdt_price * orderDetail.ordt_amount}</th>
      </tr>
    </c:forEach>
  </tbody>
</table>

<div>
  <button class="btn btn-default" onclick="choicePaymentMethod()">결제하기</button>
</div>