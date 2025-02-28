<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.List"
    import="java.util.ArrayList"
    import="java.util.*"

    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 스크립틀릿 scriptlet -->
<%
// 여기는 자바 땅입니다
System.out.println("java");
%>

<%
String text = request.getParameter("text");
%>
<h1><%=text%></h1>
<%
out.print(text);
%>
List list = new ArrayList();
<!-- jsp에 직접 text에 1234라는 값을 보내고 jsp에서 html로 그값을 출력하시오  -->

<%@ include file="header.jsp" %>

<!-- 액션 태크  -->
<jsp:include page="header.jsp">
<jsp:param value='minsu' name="id"/>
</jsp:include>







</body>
</html>