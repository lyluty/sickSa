<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script type="text/javascript">
  function historyBack() {
    history.go(0);
  }
</script>
<div class="calendar">
  <h3 class="content-title">매출 기록</h3>
  <button class="btn btn-default" onclick="historyBack()">&lt; 조회기간 선택</button>
  <div>
    <table class="table table-striped">
      <thead>
        <tr>
          <th>주문번호</th>
          <th>상품번호</th>
          <th>주문상품개수</th>
          <th>금액</th>
          <th>결제수단</th>
          <th>결제일시</th>
          <th>테이블번호</th>
        </tr>
      </thead>
      <tbody>
        <c:forEach var="order" items="${orderList}">
          <tr>
            <th>${order.ord_id}</th>
            <td>${order.pdt_id}</td>
            <td>${order.ord_pdt_amount}</td>
            <td>${order.ord_total}</td>
            <td>${order.ord_payment_method}</td>
            <td>${order.ord_date}</td>
            <td>${order.tbl_id}</td>
          </tr>
        </c:forEach>
      </tbody>
    </table>
  </div>
</div>
