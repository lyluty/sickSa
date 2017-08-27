<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<jsp:include page="include-head.jsp" flush="false" />
<!-- 
<style>

div{height:100%; border:1px dotted red}
</style>
 -->

</head>
<body>

 <div class="animsition">
    <!-- nav start -->
    <jsp:include page="include-navigator.jsp" flush="false" />
    <!-- nav end -->

    <!-- header start -->
    <jsp:include page="include-header.jsp" flush="false" />
    <!-- header end -->

	<div class="main-container-outer">
		<div class="container">
			<div class="top-bar-container">
				<div class="container">
					<div class="top-bar">
						<ul class="breadcrumb">
							<li><a href="index.html">Home</a></li>
							<li><span>Login</span></li>
						</ul>
					</div>

					<div class="main-container" >
					
						<div class="container"   align="center"  style="padding: 20%; display: block; margin: 0 auto;">
							
								
									<form method="post" action="#" id="messageForm" >
										<h4>Login </h4>
										<div class="form-group" style="margin:50px auto; width: 60%">
											<input type="text" name="name" id="name" value="" 
												class="form-control" placeholder="Password" required />
										</div>

									</form>
		
										<button class="btn btn-default" style="display: block; margin: 0 auto;" onclick="login()">Login </button>	
						
							</div>
						</div>
				
				</div>
			</div>
		</div>
	</div>


 <!-- 컨텐츠 영역 end -->

    <!-- footer start -->
    <jsp:include page="include-footer.jsp" flush="false" />
    <!-- footer end -->
  </div>

  <!-- tail start -->
  <jsp:include page="include-tail.jsp" flush="false" />
  <!-- tail end -->


</body>
</html>