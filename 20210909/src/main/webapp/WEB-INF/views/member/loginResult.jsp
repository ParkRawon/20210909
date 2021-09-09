<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 결과</title>
</head>
<body>
<div align="center">
	<div><h1>${member.id }님 로그인 성공했습니다 : ${member.password }</h1></div><br>
	<div>${member.aa }</div><br>
	<a href="main.do">Home</a>
</div>
</body>
</html>