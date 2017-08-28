<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
				<form method="post" action="#" id="ingridentAddForm">
					<h5>재료 추가</h5>
					<div class="form-group" id="ingredientCategoriesList">
						<select class="form-control" name="subject" id="subject" required>
							<option value="">카테고리를 선택하세요.</option>
							<c:forEach var="loadCategories" items="${ingredientCategoriesList}">
								<option value="${loadCategories.igct_id }">${loadCategories.igct_name }</option>
							</c:forEach>
						</select>
					</div>
					<!-- require는 필수로 들어가야하는 필드. -->
					<div class="form-group">
						<input type="text" name="ING_NAME" id="ING_NAME" value="" class="form-control" placeholder="재료 명:" required />
					</div>
					<div class="form-group">
						<input type="text" name="ING_STOCK" id="ING_STOCK" value="" class="form-control" placeholder="재고 입력:" required />
					</div>
				</form>
				<div class="form-group">
					<button class="btn btn-default" onclick="">추가하기</button>
					<div class="loading" style="display: none;">
						<img src="include/images/ajax-loader.gif" alt="" />
					</div>
				</div>
				<!-- 
              <div id="success">
                <h6>성공적으로 추가 되었습니다!</h6>
                <p>Your message was sent successfully! I will be in touch as soon as I can.</p>
              </div>
              <div id="error">
                <h6>재료 추가에 실패했슴...</h6>
                <p>Something went wrong, try refreshing and submitting the form again.</p>
              </div>
              -->
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