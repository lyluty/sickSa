<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<html>
<head>
<jsp:include page="include-head.jsp" flush="false" />
<script src="include/js/jquery-2.2.2.min.js"></script>
<script type="text/javascript" src='include/js/admin.js'></script>

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

						<div class="main-container">
							<div class="content-holder">

								<div class="container" align="center"
									style="padding: 20%; display: block; margin: 0 auto;">


									<form method="post" action="matchPw" id="pwForm">
										<h4>Login</h4>
										<div class="form-group" style="margin: 50px auto; width: 60%">
											<input type="text" name="pw_pin" value=""
												class="form-control" placeholder="Password" required />
										</div>

										<button class="btn btn-default"
											style="display: block; margin: 0 auto;" type="submit">Login
										</button>

									</form>




								</div>
							</div>
						</div>

					</div>
				</div>
			</div>
		</div>

		<div class="modal-header">
			<h3 align="center">Login</h3>
		</div>
		<div class="modal-body">
			<div class="row">
				<div class="col-sm-7">
					<form method="post" action="matchPw" id="pwForm">
						<div class="form-group" style="margin: 50px auto; width: 60%">
							<input type="text" name="pw_pin" value="" class="form-control"
								placeholder="Password" required />

						</div>
					</form>
				</div>
			</div>
		</div>
		<div class="modal-footer">
			<span class="btn btn-xs btn-success" onclick="login_action();">Login</span>
			<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
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
