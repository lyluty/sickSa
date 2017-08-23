<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<table class="table table-striped">
  <caption>조리하세요</caption>
  <thead>
    <tr>
      <th>상품번호</th>
      <th>수량</th>
    </tr>
  </thead>
  <tbody>
    <c:forEach var="cook" items="${cookList}">
      <tr onclick="javascript:setState(${cook.ord_id}, ${cook.pdt_id}, 'C')">
        <td>${cook.pdt_id}</td>
        <td>${cook.ord_pdt_amount}</td>
      </tr>
    </c:forEach>
  </tbody>
</table>
