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
		<h1>QueueAwaiterDao test</h1>
		<hr style="border: solid 2px black;"/>
		<div>
			<h4>QueueAwaiterDao.selectQueueAwaiterList()</h4>
			<table border="1">
				<tr align="center">
					<td>QAWT_ID</td>
					<td>QAWT_CONTACT</td>
				</tr>
				<c:forEach var="queueAwaiter" items="${queueAwaiterList}">
					<tr align="center">
						<td>${queueAwaiter.qawt_id}</td>
						<td>${queueAwaiter.qawt_contact}</td>
					</tr>
				</c:forEach>
			</table>
		</div>
		<hr/>
		<div>
			<h4>QueueAwaiterDao.selectQueueAwaiterById(Integer qawtId)</h4>
			<table border="1">
				<tr align="center">
					<td>QAWT_ID</td>
					<td>QAWT_CONTACT</td>
				</tr>
				<tr align="center">
					<td>${queueAwaiter.qawt_id}</td>
					<td>${queueAwaiter.qawt_contact}</td>
				</tr>
			</table>
		</div>
		<hr/>
		<div>
			<h4>QueueAwaiterDao.selectNextAwaiter()</h4>
			<table border="1">
				<tr align="center">
					<td>QAWT_ID</td>
					<td>QAWT_CONTACT</td>
				</tr>
				<tr align="center">
					<td>${nextAwaiter.qawt_id}</td>
					<td>${nextAwaiter.qawt_contact}</td>
				</tr>
			</table>
		</div>
	</body>
</html>
