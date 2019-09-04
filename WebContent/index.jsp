<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>비트대학</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
<div style = "background-color : blue;">
	<form id="student_form" action="<%=request.getContextPath()%>/student.do"> </form>
	<h2>welcome</h2>
	<table border="1">
		<tr>
			<td>로그인</td>
			<td><input id="btn" type="button" value="LOGIN"/></td>
		</tr>
		<tr>
			<td>학생부 등록</td>
			<td><a id="a_register" href=#>바로가기</a></td>
		</tr>
	</table>
</div>
<script>
$('#btn').click(function(){
	location.assign('<%=request.getContextPath()%>/student.do?action=move&dest=login');
	alert('버튼클릭');
});
$('#a_register').click(function(){
	alert('a태그 클릭');
	location.assign('<%=request.getContextPath()%>/student.do?action=move&dest=register');
});
</script>
</body>
</html>