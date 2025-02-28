<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 액션 태크 -->
<!-- 
	Class의 클래스를 생성해서
	id를 key
	scope에 setAttribute 해줌
	scope속성을 생략하면 page가 기본값임
 -->
<jsp:useBean id="dto" class="kr.or.human.a.MemberDTO" scope="page"></jsp:useBean>
<jsp:setProperty name="dto" property="id" value="idid"/>
<jsp:setProperty name="dto" property="pw" value="pwpw"/>
\${dto.id} : ${dto.id} <br>
\${dto["id"]} : ${dto["id"]}<br> 
\${dto.pw} : ${dto.pw} <br>
\${dto["pw"]} : ${dto["pw"]} 
<jsp:setProperty name="dto" property="pw" value='<%=request.getParameter("pw") %>'/>
<jsp:setProperty name="dto" property="pw" value='${param.pw} '/><br>
jsp:getProperty: <jsp:getProperty name="dto" property="pw"/><br>

---------------------------
<jsp:useBean id="dto4" class="kr.or.human.a.MemberDTO" scope="page"></jsp:useBean>
<jsp:setProperty name="dto4" property="*"/><br>
${dto4.id} <br>
${dto4.pw} <br>
</body>
</html>