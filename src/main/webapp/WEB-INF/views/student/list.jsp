<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 리스트 조회</title>
</head>
<%
	// jsp 안에서 꺽쇠(자바코드)를 안쓰려고 하는 것이고
	// 그것이 Model 2 방식
%>

<body>
	<h1>학생 리스트 조회</h1>
	<!-- 
	만약 출력하고자 하는 데이터가 List객체로 넘어온다면
	for문을 이용하여 하나씩 꺼내어 출력하면 됨.
	자바에서 사용했던 for문을 대체할 수 있는 라이브러리가 존재.
	그것을 JSTL이라고 함.
	 -->
	
	<ul>
		<li>학생 이름 : ${student.name}</li>
		<li>1차 점수 : ${student.firstScore }</li>
		<li>2차 점수 : ${student.secondScore }</li>
	</ul>
	<ul>
		<li>학생 이름 : ${ name}</li>
		<li>1차 점수 : ${firstScore }</li>
		<li>2차 점수 : ${secondScore }</li>
	</ul>
</body>
</html>