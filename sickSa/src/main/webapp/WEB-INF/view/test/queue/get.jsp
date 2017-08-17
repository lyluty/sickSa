<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
	<head>
		<meta charset="utf-8">
		<title>QueueService test</title>
	</head>
	<body>
		<h1>QueueService.get</h1>
		<hr style="border: solid 2px black;"/>
		<div>
			<table border="1">
				<tr align="center">
					<td>QLOG_ID</td>
					<td>QLOG_CONTACT</td>
					<td>QLOG_DATE</td>
					<td>QLST_CODE</td>
				</tr>
				<tr align="center">
					<td>${queueLog.qlog_id}</td>
					<td>${queueLog.qlog_contact}</td>
					<td>${queueLog.qlog_date}</td>
					<td>${queueLog.qlst_code}</td>
				</tr>
			</table>
		</div>
	</body>
</html>
