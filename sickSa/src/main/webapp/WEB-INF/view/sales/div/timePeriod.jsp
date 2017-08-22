<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div id='calendar' style="width: 70%; display: block; margin: auto;"></div>
<form id="cf" name="cf" method="post">
  <input type="hidden" name="startDate" /> <input type="hidden" name="endDate" />
</form>
<button class="btn btn-default" style="float: right; margin: 20px" onclick="salesList()">조회</button>
