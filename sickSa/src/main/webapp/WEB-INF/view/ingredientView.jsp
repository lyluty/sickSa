<!DOCTYPE html>
<html lang="kr">
<head>
<!-- head start -->
<jsp:include page="include-head.jsp" flush="false" />
<script src='include/js/ingredient.js'></script>

<!-- head end -->
</head>
<body>
<div class="animsition"> 
  <!-- nav start -->
  <jsp:include page="include-navigator.jsp" flush="false" />
  <!-- nav end --> 
  
  <!-- header start -->
  <jsp:include page="include-header.jsp" flush="false" />
  <!-- header end --> 
  
  <!-- main-container start -->
  <div class="main-container-outer">
    <div class="container">
      <div class="top-bar-container">
        <div class="container">
          <div class="top-bar">
            <ul class="breadcrumb">
              <li><a href="index.html">Home</a></li>
              <li><span>Ingredients</span></li>
            </ul>
          </div>
        </div>
      </div>
      <div class="main-container">
        <div 
        	class="inner-banner parallax" data-parallax-speed="5">
          <h2>Ingredients Check</h2>
        </div>
        
        <!-- Content Holder Start -->
        <div id="contentHolder" class="content-holder">
        	
        </div>
        <!-- Content Holder End -->
      </div>
    </div>
  </div>
  <!-- main-container end --> 
  
  <!-- footer start -->
  <jsp:include page="include-footer.jsp" flush="false" />
  <!-- footer end --> 
  
</div>

  <!-- tail start -->
  <jsp:include page="include-tail.jsp" flush="false" />
  <!-- tail end -->
  
</body>
</html>