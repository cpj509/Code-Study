<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>제이쿼리 예제</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		$("#intro").css("color", "brown");
		$("#pos").css("background", "yellow");
	});
</script>
</head>
<body>
	<h2>Welcome to WebMarket</h2>
	<p id="intro">My Name is Steve</p>
	<p id="pos">나는 캘리포니아에 살고 있다.</p>

</body>
</html>