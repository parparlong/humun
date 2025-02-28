<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

뭘 써놓았는대 보일까요?
<!-- 액션태그 -->
<jsp:forward page="jsp.jsp" >
	<jsp:param name="id" value="123"/>
</jsp:forward>

</body>
</html>