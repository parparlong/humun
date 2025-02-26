<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="http://127.0.0.1:8080/proj2_calc/req">
	<input type="text" name="num1">
	
	<br>
	<input type="password" name="pw" value="1234"><br>
	<input type="button" name="btn" value="btn1"><br>
	<input type="hidden" name="hidden1" value="hidden11"><br>
	
	<input type="radio" name="radio1" value="radio11"> 라디오1
	<input type="radio" name="radio1" value="radio22"> 라디오2
	<input type="radio" name="radio1" value="radio33"> 라디오3 <br>

	<input type="checkbox" name="checkbox1" value="checkbox11">체크 1
	<input type="checkbox" name="checkbox1" value="checkbox22">체크 2
	<input type="checkbox" name="checkbox1" value="checkbox33">체크 3<br>
	
	<input type="date" name="date1" value="2025-02-26"><br>
	<input type="number" name="number1"><br>
	
	<div name="div1" value="div11">div</div>
	<span name="span1" vlaue="span11">span</span><br>
	<input type="text" name="text1" value="text11" style="display:none">
	<br>
	<select name="select1" vlaue="select11">
		<option value="option1">옵션1</option>
		<option value="option2">옵션2</option>
		<option value="option3">옵션3</option>
	</select>
	<br>
	
	<textarea name="textareal1" value="textareal11">초기값
	엔터
	</textarea>
	<br>	
	
	<input type="submit" value="get 전송">
</form>

<form method="post" action="http://127.0.0.1:8080/proj2_calc/req">
	<input type="text" name="num1">
	<input type="submit" value="post 전송">
</form>

</body>
</html>