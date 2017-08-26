<%@page import="org.springframework.ui.Model"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div id="ingList" class="panel">
	<div class="panel-heading">
		<!-- Ingredient List Slide start -->
		<div class="service-box">
			<ul class="sub-service-list">
				<c:forEach var="ing" items="${ingredientList}">
				<li>
					<div class="panel">
						<div class="panel-heading">
							<div class="service-box">
								<div class="service-num">01.</div>
								<div class="service-icon">
									<i class="ion ion-android-color-palette"></i>
								</div>
								<h6>${ing.ing_name}</h6>
							</div>
						</div>
						<div class="panel-body">
							<p>Cras egestas ligula nisl, in rutrum felis laoreet ut. Viva mus at lorem dapibus, iaculis mi nec, euismod tellus. Integer sed
								vehicula urna, ac cursus dui. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras egestas ligula nisl, in rutrum felis
								laoreet ut. Viva mus at lorem dapibus, iaculis mi nec, euismod tellus. Integer sed vehicula urna, ac cursus dui. Viva mus at lorem
								dapibus, iaculis mi nec, euismod tellus. Integer sed vehicula urna, ac cursus dui. Lorem ipsum dolor sit amet, consectetur
								adipiscing elit.</p>
							<div class="recent-work-box">
								<h5>RECENT WORK</h5>
								<ul class="recent-work-list">
									<li><a href="include/images/service-img1.jpg" title="A short description of project"><img
											src="include/images/service-img1.jpg" alt=""
										/></a></li>
								</ul>
							</div>
							<p>
								<a href="portfolio.html" class="btn btn-default">View Portfolio</a> <a href="contact-us.html" class="btn btn-default">Request a
									Quote</a>
							</p>
						</div>
					</div>
				</li>
				</c:forEach>
			</ul>
		</div>
		<!-- Ingredient List Slide start -->
	</div>
</div>
<!-- Category List Slide end -->
