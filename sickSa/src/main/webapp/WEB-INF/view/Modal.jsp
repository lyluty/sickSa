<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Test Main</title>

<link href="include/css/bootstrap.css" rel="stylesheet" type="text/css">
<script src="include/js/bootstrap.min.js"></script>
<link
	href='https://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700'
	rel='stylesheet' type='text/css'>
<link href='https://fonts.googleapis.com/css?family=Montserrat:400,700'
	rel='stylesheet' type='text/css'>
<link href="include/css/ionicons.min.css" rel="stylesheet"
	type="text/css">
<link href="include/css/slick.css" rel="stylesheet" type="text/css">
<link href="include/css/animate.css" rel="stylesheet" type="text/css">
<link href="include/css/animsition.min.css" rel="stylesheet"
	type="text/css">
<link href="include/css/magnific-popup.css" rel="stylesheet"
	type="text/css">
<link href="include/css/main.css" rel="stylesheet" type="text/css">
<script src="include/js/modernizr-custom.js"></script>
<script src="include/js/jquery-2.2.2.min.js"></script>

<script>

$(document).ready(function(){
	$("#toOrder").click(function(){

		$("#mModal").modal('show')
	});
});
</script>

</head>
<body>



<!-- Modal -->
<div class="modal" id="mModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">Modal title</h4>
      </div>
      <div class="modal-body">
        ...
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary">Save changes</button>
      </div>
    </div>
  </div>
</div>
	<button type="button" data-toggle="modal" data-target="#mModal">Open Modal</button>



</body>
</html>