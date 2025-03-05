<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<header>
	<div>-------------</div>
	<div>이거 헤더임</div>
	<div>로고 here</div>
	<div>${param.id}님 환영합니다.</div>
	
	<c:if test="${ not mepty param.msg} ">
		<div class="msg">
			아이디나 비빌번호를 확인해주세요
			${ param.msg }
		</div>
	</c:if>
	
	
	
	
</header>


<script>
	const msg = '${ param.msg }'

</script>




</body>
</html>