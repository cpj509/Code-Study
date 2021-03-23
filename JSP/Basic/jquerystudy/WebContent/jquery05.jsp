<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>제이쿼리 예제</title>
<script type="text/javascript" src="js/jquery-3.6.0.js"></script>
<script>
    function fn_process(){
        var value = $("#t_input").val(); //입력 값을 변수에 저장
        $("#t_output").val(value);	//입력 값을 매개로 출력하기
    }
</script>
</head>
<body>
    <input type="text" id="t_input">
    <input type="button" value="입력" onclick="fn_process()">
    <div>
        결과 : <br>
        <input type="text" id="t_output" disabled>
    </div>
</body>
</html>