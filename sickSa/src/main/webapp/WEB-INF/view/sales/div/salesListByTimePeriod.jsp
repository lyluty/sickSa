<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<div id="salesList">
  <h3 class="content-title">기간별 매출 조회</h3>
  <button class="btn btn-default" onclick="showTimePeriod()" style="margin: auto 0;">&lt;&nbsp;조회기간 선택</button>
  <div>
    <c:choose>
      <c:when test="${empty orderList}">
      <h1>목록이 비어있는데 뭐라고 써줘야 하나</h1>
      </c:when>

      <c:when test="${!empty orderList}">
        <table class="table table-striped" style="margin: auto 0;">
          <thead>
            <tr>
              <th>주문번호</th>
              <th>상품명</th>
              <th>주문상품개수</th>
              <th>금액</th>
              <th>결제수단</th>
              <th>결제일시</th>
            </tr>
          </thead>
          <tbody>
            <c:forEach var="o" items="${orderList}">
              <c:forEach var="od" items="${o.orderDetailList}">
              <c:set var="p" value="${od.product}"></c:set>
                <tr>
                  <th>${o.ord_id}</th>
                  <td>${p.pdt_name}</td>
                  <td>${od.ordt_amount}</td>
                  <td>${o.ord_total}</td>
                  <td>${o.ord_payment_method}</td>
                  <td>${o.ord_date}</td>
                </tr>
              </c:forEach>
            </c:forEach>
          </tbody>
        </table>
      </c:when>
    </c:choose>
  </div>
</div>
