<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.side{
		display: inline-block;
		border: 1px solid red;
		width: 20%;
	}
	.content{
		display: inline-block;
		border: 1px solid red;
		width: 78%;
		vertical-align: top;
		
	}

</style>
</head>
<body>
<%--
	<%@ import 
	<jsp:include page=""
 --%>
	<!-- header -->
	<div>
<!-- 		헤더 -->
		<tiles:insertAttribute name="header"/>
	</div>
	
	<!-- main -->
	<div>
			<!--side -->
		<div class="side">
				<!--사이드 메뉴 -->
			<tiles:insertAttribute name="side"/>
		</div>
		
		<!--content -->
		<div class="content">
			<!--컨텐츠 -->
			<tiles:insertAttribute name="content"/>
		</div>
	</div>
	
	<!-- footer -->
	<div>
<!-- 		퓨터 -->
		<tiles:insertAttribute name="footer"/>
	</div>

</body>
</html>