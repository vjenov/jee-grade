<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>비트 대학</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
<div>
	<h1>회원가입</h1>
	<form id="register_form" action="<%=request.getContextPath()%>/student.do">
		아이디<input type="text" name="id" /> <br/>
		비밀번호<input type="text" name="pw" /> <br/>
		이름<input type="text" name="name" /> <br/>
		주민번호<input type="text" name="ssn" /> <br/>
		<input type="hidden" name="action" value="register"/>
		<input type="hidden" name="dest" value="login"/>
		<input type="submit" id="btn" value = "전송">
	<!--
	주석
	-->
	</form>
</div>
<script>
$('#register_form').submit(function(){
	alert('등록완료');
});
</script>
</body>
</html>
