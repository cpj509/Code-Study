<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="fileupload02_process.jsp" method="post" enctype="multipart/form-data">
		<p>이 름1 : <input type="text" name="name1"/></p>
		<p>제 목1 : <input type="text" name="title1"/></p>
		<p>파 일1 : <input type="file" name="filename1"/></p>
		<p>이 름2 : <input type="text" name="name2"/></p>
		<p>제 목2 : <input type="text" name="title2"/></p>
		<p>파 일2 : <input type="file" name="filename2"/></p>
		<p>이 름3 : <input type="text" name="name3"/></p>
		<p>제 목3 : <input type="text" name="title3"/></p>
		<p>파 일3 : <input type="file" name="filename3"/></p>
		<p><input type="submit" value="파일올리기"/></p>
	</form>
</body>
</html>