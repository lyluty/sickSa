<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%--@ taglib prefix="form" uri="http://www.springframework.org/tags/form" --%>
<html>
<head>
<!-- head start -->
<jsp:include page="include-head.jsp" flush="false" />
<!-- head end -->
<script type="text/javascript">

</script>
</head>
<body>
	<!-- 컨텐츠 영역 start -->
	<div class="content-holder">
		<div class="row">
			<div class="col-sm-7">
				<form method="post" action="igctInsertAction" id="igctAddForm">
					<h5>재료 추가</h5>
					
					<!-- require는 필수로 들어가야하는 필드. -->
					<div class="form-group">
						<!-- 
						<input type="hidden" name="igct_id" class="form-control" value="-999"/>
						 -->
					</div>
					<div class="form-group">
						<input type="text" name="igct_name" class="form-control" placeholder="항목 명" required />
					</div>
					<div class="form-group">
						<button type="submit" class="btn btn-default">추가하기</button>
						<div class="loading" style="display: none;">
							<img src="include/images/ajax-loader.gif" alt="" />
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
	<!-- 컨텐츠 영역 end -->
	<!-- tail start -->
	<jsp:include page="include-tail.jsp" flush="false" />
	<script src='include/js/ingredient.js'></script>
	<!-- tail end -->
</body>
</html>