<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<table class="table table-striped">
  <caption>서빙하세요</caption>
  <thead>
    <tr>
      <th>주문번호</th>
      <th>상품번호</th>
      <th>수량</th>
    </tr>
  </thead>
  <tbody>
    <c:forEach var="order" items="${orderList}">
      <c:forEach var="orderDetail" items="${order.orderDetailVOList}">
        <tr onclick="javascript:setState(${order.ord_id}, ${orderDetail.pdt_id}, 'S')">
          <td>${order.ord_id}</td>
          <td>${orderDetail.pdt_id}</td>
          <td>${orderDetail.ordt_amount}</td>
        </tr>
      </c:forEach>
    </c:forEach>
  </tbody>
</table>
