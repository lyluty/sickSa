<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<div id="cookList" style="float: left; width: 48%; margin: auto">
  <table class="table table-striped">
    <caption>서빙하세요</caption>
    <thead>
      <tr>
        <th>상품번호</th>
        <th>수량</th>
      </tr>
    </thead>
    <tbody>
      <c:forEach var="serving" items="${servingList}">
        <tr onclick="javascript:setState(${serving.pdt_id}, 'S')">
          <td>${serving.pdt_id}</td>
          <td>${serving.ord_pdt_amount}</td>
        </tr>
      </c:forEach>
    </tbody>
  </table>

</div>
<div id="servingList" style="float: right; width: 48%; margin: auto">
  <table class="table table-striped">
    <caption>조리하세요</caption>
    <thead>
      <tr onclick="javascript:setState(${serving.pdt_id}, 'C')">
        <th>상품번호</th>
        <th>수량</th>
      </tr>
    </thead>
    <tbody>
      <c:forEach var="cook" items="${cookList}">
        <tr>
          <td>${cook.pdt_id}</td>
          <td>${cook.ord_pdt_amount}</td>
        </tr>
      </c:forEach>
    </tbody>
  </table>
</div>
