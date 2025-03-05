<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- 
파일 첨부시 유의사항
method는 꼭 포스트 여야 함
enctype은 원래 한글 깨짐 방지에 사용하는 속성인대
파일 첨부시 enctype=="multipart/form-data"를 써야함  
 -->
<form
 method="post" 
 action="upload.do"
 enctype="multipart/form-data"
 eccept-charset="utf-8"
 >
	제목 : <input type="text" name="title"><br>
	내용 <textarea name="content" cols=40 rows=10></textarea><br>
	첨부파일 : <input type="file" name="file1"><br>
	<input type="submit" value="등록">

</form>
<img src="http://127.0.0.1:8080/proj7_file/download.do?filename=a5444ad2f0d80c09e1604e13e90afd21.jpg">

</body>
</html>