<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>제이쿼리 예제</title>
<script type="text/javascript">
	function addImage(){
		$(".box").html("<img src='images/friends.png'>");
		
	}
</script>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.6.0.js"></script>
</head>
<body>
	<input type="button" value="이미지" onclick="addImage()"/>
	<div class="box"></div>
</body>
</html>