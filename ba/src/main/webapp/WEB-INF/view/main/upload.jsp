<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/upload" enctype="multipart/form-data" method="post">
	<input type="file" name="files">
	<input type="submit" value="上传">
</form>
</body>
</html>