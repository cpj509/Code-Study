<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>제이쿼리 예제</title>
<script type="text/javascript" src="js/jquery-3.6.0.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		msg1();
		$("#id1").click(function(){
			$("#box").text("안녕하세요.");
			$("#box").css("background", "pink");
			
		})
	});
	
	function msg1(){
		alert("msg1(): 문서 로드 후 자동으로 경고 창을 표시합니다.");
	}
	
</script>
</head>
<body>
	<p><button id="id1">클릭하면 메시지를 변경합니다.</button></p>
	<div id="box">메시지 : </div>
</body>
</html>