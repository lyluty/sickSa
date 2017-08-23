<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<table class="table table-striped">
  <caption>서빙하세요</caption>
  <thead>
    <tr onclick="javascript:setState(${serving.pdt_id}, 'S')">
      <th>상품번호</th>
      <th>수량</th>
    </tr>
  </thead>
  <tbody>
    <c:forEach var="serving" items="${servingList}">
      <tr>
        <td>${serving.pdt_id}</td>
        <td>${serving.ord_pdt_amount}</td>
      </tr>
    </c:forEach>
  </tbody>
</table>
