<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 로그인</title>
</head>
<body>
	<h2>학생 로그인</h2>
	<form action="/student/login" method="post">
		ID : <input type="text" name="studentId"><br>
		PW : <input type="password" name="studentPw"><br>
		<input type="submit" value="로그인"><br>
	</form>
	
</body>
</html>